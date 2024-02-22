package com.xworkz.drinks1.update;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.drinks1.entity.DrinksEntity;

public class DrinksUpdate {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		try {
			entityTransaction.begin();
			DrinksEntity entity=entityManager.find(DrinksEntity.class, 2);
			entity.setDrinks_name("RRR");
			entityManager.merge(entity);
			
			entityTransaction.commit();
		}catch(PersistenceException e)
		{
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}finally {
			entityManager.close();
			entityManagerFactory.close();
			System.out.println("connection closed");
		}
	}

}
