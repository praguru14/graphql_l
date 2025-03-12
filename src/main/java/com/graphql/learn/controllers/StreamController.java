package com.graphql.learn.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.*;

@RestController
@RequestMapping("/stream")
public class StreamController {

    @GetMapping("/second-highest-salary")
    public ResponseEntity<String> secondHighestSalary() {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 50000),
                new Employee("Alice", 60000),
                new Employee("Bob", 75000),
                new Employee("David", 50000),
                new Employee("Eve", 90000)
        );
        // Implement logic to find the second highest salary
//        Optional<Double> first = employees.stream().map(employee -> employee.getSalary()).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        String longestName = employees.stream().map(i->i.getName()).max(Comparator.comparingInt(i->i.length())).get();
        return ResponseEntity.ok(""+longestName);
    }

    @GetMapping("/top-3-salaries")
    public ResponseEntity<List<Double>> top3Salaries() {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 45000),
                new Employee("Alice", 85000),
                new Employee("Bob", 75000),
                new Employee("David", 95000),
                new Employee("Eve", 90000)
        );
        // Implement logic to find the top 3 salaries

        return ResponseEntity.ok(Arrays.asList());
    }

    // More methods for other challenges can be added here
}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
