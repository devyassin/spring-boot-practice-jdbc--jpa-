package com.restApi.RestAPI;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "course")
public class Course {

    @Id
    private long id;
    @Column(name = "author")
    private String author;
    @Column(name = "name")
    private String course;

    public  Course(){

    }
    public Course(long id, String author, String course) {
        this.id = id;
        this.author = author;
        this.course = course;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
