package com.xworkz.wallet.select;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class Wallet {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("findPriceAndSizeByCompany");
			query.setParameter("company", "DEF Enterprises");
			
			Object[] objects= (Object[]) query.getSingleResult();
			int price=(int)objects[0];
			int size=(int)objects[1];
			System.out.println("Price:"+price+" "+"Size: "+size);
			entityTransaction.commit();
			
	
		}catch(PersistenceException e) {
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
	}

}
