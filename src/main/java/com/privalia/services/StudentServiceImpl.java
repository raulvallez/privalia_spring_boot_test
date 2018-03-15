package com.privalia.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.privalia.domain.Address;
import com.privalia.domain.Student;
import com.privalia.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private StudentRepository studentRepository;
	
	
	@Autowired
	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	@Override
	public Iterable<Student> listAllStudent() {
		logger.debug("listAllStudents called");
		return studentRepository.findAll();
	}
	
	@Override
	public Student getStudentById(Integer id) {
		logger.debug("getStudentById called");
		return studentRepository.findOne(id);
	}
	
	@Override
	public Student saveStudent(Student student) {
		logger.debug("saveStudent called");
		return studentRepository.save(student);
	}


	@Override
	public void deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		logger.debug("deleteStudent called");
		studentRepository.delete(id);
	}}
