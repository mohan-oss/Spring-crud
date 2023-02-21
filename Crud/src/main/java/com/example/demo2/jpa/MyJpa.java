package com.example.demo2.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo2.entity.Mobile;


public interface MyJpa extends JpaRepository<Mobile,Integer>{

}
