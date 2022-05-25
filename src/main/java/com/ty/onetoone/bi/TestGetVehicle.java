package com.ty.onetoone.bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGetVehicle {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction  entityTransaction = entityManager.getTransaction() ;
		
		Vehicle vehicle = entityManager.find(Vehicle.class, 4) ;
		
		
		if(vehicle != null) {
			Chassis chassis = vehicle.getChassis() ;
			
			System.out.println("Vehicle ID "+ vehicle.getId());
			System.out.println("Vehicle name "+ vehicle.getName());
			System.out.println("Vehicle cost "+ vehicle.getCost());
			System.out.println("Chassi ID "+ chassis.getId());
			System.out.println("Chassi number "+ chassis.getNumber());
		}
		else {
			System.out.println("no vehicle found");
		}
		
		
	}
}
