package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Company;
import com.ty.onetoone.dto.Gst;

public class TestSaveGst {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Company company = new Company();
//		company.setName("testYantra");
//		company.setPhone(9123456789l);

		Gst gst = new Gst();
		gst.setGstNumber("zywqidn");
		gst.setStatus("active");
//		gst.setCompany(company);

		entityTransaction.begin();
		entityManager.persist(gst);
//		entityManager.persist(company);
		entityTransaction.commit();
		System.out.println("data stored");
	}

}
