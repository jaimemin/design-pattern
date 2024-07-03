package com.tistory.jaimemin.designpattern.behavioral_patterns.state.after;

public interface State {

    void addReview(String review, Student student);

    void addStudent(Student student);
}
