package com.restApi.RestAPI.springDataJpa;

import com.restApi.RestAPI.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(9,"ahmed ben chakib","linux 2"));
        repository.save(new Course(10,"karim ben","redhat 2"));
        List<Course> courses =repository.findAll();
        System.out.println(repository.findByAuthor("ahmed ben chakib"));
        System.out.println(repository.findByAuthor(""));
        System.out.println(repository.findByCourse("redhat"));

    }
}
