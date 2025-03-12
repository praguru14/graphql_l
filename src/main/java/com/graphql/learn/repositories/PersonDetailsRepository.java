package com.graphql.learn.repositories;


import com.graphql.learn.entities.PersonDetailsEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonDetailsRepository extends JpaRepository<PersonDetailsEntity, Long> {

    @EntityGraph(attributePaths = "perMstWe")
    List<PersonDetailsEntity> findAll();

    PersonDetailsEntity findByPno(String pno);


//    @Query("SELECT p FROM PersonDetailsEntity p JOIN FETCH p.perMstWe")
//    List<PersonDetailsEntity> findAll();
}
