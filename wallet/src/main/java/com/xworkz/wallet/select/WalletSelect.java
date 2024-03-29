package com.xworkz.wallet.select;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.wallet.entity.WalletEntity;

public class WalletSelect {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("findByName");
			query.setParameter("company", "DEF Enterprises");
			Object object= query.getSingleResult();
			WalletEntity entity=(WalletEntity)object;
			entityTransaction.commit();
			System.out.println(entity);
	
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
