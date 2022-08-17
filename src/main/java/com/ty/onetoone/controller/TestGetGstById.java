package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Company;
import com.ty.onetoone.dto.Gst;

public class TestGetGstById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Gst gst = entityManager.find(Gst.class, 3);

		System.out.println("Gst id is " + gst.getId());
		System.out.println("Gst number is " + gst.getGstNumber());
		System.out.println("Gst status is " + gst.getStatus());

		Company company = gst.getCompany();
		if (company != null) {
			System.out.println("company name is " + company.getName());
			System.out.println("company id is " + company.getId());
			System.out.println("company phone is " + company.getPhone());
		}

	}

}
