package com.college.college;

import com.college.college.model.Student;
import com.college.college.service.studentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CollegeApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(CollegeApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setRollNo(1);
		s.setName("john");
		s.setMarks(98);

		studentService service =context.getBean(studentService.class);
		service.addStudent(s);




	}

}
