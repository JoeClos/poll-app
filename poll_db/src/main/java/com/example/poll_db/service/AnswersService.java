package com.example.poll_db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.poll_db.model.Answers;
import com.example.poll_db.repository.AnswersRepository;

@Service
public class AnswersService {

    @Autowired
    AnswersRepository answersRepository;

    public List<Answers>getAllAnswers(){
        return answersRepository.findAll();
    } 

    public void addAnswer(Answers answers){
        answersRepository.save(answers);
    }
}
