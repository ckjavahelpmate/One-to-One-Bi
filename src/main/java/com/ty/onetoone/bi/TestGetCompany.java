package com.ty.onetoone.bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetCompany {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		
		
		Company company = entityManager.find(Company.class, 2) ;
		
		if( company != null ) {
			Gst gst = company.getGst() ;
			
			System.out.println("Company Id: "+ company.getId());
			System.out.println("Company name: "+ company.getName());
			System.out.println("Company phone: "+ company.getPhone());
			System.out.println("Company web: "+ company.getWeb());
			System.out.println("Gst id : "+ gst.getId());
			System.out.println("Gst number : "+ gst.getGstNumber());
			System.out.println("Gst state : "+ gst.getState());
			System.out.println("Gst country : "+ gst.getCountry());
		}
		else {
			System.out.println("No company found");
		}

	}

}
