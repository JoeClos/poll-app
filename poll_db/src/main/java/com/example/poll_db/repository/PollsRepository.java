package com.example.poll_db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.poll_db.model.Polls;

public interface PollsRepository extends JpaRepository<Polls, Long>{
    
}
