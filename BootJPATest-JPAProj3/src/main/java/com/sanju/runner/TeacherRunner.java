package com.sanju.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sanju.entity.Teacher;
import com.sanju.service.ITeacherMgmtService;

@Component
public class TeacherRunner implements CommandLineRunner {

	@Autowired
	ITeacherMgmtService service;

//	@Override
//	public void run(String... args) throws Exception {
//		Teacher teacher = new Teacher();
//		teacher.setTName("Aakash");
//		teacher.setGender('M');
//		teacher.setIsTeaching(true);
//		List<String> subjects = List.of("Hibernate", "Spring");
//		teacher.setSubject(Arrays.toString(subjects.toArray()));
//		teacher.setTSalary(50000.0f);
//
//		service.saveTeacherDetails(teacher);
//	}

	@Override
	public void run(String... args) throws Exception {
		List<String> subjects = List.of("Marketing", "Angular Developer");
		Teacher teacher2 = new Teacher("Samir", Arrays.toString(subjects.toArray()), true, 'M', 33000.0f);

		Teacher teacher = new Teacher();
		teacher.setTName("Mohan");
		teacher.setGender('M');
		teacher.setIsTeaching(true);
		List<String> subjects2 = List.of("Hibernate", "Spring");
		teacher.setSubject(Arrays.toString(subjects2.toArray()));
		teacher.setTSalary(25000.0f);

		String msg = service.saveTeachersDetails(List.of(teacher, teacher2));
		System.out.println(msg);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Integer tid = 1005;
//		boolean isAvailble = service.isTeacherAvailble(tid);
//		if (isAvailble) {
//			System.out.println("Teacher found with tid - " + tid);
//		} else {
//			System.out.println("Teacher not found with tid - " + tid);
//		}
//
//		if (isAvailble) {
//			Teacher teacher = service.fetchTeacherDetails(tid);
//			System.out.println("Teacher ID  - " + teacher.getTid());
//			System.out.println("Teacher Subject  - " + teacher.getSubject());
//			System.out.println("Teacher Name  - " + teacher.getTName());
//			System.out.println("Teacher Gender  - " + teacher.getGender());
//			System.out.println("Teacher Salary  - " + teacher.getTSalary());
//			String teachingStatus = teacher.getIsTeaching() ? "Yes Teaching" : "No Teaching";
//			System.out.println("Teacher is Currently Teaching  - " + teachingStatus);
//		}
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		List<Teacher> teachers = service.fetchAllTeacherDetails();
//		for (Teacher teacher : teachers) {
//			if (teacher.getTName() == null) {
//				continue;
//			}
//			System.out.println("-----------------------------------------------------------");
//			System.out.println("Teacher ID  - " + teacher.getTid());
//			System.out.println("Teacher Subject  - " + teacher.getSubject());
//			System.out.println("Teacher Name  - " + teacher.getTName());
//			System.out.println("Teacher Gender  - " + teacher.getGender());
//			System.out.println("Teacher Salary  - " + teacher.getTSalary());
//			String teachingStatus = teacher.getIsTeaching() ? "Yes Teaching" : "No Teaching";
//			System.out.println("Teacher is Currently Teaching  - " + teachingStatus);
//			System.out.println("-----------------------------------------------------------");
//		}
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		List<Integer> listOfID = List.of(1005, 1006, 1007);
//		List<Teacher> teachers = service.fetchAllTeacherDetailsByID(listOfID);
//		for (Teacher teacher : teachers) {
//			if (teacher.getTName() == null) {
//				continue;
//			}
//			System.out.println("-----------------------------------------------------------");
//			System.out.println("Teacher ID  - " + teacher.getTid());
//			System.out.println("Teacher Subject  - " + teacher.getSubject());
//			System.out.println("Teacher Name  - " + teacher.getTName());
//			System.out.println("Teacher Gender  - " + teacher.getGender());
//			System.out.println("Teacher Salary  - " + teacher.getTSalary());
//			String teachingStatus = teacher.getIsTeaching() ? "Yes Teaching" : "No Teaching";
//			System.out.println("Teacher is Currently Teaching  - " + teachingStatus);
//			System.out.println("-----------------------------------------------------------");
//		}
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		long teacherCount = service.fetchTeacherCount();
//		System.out.println("Total Teacher available is - " + teacherCount);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		Integer tid = 1008;
//		String msg = service.deleteATeacher(tid);
//		System.out.println(msg);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		Integer id = 1010;
//		Optional<Teacher> opt = service.fetchTeacherDetails(id);
//		if (opt.isPresent()) {
//			Teacher teacher = opt.get();
//			teacher.setGender('F');
//			String msg = service.deleteATeacher(teacher);
//			System.out.println(msg);
//		} else {
//			System.out.println("Unable to find teacher with specified ID - " + id);
//		}
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		List<Integer> listOfIds = List.of(1014, 1015, 1016, 1017);
//		String msg = service.deleteMultipleTeachersByIDs(listOfIds);
//		System.out.println(msg);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		List<Integer> listOfIDs = List.of(1020, 1021, 1022, 1004);
//		List<Teacher> teachers = service.fetchAllTeacherDetailsByID(listOfIDs);
//
//		List<Integer> unavailableTeachersDetails = new ArrayList<>();
//		for (Teacher teacher : teachers) {
//			Integer id = teacher.getTid();
//			if (service.isTeacherAvailble(id)) {
//				continue;
//			} else {
//				unavailableTeachersDetails.add(id);
//			}
//		}
//		String deleteAllTeacher = service.deleteAllTeacher(teachers);
//		System.out.println(deleteAllTeacher);
//		System.out.println("Unavailable teachers are " + Arrays.toString(unavailableTeachersDetails.toArray()));
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		boolean isRepeat = false;
//		do {
//			System.out.println("Enter Teacher ID for updation!");
//			Integer id = new Scanner(System.in).nextInt();
//			String msg = service.updateATeacherDetail(id);
//			System.out.println(msg);
//
//			System.out.println("Do you want to repeat it ?(Y/N)");
//			String userResponce = new Scanner(System.in).nextLine();
//			if (userResponce.startsWith("Y")) {
//				isRepeat = true;
//			} else {
//				isRepeat = false;
//			}
////			isRepeat = new Scanner(System.in).nextBoolean();
//		} while (isRepeat);
//
//	}
}
