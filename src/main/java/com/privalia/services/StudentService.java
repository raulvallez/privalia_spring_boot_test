package com.privalia.services;

import com.privalia.domain.Student;
import com.privalia.domain.Address;

//Interfaz fuertemente tipada
public interface StudentService {
	Iterable<Student> listAllStudent();
	
	Student getStudentById(Integer id);
	
	Student saveStudent(Student student);
	
	void deleteStudent(Integer id);
}
