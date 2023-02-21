package com.example.demo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.entity.Mobile;
import com.example.demo2.service.MyService;

@RestController
public class MyController {
	@Autowired
	private MyService service;
	@GetMapping("/hi")
	public String hello() {
		System.out.println("hello");
		return "hello";	
	}
	@PostMapping("/save")
	public Mobile save(@RequestBody Mobile mobile) {
		return service.saveProduct(mobile);
	}
	@PostMapping("/saveAll")
	public List<Mobile> saveAll(@RequestBody List<Mobile> mobile) {
		return service.saveAllProducts(mobile);
	}
	@GetMapping("/getAll")
	public List<Mobile> getAll(){
		System.out.println("working!");
		return service.getAll();
	}
	@GetMapping("/getById/{id}")
	public Mobile getById(@PathVariable(name="id") int id){
		return service.getById(id);
	}
	@DeleteMapping("/deleteById/{id}")
	public String deleteById(@PathVariable(name="id") int id) {
		return service.deleteProduct(id);
	}
}
