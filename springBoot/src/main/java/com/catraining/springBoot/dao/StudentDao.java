package com.catraining.springBoot.dao;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.catraining.springBoot.entity.Student;


@Repository
public class StudentDao {
	
	private static Map<Integer,Student> students;

	static{
		students = new HashMap<Integer, Student>(){
			{put(1,new Student(1,"kunjan","CS"));
			put(2,new Student(2,"gyandip","MS"));
			put(3,new Student(3,"yashwanth","MS"));
			}
		};
	}
	
	public Collection<Student> getAllStudents(){
		return this.students.values();
	}
	public Student getStudentById(int id){
		return this.students.get(id);
	}
	
	public void updateStudent(Student student){
		Student st = students.get(student.getId());
		System.out.println(student.getCourse());
		st.setCourse(student.getCourse());
		st.setName(student.getName());
		students.put(student.getId(), student);
	}
	
	
	
	

}
