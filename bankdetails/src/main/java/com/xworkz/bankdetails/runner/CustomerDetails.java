package com.xworkz.bankdetails.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.bankdetails.entity.BankEntity;

public class CustomerDetails {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("connected");
		try {
			entityTransaction.begin();
			BankEntity entity=new BankEntity();
			entity.setId(7);
			entity.setName("Kavana");
			entity.setNumber(2345622988l);
			entity.setAddress("bhunji");
			entity.setEmail("cfy@gmail.com");
			entityManager.persist(entity);
			entityTransaction.commit();
		}catch(PersistenceException e) {
		if(entityTransaction.isActive()) {
			entityTransaction.rollback();
		}
		}finally {
			entityManager.close();
			entityManagerFactory.close();
			System.out.println("connection is closed");
		}
	}

}
