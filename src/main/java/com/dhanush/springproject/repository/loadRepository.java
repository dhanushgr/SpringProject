package com.dhanush.springproject.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dhanush.springproject.model.load;

public interface loadRepository extends JpaRepository<load, UUID> {
}
