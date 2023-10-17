package com.example.newChalldemo.controller;

import com.example.newChalldemo.model.Learnings;
import com.example.newChalldemo.repository.LearnRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Learnings createLearn(@RequestBody Learnings learnings){
        return learnRepo.save(learnings);
    }


}
