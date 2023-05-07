package com.demo.APIRest.Spring.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.APIRest.Spring.boot.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
