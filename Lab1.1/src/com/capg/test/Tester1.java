package com.capg.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capg.bean.Employee;

public class Tester1 {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("com/capg/cfg/SpringConfig.xml");
		Employee employ=container.getBean("emp",Employee.class);
		System.out.println("Employee Info");
		System.out.println("-----------------------");
		System.out.println("Employee ID :"+" "+employ.getEmpId());
		System.out.println("Employee Name :"+" "+employ.getEmpName());
		System.out.println("Employee Salary :"+" "+employ.getSalary());
		System.out.println("Employee BU :"+" "+employ.getBusinUnit());
		System.out.println("Employee Age :"+" "+employ.getAge());
	}
}
