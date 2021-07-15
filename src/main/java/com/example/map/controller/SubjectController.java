package com.example.map.controller;

import com.example.map.entities.Course;
import com.example.map.entities.Subject;
import com.example.map.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping
    public List<Subject> getSubject(){

        return this.subjectService.getSubject();
    }

    @GetMapping("/{subjectId}")
    public Subject getSubject(@PathVariable Long subjectId){
        return this.subjectService.getSubject(subjectId);
    }

    @PostMapping
    public Subject getSubject(@RequestBody Subject subject){
        return this.subjectService.addSubject(subject);
    }

}
