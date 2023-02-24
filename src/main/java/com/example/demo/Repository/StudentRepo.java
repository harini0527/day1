package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.StudentDemo;

public interface StudentRepo extends JpaRepository<StudentDemo,Integer>{

}