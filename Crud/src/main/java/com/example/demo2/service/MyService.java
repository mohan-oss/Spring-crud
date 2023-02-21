package com.example.demo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo2.entity.Mobile;
import com.example.demo2.jpa.MyJpa;

@Service
public class MyService {
	@Autowired
	public MyJpa jpa;
	public Mobile saveProduct(Mobile m) {
		return jpa.save(m);
	}
	public List<Mobile> saveAllProducts(List<Mobile> mlist){
		return jpa.saveAll(mlist);
	}
	public String deleteProduct(int id) {
		jpa.deleteById(id);
		return "deleted product with Id: "+id;
	}
	public Mobile getById(int id) {
		// TODO Auto-generated method stub
		return jpa.findById(id).orElse(null);
	}
	public List<Mobile> getAll() {
		// TODO Auto-generated method stub
		return jpa.findAll();
	}
	
	
}
