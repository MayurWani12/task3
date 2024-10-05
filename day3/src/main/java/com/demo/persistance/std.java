package com.demo.persistance;


import jakarta.persistence.Entity;

@Entity
public class std {
	
	
	private int id;
	private String name;
	public std(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "std [id=" + id + ", name=" + name + "]";
	}
	

}
