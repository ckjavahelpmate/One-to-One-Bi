package com.ty.onetoone.bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVehicle {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction  entityTransaction = entityManager.getTransaction() ;
			
		Chassis chassis = new Chassis() ;
		chassis.setNumber("KKHHGGU12345HGGJ");
		
		
		Vehicle vehicle = new Vehicle() ;
		vehicle.setName("BMW");
		vehicle.setCost(8000000);
		
		vehicle.setChassis(chassis);
		
		
		entityTransaction.begin();
		
		entityManager.persist(vehicle);
		
		entityTransaction.commit();
	}
}
