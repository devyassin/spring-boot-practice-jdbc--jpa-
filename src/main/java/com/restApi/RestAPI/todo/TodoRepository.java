package com.restApi.RestAPI.todo;

import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository  extends JpaRepository<Todo, Integer> {
        public List<Todo> findByusername(String username);
}
