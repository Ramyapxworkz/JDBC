package com.xworkz.wallet.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.wallet.entity.WalletEntity;

public class WalletInsert {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		try {
			entityTransaction.begin();
			WalletEntity entity=new WalletEntity(1, "ABC Company", 20, "Blue", 10);
			WalletEntity entity1 = new WalletEntity(2, "XYZ Corporation", 30, "Red", 8);
			WalletEntity entity2 = new WalletEntity(3, "DEF Enterprises", 25, "Green", 12);
			WalletEntity entity3 = new WalletEntity(4, "GHI Ltd.", 15, "Yellow", 6);
			WalletEntity entity4 = new WalletEntity(5, "JKL Co.", 35, "Purple", 14);
			entityManager.persist(entity);
			entityManager.persist(entity1);
			entityManager.persist(entity2);
			entityManager.persist(entity3);
			entityManager.persist(entity4);
            entityTransaction.commit();
			
			
		}catch(PersistenceException e) {
			if(entityTransaction.isActive()) {
				entityTransaction.commit();
			}
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
	}

}
