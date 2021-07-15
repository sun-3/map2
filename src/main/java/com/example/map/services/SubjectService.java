package com.example.map.services;

import com.example.map.entities.Course;
import com.example.map.entities.Subject;

import java.util.List;

public interface SubjectService {
    public List<Subject> getSubject();

    public Subject getSubject(long subjectId);

    public Subject addSubject(Subject subject);

}
