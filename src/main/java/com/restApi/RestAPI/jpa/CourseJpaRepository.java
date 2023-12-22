package com.restApi.RestAPI.jpa;

import com.restApi.RestAPI.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void addCourse(Course course){
        entityManager.merge(course);
    }

    public Course findCourseById(long id){
        return  entityManager.find(Course.class,id);
    }
}
