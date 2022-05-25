package com.ty.onetoone.bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetPerson {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		
		Person person = entityManager.find(Person.class, 5) ;
		
		if( person != null ) {
		Pan pan =	person.getPan() ;
			
			System.out.println("Person Id: "+person.getId());
			System.out.println("Person name: "+person.getName());
			System.out.println("Person email: "+person.getEmail());
			System.out.println("Person phone: "+person.getPhone());
			System.out.println("Person pan id: "+pan.getId());
			System.out.println("Person pan number: "+pan.getPanNumber());
			System.out.println("Person pan address: "+pan.getAddress());
			
		}
		else {
			System.out.println("No Person found");
		}

	}

}
