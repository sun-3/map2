package com.example.map.controller;

import com.example.map.entities.Subject;
import com.example.map.entities.Teacher;
import com.example.map.services.SubjectService;
import com.example.map.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public List<Teacher> getTeacher(){

        return this.teacherService.getTeacher();
    }

    @GetMapping("/{teacherId}")
    public Teacher getTeacher(@PathVariable Long teacherId){
        return this.teacherService.getTeacher(teacherId);
    }

    @PostMapping
    public Teacher addTeacher(@RequestBody Teacher teacher){

        return this.teacherService.addTeacher(teacher);
    }

}
