package com.privalia.repositories;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.privalia.configuration.RepositoryConfiguration;
import com.privalia.domain.Student;
import com.privalia.domain.Address;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { RepositoryConfiguration.class}) 
public class StudentRepositoryTest  { 

	@Rule
	public TestName testName = new TestName();

	
    public static final Logger LOGGER = LoggerFactory.getLogger(StudentRepositoryTest.class);
	
	private StudentRepository studentRepository;
	private Student student1 = null;
	private Student student2 = null;
	
	private Address address1 = null;
	private Address address2 = null;
	
	@Autowired
	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Before
	public void setUp() throws Exception {
		student1 = new Student();
		student1.setName("Andrés");
		student1.setSurname("Buenafuente");
		student1.setAddressId("1232");
		studentRepository.save(student1);
		
		address1 = new Address();
		
		
		
		student2 = new Student();
		student2.setName("Lionel");
		student2.setSurname("Messi");
		student2.setAddressId("1233");
		studentRepository.save(student2);	
		
		LOGGER.info("Started Test " + this.testName.getMethodName());
	}
	
	@After
	public void after() throws Exception {
		studentRepository.deleteAll();
		
		LOGGER.info("Started Test " + this.testName.getMethodName());
	}
	
	@Test
	public void testSaveStudent() {
		
		Student student = new Student();
		
		student.setName("Freddie");
		student.setSurname("Mercury");
		student.setAddressId("1111");
		
		assertNull(student.getId());
		studentRepository.save(student);
		
		assertNotNull(student.getId());
	}
	
//	@Test
//	public void testGetAllStudents() {
//		Iterable<Student> students = studentRepository.findAll();
//		long size = students.spliterator().getExactSizeIfKnown();
//		assertEquals(size, 2);
//		
//	}
//	
//	@Test
//	public void testModifyStudent() { 
//		//No haría falta con el TestName
//		//LOGGER.info("Start testModifyStudent Method");
//		
//		student1.setName("Brian");
//		Student updateStudent = studentRepository.save(student1);
//		assertEquals(updateStudent.getName(), "Brian");
//		
//		//No haría falta con el TestName
//		LOGGER.info("Finish testModifyStudent Method");
//	}
//	
//	@Test 
//	public void testRemoveStudent() {
//		studentRepository.delete(student1.getId());
//		assertNull(studentRepository.findOne(student1.getId()));
//	}
//	
//	@Test 
//	//@Ignore
//	public void testFindByStudentId() {
//		
//		assertNotNull(studentRepository.findOne(student1.getId()));
//
//	}
//	
//	@Test
//	public void testFindByDescriptionAndPrice() {
//		assertNotNull(studentRepository.findByNameAndSurname(
//				student1.getName(),
//				student1.getSurname()));		
//	}
//	
//	@Test
//	public void testUpdateStudent() {
//		
//		LOGGER.info("Start testUpdateStudent Method");
//		assertEquals(
//				studentRepository.updateStudent(student1.getId(), "Manuel"),
//				1
//				);
//		LOGGER.info("End testUpdateStudent Method");
//	}
	

	
//	@Test
//	public void testFindByDescription() {
//		List<Student> student= studentRepository.findByDescription("New description");
//		assertNotNull(student.get(0));
//		assertEquals(student.get(0), "New description");
//	}
}
