package com.example.new30mindemo.controller;

import com.example.new30mindemo.model.Learnings;
import com.example.new30mindemo.repository.LearnRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/learn")
public class LearnController {
    private final LearnRepo learnRepo;
    @Autowired
    public LearnController(LearnRepo learnRepo) {
        this.learnRepo = learnRepo;
    }

    @GetMapping
    public List<Learnings> getAllDetails(){
        return learnRepo.findAll();
    }


}
