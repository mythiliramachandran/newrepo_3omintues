package com.example.new30mindemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Learnings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String topics;

    public Learnings() {
    }


    public Learnings(String topics) {
        this.topics = topics;
    }

    public Long getId() {
        return id;
    }

    public String getTopics() {
        return topics;
    }
}
