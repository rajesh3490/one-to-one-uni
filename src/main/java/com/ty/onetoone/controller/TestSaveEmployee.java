package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Employee;
import com.ty.onetoone.dto.PfAccount;

public class TestSaveEmployee {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		PfAccount pfAccount = new PfAccount();
		pfAccount.setPfNumber("CTKPR3NNO");
		pfAccount.setBalance(40000);

		Employee employee = new Employee();
		employee.setName("rajesh");
		employee.setEmployeeId("TER399NMO");
		employee.setEmail("rajesh@testyantra.com");
		employee.setPhone(9550556990l);
		employee.setPfAccount(pfAccount);

		entityTransaction.begin();
		entityManager.persist(employee);
		entityManager.persist(pfAccount);
		entityTransaction.commit();

		System.out.println("data is stored");
	}

}
