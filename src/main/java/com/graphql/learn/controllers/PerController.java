package com.graphql.learn.controllers;

import com.graphql.learn.entities.PersonDetailsEntity;
import com.graphql.learn.services.PerService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PerController {

    private final PerService perService;

    public PerController(PerService perService) {
        this.perService = perService;
    }

    @QueryMapping
    public List<PersonDetailsEntity> getAllDetails() {
        System.out.println("It ran");
        return perService.getAllDetails();
    }
}
