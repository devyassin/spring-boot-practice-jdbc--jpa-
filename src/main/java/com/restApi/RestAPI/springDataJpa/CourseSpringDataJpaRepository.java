package com.restApi.RestAPI.springDataJpa;

import com.restApi.RestAPI.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long> {

    List<Course> findByAuthor(String author);
    List<Course> findByCourse(String course);
}
