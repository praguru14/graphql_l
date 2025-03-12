package com.graphql.learn.repositories;

import com.graphql.learn.entities.PersonMasterEntity;
import lombok.Data;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerMasterRepository extends JpaRepository<PersonMasterEntity, Long> {

    // JPQL Join Query to fetch master and details together
//    @EntityGraph(attributePaths = "perMstWe")


}



