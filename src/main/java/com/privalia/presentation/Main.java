package com.privalia.presentation;

import java.util.Scanner;
import org.apache.log4j.Logger;
import com.privalia.model.Student;
import com.privalia.util.MethodInfo;

public class Main {

	static final Logger logger = Logger.getLogger(Main.class);

	@MethodInfo(author = "Ferran", revision = 4, comments = "Comentari", date = "22/09/2017")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int option = 0;
		
		while (option != 2) {
			logger.info("Main menu");
			logger.info("1 - New Student");
			logger.info("2 - Exit");
			logger.info("");
			logger.info("Please, select an option.");
			option = scanner.nextInt();

			switch (option) {
			case 1:
				/*
				 * New menu: Name Surname Id Age
				 */
				logger.info("New student form");
				logger.info("");
				logger.info("Please, tip the student's name:");
				String name = scanner.next();
				logger.info("Please, tip the student's surname:");
				String surname = scanner.next();
				logger.info("Please, tip the student's id:");
				int id = scanner.nextInt();
				logger.info("Please, tip the student's age:");
				int age = scanner.nextInt();

				Student student1 = new Student(id, name, surname, age);
				/*
				 * Print all
				 */
				logger.info("student1 name: " + student1.getName());
				logger.info("student1 surname: " + student1.getSurname());
				logger.info("student1 id: " + student1.getIdStudent());
				logger.info("student1 age: " + student1.getAge());
				break;
			case 2:
				break;
			default:
				logger.info("The selected option is not in the scope.");
				logger.info("");
				break;
			}
		}
	}
}