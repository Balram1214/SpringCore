package com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Student student = (Student) ac.getBean("s1");

		// list
		List<Integer> list = student.getList();
		list.forEach(System.out::println);
		System.out.println("------------------------------------------------------------------------------");

		// set
		Set<String> set = student.getSet();
		set.forEach(System.out::println);
		System.out.println("------------------------------------------------------------------------------");
		
		// map
		Map<Integer, String> map = student.getMap();
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			String value = map.get(key);
			System.out.println(key + " " + value);
		}
	}

}
