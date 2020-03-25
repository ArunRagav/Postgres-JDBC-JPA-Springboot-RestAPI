package com.javatakies.postgres.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatakies.postgres.model.StudentEntity;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity, Integer>{

}
