package com.ty.onetoone.bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCompany {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		Company company = new Company() ;
		company.setName("JAGUAR");
		company.setPhone(998877);
		company.setWeb("www.jaguar.com");
		
		Gst gst = new Gst() ;
		gst.setGstNumber("GSTJAGU123");
		gst.setState("Karnataka");
		gst.setCountry("India");
		
		
		gst.setCompany(company);
		company.setGst(gst);
		
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit();
		
		System.out.println("*************** Done ********************"); 
		

	}

}
