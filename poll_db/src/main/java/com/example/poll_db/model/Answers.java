package com.example.poll_db.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor 
@AllArgsConstructor
public class Answers extends AbstractPersistable<Long>{
    private String title;
}
