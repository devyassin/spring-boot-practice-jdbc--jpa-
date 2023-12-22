package com.restApi.RestAPI.course.jdbc;

import com.restApi.RestAPI.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    CourseJdbcRepository jdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        Course course1=new Course(1,"ahmed","spgrin boot");
        Course course2=new Course(2,"yassine","react js");
        Course course3=new Course(3,"karim","laravel");
        Course[] courses={course1,course2,course3};
        Arrays.stream(courses).forEach(course -> {
            jdbcRepository.AddCourse(course);
        });

    }
}
