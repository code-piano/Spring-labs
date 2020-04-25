package com.capg.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.bean.Employee;
import com.capg.bean.SBU;

public class Tester1 {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("com/capg/cfg/springConfig.xml");
		
		SBU sbu=container.getBean("sbu",SBU.class);

		System.out.println(sbu);
		
	}
}
