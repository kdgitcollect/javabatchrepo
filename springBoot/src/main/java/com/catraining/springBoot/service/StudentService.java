package com.catraining.springBoot.service;

import java.util.Collection;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catraining.springBoot.dao.StudentDao;
import com.catraining.springBoot.entity.Student;

@Service
public class StudentService {
	@Autowired
	private StudentDao studentDao;
	public Collection<Student> getAllStudents(){
		return studentDao.getAllStudents();
	}
	public Student getStudentById(int id){
		return studentDao.getStudentById(id);
	}
	public void updateStudent(Student student){
		studentDao.updateStudent(student);
	}

}