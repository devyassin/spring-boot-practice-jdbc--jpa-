package com.restApi.RestAPI.jpa;

import com.restApi.RestAPI.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJpaRepository repository;



    @Override
    public void run(String... args) throws Exception {

        repository.addCourse(new Course(4,"ahmed ben mouassa","linux"));
        repository.addCourse(new Course(5,"karim ben fahd","redhat"));
        System.out.println(repository.findCourseById(5));
        System.out.println("hello-------------------");
    }
}
