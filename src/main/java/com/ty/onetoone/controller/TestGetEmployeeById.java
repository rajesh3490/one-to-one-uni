package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Employee;
import com.ty.onetoone.dto.PfAccount;

public class TestGetEmployeeById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Employee employee = entityManager.find(Employee.class, 1);
		PfAccount pfAccount = employee.getPfAccount();

		System.out.println("employee id is " + employee.getId());
		System.out.println("employee name is " + employee.getName());
		System.out.println("employee email is " + employee.getEmail());
		System.out.println("employee_id is " + employee.getEmployeeId());
		System.out.println("employee phone is " + employee.getPhone());

		if (pfAccount != null) {
			System.out.println("employee's pf account id is " + pfAccount.getId());
			System.out.println("employee's pf account number is " + pfAccount.getPfNumber());
			System.out.println("employee's pf account balance is " + pfAccount.getBalance());
		}
	}

}
