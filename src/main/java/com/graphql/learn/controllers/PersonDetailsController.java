package com.graphql.learn.controllers;


import com.graphql.learn.entities.PersonDetailsEntity;
//import com.graphql.learn.services.PersonDetailsService;
import com.graphql.learn.repositories.PersonDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonDetailsController {

    @Autowired
    private PersonDetailsRepository personDetailsRepository;

    @GetMapping("/api/person-details")
    public List<PersonDetailsEntity> getAllPersonDetails() {
        return personDetailsRepository.findAll();
    }
}
