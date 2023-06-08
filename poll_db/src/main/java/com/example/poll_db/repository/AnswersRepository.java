package com.example.poll_db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.poll_db.model.Answers;

public interface AnswersRepository extends JpaRepository<Answers, Long>{
    
}
