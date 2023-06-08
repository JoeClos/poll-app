package com.example.poll_db.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.poll_db.model.Answers;
import com.example.poll_db.model.Polls;
import com.example.poll_db.repository.PollsRepository;
import com.example.poll_db.service.AnswersService;
import com.example.poll_db.service.PollsService;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping()


public class HomeController {

    @RequestMapping("/")
    public String welcome() {
        return "Welcome to our Poll :)!";
    }

    @Autowired
    PollsService pollsService;

    @Autowired
    AnswersService answersService;

    @GetMapping("/polls")
    public List<Polls> getAll() {
        return pollsService.getAllPolls();
    }

    @GetMapping("/answers")
    public List<Answers> getAnswers() {
        return answersService.getAllAnswers();
    }

    @PostMapping("/answers")
    public List<Answers> saveAnswer(@ModelAttribute("answers") Answers answers) {
        answersService.addAnswer(answers);
        return answersService.getAllAnswers();
    }
}
