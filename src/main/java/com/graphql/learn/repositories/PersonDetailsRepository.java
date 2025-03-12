package com.graphql.learn.repositories;


import com.graphql.learn.entities.PersonDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDetailsRepository extends JpaRepository<PersonDetailsEntity, Long> {
}
