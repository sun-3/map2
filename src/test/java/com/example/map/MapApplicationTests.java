package com.example.map;

import com.example.map.dao.TeacherDao;
import com.example.map.entities.Teacher;
import com.example.map.services.TeacherService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


@SpringBootTest
class MapApplicationTests {

	@Autowired
	private TeacherService teacherService;

	@MockBean
	private TeacherDao teacherDao;

	@Test
	public void getTeachersTest(){
		when(teacherDao.findAll()).thenReturn(Stream.of(new Teacher(1L,"arsh","a@mail.com"),
				new Teacher(7L,"lupin","lk@mail.com")).collect(Collectors.toList()));
		Assertions.assertEquals(2,teacherService.getTeacher().size());
	}

}
