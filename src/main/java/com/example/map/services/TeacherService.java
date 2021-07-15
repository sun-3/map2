package com.example.map.services;


import com.example.map.entities.Teacher;

import java.util.List;

public interface TeacherService {
    public List<Teacher> getTeacher();

    public Teacher getTeacher(Long teacherId);

    public Teacher addTeacher(Teacher teacher);
}
