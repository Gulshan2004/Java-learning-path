package com.gulshan.SPRINGJDBCEx;

import com.gulshan.SPRINGJDBCEx.model.Student;
import com.gulshan.SPRINGJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.sound.midi.SysexMessage;
import java.util.List;

@SpringBootApplication
public class SpringjdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringjdbcExApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setRollNo(101);
		s.setName("Gulshan");
		s.setMarks(78);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> students = service.getStudents();
		System.out.println(students);
	}

}
