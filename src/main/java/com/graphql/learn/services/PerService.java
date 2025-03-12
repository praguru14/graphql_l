package com.graphql.learn.services;

import com.graphql.learn.entities.PersonDetailsEntity;
import com.graphql.learn.repositories.PersonDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerService {

    private final PersonDetailsRepository personDetailsRepository;

    public PerService(PersonDetailsRepository personDetailsRepository) {
        this.personDetailsRepository = personDetailsRepository;
    }

    public List<PersonDetailsEntity> getAllDetails() {
        return personDetailsRepository.findAll();
    }

    public PersonDetailsEntity getPersonByPno(String pno) {
        return personDetailsRepository.findByPno(pno);
    }
}
