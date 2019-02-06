package edu.ucm;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.ucm.model.Department;
import edu.ucm.model.Faculty;
import edu.ucm.model.Scheduler;
import edu.ucm.repository.UcmRepository;

@SpringBootApplication
public class UcmApplication  {

	@Autowired
	private UcmRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(UcmApplication.class, args);
	}

	public void run(String... args) throws Exception {

		Scheduler scheduler = new Scheduler();
		scheduler.setDate(new Date().toString());
		scheduler.setSubject("Java");
		scheduler.setDescription("this is first class");

		Department department = new Department();
		department.setName("MS");
		department.setDescription("this is MS");
		scheduler.setDepartment(department);

		Faculty faculty = new Faculty();
		faculty.setFirstName("indeevar");
		faculty.setLastName("tummala");
		faculty.setMobileNumber("5714650091");
		faculty.setEmail("indeevar.reddy9@gmail.com");
		faculty.setSpecialization("MSC");
		scheduler.setFaculty(faculty);

		repository.save(scheduler);

	}

}
