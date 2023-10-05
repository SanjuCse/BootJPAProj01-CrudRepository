package com.sanju.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.sanju.entity.Developer;
import com.sanju.service.IDevMgmtService;

@Component
public class DeveloperRunner implements CommandLineRunner {
	@Autowired
	private IDevMgmtService service;

//	@Override
//	public void run(String... args) throws Exception {
//		Developer developer1 = new Developer("manda", "Accenture", "Java Developer", 50000.0);
//		Developer developer2 = new Developer("mahesh", "Capgemini", "Java Developer", 80000.0);
//		Developer developer3 = new Developer("Naaga", "IBM", "Java Developer", 70000.0);
//		Developer developer4 = new Developer("Manoj", "MindTree", "Java Developer", 90000.0);

//		List<Developer> developers = List.of(developer1, developer2, developer3, developer4);
//		List<Developer> developers = List.of(developer1);
//		String msg = service.SaveDevsMutilDetails(developers);
//		System.out.println(msg);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		String msg = service.deleteDevsByIDsCRUD(List.of(102, 103));
//		System.out.println(msg);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		String msg = service.deleteDevsByIDs(List.of(110, 111, 112));
//		System.out.println(msg);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		String msg = service.flush();
//		System.out.println(msg);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		Developer developer = service.fetchADeveloperDetails(109);
//		System.out.println("Developer ID - " + developer.getDid());
//		System.out.println("Developer Name - " + developer.getDName());
//		System.out.println("Developer Domain - " + developer.getDomainName());
//		System.out.println("Developer Company Name - " + developer.getOrgName());
//		System.out.println("Developer Salary - " + developer.getDSalary());
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		Developer developer = service.fetchADeveloperDetails(109);
//		Example<Developer> example = Example.of(developer);
//		List<Developer> developerDetails = service.getAllDeveloperDetails(example, Sort.by("dName"));
//		for (Developer developer2 : developerDetails) {
//			System.out.println("Developer ID - " + developer2.getDid());
//			System.out.println("Developer Name - " + developer2.getDName());
//			System.out.println("Developer Domain - " + developer2.getDomainName());
//			System.out.println("Developer Company Name - " + developer2.getOrgName());
//			System.out.println("Developer Salary - " + developer2.getDSalary());
//		}
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		List<Developer> devs = service.findByName("manda");
//		System.out.println(devs.getClass());
//		devs.forEach(dev -> {
//			System.out.println(dev);
//		});
//		devs.forEach(System.out::println);
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		List<Developer> devs = service.findByNameAndName("sanju", "manda");
//		devs.forEach(System.out::println);
//		System.out.println(devs.size());
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		List<Developer> devs = service.findByNameOrName("manda", "mahesh");
//		devs.forEach(System.out::println);
//		System.out.println(devs.size());
//	}

	@Override
	public void run(String... args) throws Exception {
		List<Developer> devs = service.findBySalaryBetween(70000.0, 80000.0);
		devs.forEach(System.out::println);
		System.out.println(devs.size());

	}
}
