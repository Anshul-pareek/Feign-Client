package com.ebit.project.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ebit.project.controller.model.Parent;

@Repository
public interface HomeRepo extends JpaRepository<Parent, Integer>{

//	Parent save();

//	Parent findById();



}