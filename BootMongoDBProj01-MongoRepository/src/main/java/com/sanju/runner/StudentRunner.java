package com.sanju.runner;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sanju.collections.Address;
import com.sanju.collections.Student;
import com.sanju.service.IAddressMgmtService;
import com.sanju.service.IStudentMgmtService;

@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	private IStudentMgmtService studentService;

	@Autowired
	private IAddressMgmtService addresService;

//	@Override
//	public void run(String... args) throws Exception {
////		Address address = new Address("Berhampur", "Ganjam", "Odisha", "India", 761035);
//		Student student = new Student(12345, "sanju", "Bampur");
//		System.out.println(studentService.showInJSON(student));
//	}

//	@Override
//	public void run(String... args) throws Exception {
////		Address address = new Address("Berhampur", "Ganjam", "Odisha", "India", 761035);
//		Student student = new Student(12345, "sanju", "Bampur");
//		Student student2 = new Student(12346, "manda", "Denkanal");
//		Student student3 = new Student(12347, "mahesh", "Denkanal");
//		Student student4 = new Student(12348, "naaga", "Kalahnadi");
//		String msg = studentService.registerStudents(List.of(student, student2, student3, student4));
//		System.out.println(msg);
////		System.out.println(studentService.showInJSON(student));
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		Student student = service.fetchAStudent("64e5fde6a978025e43d2066e");
//		String prettyJson = service.showInJSON(student);
//		System.out.println(prettyJson);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		List<Student> students = studentService.fetchAllStudents();
//		for (Student student : students) {
//			System.out.println(studentService.showInJSON(student));
//		}
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		List<Address> addresses = addresService.fetchAllAddresses();
//		for (Address address : addresses) {
//			System.out.println(addresService.showInJSON(address));
//		}
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		String msg = addresService
//				.registerAddress(new Address(UUID.randomUUID().toString(), "BAM", "Ganjam", "Odisha", "India", 234567));
//		System.out.println(msg);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		String id = "64e5fde6a978025e43d2066e";
//		String msg = studentService.deleteAStudentByID(id);
//		System.out.println(msg);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		String msg = studentService.updateStudentAddrById("64e5f65f5349451c58b06042", "Bampur");
//		System.out.println(msg);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		String msg = studentService.registerStudent(new Student(12345, "sanju", "Bampur"));
//		System.out.println(msg);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		List<Student> students = studentService.showStudentsBySorting(true, "sRegNo");
//		students.forEach(student -> {
//			try {
//				System.out.println(studentService.showInJSON(student));
//			} catch (JsonProcessingException e) {
//				e.printStackTrace();
//			}
//		});
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		List<Student> students = studentService.findBySname("sanju");
//		for (Student student : students) {
//			System.out.println(studentService.showInJSON(student));
//		}
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		List<Student> lists = studentService.findByName("sanju");
//		for (Student student : lists) {
//			System.out.println(studentService.showInJSON(student));
//		}
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		List<Student> students = studentService.findByRegNo(12347);
//		for (Student student : students) {
//			System.out.println(studentService.showInJSON(student));
//		}
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		List<Student> students = studentService.findByRegNoBetweenStartToEnd(12344, 12349);
//		for (Student student : students) {
//			System.out.println(studentService.showInJSON(student));
//		}
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		List<Student> students = studentService.findByNameAndRegNo("mahesh", 12345);
//		for (Student student : students) {
//			System.out.println(studentService.showInJSON(student));
//		}
//	}

	@Override
	public void run(String... args) throws Exception {
		List<Student> students = studentService.findByRegNoLessThan(12347);
		for (Student student : students) {
			System.out.println(studentService.showInJSON(student));
		}
	}
}
