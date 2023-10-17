package com.example.new30mindemo.controller;

import com.example.new30mindemo.model.Learnings;
import com.example.new30mindemo.repository.LearnRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LearnController {
    private final LearnRepo learnRepo;
    @Autowired
    public LearnController(LearnRepo learnRepo) {
        this.learnRepo = learnRepo;
    }

    @GetMapping("/learn")
    public List<Learnings> getAllDetails(){
        return learnRepo.findAll();
    }

    @PostMapping("/postLearn")
    public Learnings createTopic(@RequestBody Learnings learnings){
        return learnRepo.save(learnings);
    }
}
