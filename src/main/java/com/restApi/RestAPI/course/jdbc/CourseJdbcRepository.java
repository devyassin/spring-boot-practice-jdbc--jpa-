package com.restApi.RestAPI.course.jdbc;

import com.restApi.RestAPI.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;
    private  static String INSERT_QUERY= """
            
            insert into course(id,name,author) 
            values(?,?,?);
            
            """;


    public void AddCourse(Course course){

        springJdbcTemplate.update(INSERT_QUERY,course.getId(),course.getCourse(),course.getAuthor());
    }

    public Course getCourseById(long id){
        return springJdbcTemplate.queryForObject("select * from course where id=?",new BeanPropertyRowMapper<>(Course.class),id);
    }
}
