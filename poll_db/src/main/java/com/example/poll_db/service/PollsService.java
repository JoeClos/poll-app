package com.example.poll_db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.poll_db.model.Polls;
import com.example.poll_db.repository.PollsRepository;

@Service
public class PollsService {
    @Autowired
    private PollsRepository pollsRepository;

    public List<Polls>getAllPolls(){
        return pollsRepository.findAll();
    }
    
}
