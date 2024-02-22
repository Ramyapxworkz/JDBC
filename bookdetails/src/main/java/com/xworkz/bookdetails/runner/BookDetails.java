package com.xworkz.bookdetails.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.bookdetails.entity.BookEntity;

public class BookDetails {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("connected");
		try {
			entityTransaction.begin();
			BookEntity entity=new BookEntity();
			entity.setId(16);
			entity.setName("SE");
			entity.setAuthor("ZE");
			entity.setPublished("xf");
			entity.setYear(2021);
			entity.setCost(11f);
			entityManager.persist(entity);
			entityTransaction.commit();
		}catch(PersistenceException e) {
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
