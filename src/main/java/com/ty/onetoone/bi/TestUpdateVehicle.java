package com.ty.onetoone.bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateVehicle {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction  entityTransaction = entityManager.getTransaction() ;
		
		Vehicle vehicle = entityManager.find(Vehicle.class, 4) ;
		
		
		if(vehicle != null) {
			vehicle.setName("BMW-Z");
			vehicle.setCost(180000);
			
			entityTransaction.begin();
			
			entityManager.merge(vehicle) ;
			
			entityTransaction.commit();
		}
		else {
			System.out.println("no vehicle found");
		}
		
		
	}
}
