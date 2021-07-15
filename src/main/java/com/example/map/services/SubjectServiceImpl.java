package com.example.map.services;

import com.example.map.dao.SubjectDao;
import com.example.map.entities.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectDao dao;


    @Override
    public List<Subject> getSubject() {
        return dao.findAll();
    }

    @Override
    public Subject getSubject(long subjectId) {
        return dao.findById(subjectId).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Subject addSubject(Subject subject) {
        dao.save(subject);
        return subject;
    }
}
