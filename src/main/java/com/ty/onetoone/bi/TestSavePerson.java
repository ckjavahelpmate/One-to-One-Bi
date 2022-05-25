package com.ty.onetoone.bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePerson {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction  entityTransaction = entityManager.getTransaction() ;

		Pan pan = new Pan() ;
		pan.setPanNumber("KASR456RODA");
		pan.setAddress("KASARAGODU");

		Person person = new Person() ;
		person.setName("KAVYA");
		person.setEmail("Kav@mailcom");
		person.setPhone(12346678);
		
		
		person.setPan(pan);
		pan.setPerson(person);


		entityTransaction.begin();
		entityManager.persist(pan);
		entityManager.persist(person);
		entityTransaction.commit();
		
		System.out.println("***************** Done **********************");



	}

}
