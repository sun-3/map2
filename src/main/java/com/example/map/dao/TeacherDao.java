package com.example.map.dao;

import com.example.map.entities.Course;
import com.example.map.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherDao extends JpaRepository<Teacher,Long> {

}
