package com.demo.persistance;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class test {
	public static void main(String[] args) {

		
		EntityManagerFactory emanager=Persistence.createEntityManagerFactory("Mayur");
		EntityManager esManager =emanager.createEntityManager();
	System.out.println("table created");


	}
	}
