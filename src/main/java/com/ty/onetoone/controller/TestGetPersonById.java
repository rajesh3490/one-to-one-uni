package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Person;

public class TestGetPersonById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Person person = entityManager.find(Person.class, 1);
		System.out.println("person id is " + person.getId());
		System.out.println("person name is " + person.getName());
		System.out.println("person age is " + person.getAge());
		System.out.println("person panId is " + person.getPan().getId());
		System.out.println("person panNumber is " + person.getPan().getPanNumber());
		System.out.println("person fatherName is " + person.getPan().getFatherName());
	}

}
