package com.example.demo2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="Mobile")
@Entity
public class Mobile {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String model;
	public Mobile() {
		super();
	}
	public Mobile(int id, String name, String model) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", model=" + model + "]";
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
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
}
