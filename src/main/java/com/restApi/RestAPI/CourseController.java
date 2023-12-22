package com.restApi.RestAPI;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retreiveAllCourses(){
        return Arrays.asList(new Course(1,"yassine lamouadden","upCoders"),
              new Course(2,"ahmed","spring boot"),
                new Course(3,"karim","react Js")
        );
    }
}
