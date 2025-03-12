package com.graphql.learn;

import lombok.Data;

@Data
public class PersonDTO {
    private String pno;
    private String firstName;
    private String test;

    public PersonDTO(String pno, String firstName, String test) {
        this.pno = pno;
        this.firstName = firstName;
        this.test = test;
    }
}