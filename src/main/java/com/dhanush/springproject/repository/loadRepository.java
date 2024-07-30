package com.dhanush.springproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhanush.springproject.model.load;
import java.util.UUID;


public interface loadRepository extends JpaRepository<load, Long>{
    List<load> findByShipperId(UUID shipperId);
}