package com.example.poll_db.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.AbstractPersistable;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Polls extends AbstractPersistable<Long> {
    private String title;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

    // @OneToMany(mappedBy = "poll_answers")
    // private List<Polls> polls = new ArrayList<>();
}
