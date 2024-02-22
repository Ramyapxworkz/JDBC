package com.xworkz.drinks1.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.drinks1.entity.DrinksEntity;

public class DrinksRunner {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("connected");
		try
		{
			entityTransaction.begin();
			DrinksEntity entity=new DrinksEntity();
			entity.setId(2);
			entity.setDrinks_name("HH");
			entity.setCost(300);
			entity.setQuantity(1);
			entityManager.persist(entity);
			entityTransaction.commit();
		}catch(PersistenceException e){
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
