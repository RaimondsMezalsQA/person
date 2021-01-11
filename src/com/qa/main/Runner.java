package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Person person0 = new Person();
		
		System.out.println(person0.toString());
		
		Person person1 = new Person();
		
		person1.setName("Josh");
		person1.setAge(34);
		person1.setJobTitle("Solicitor");
		
Person person2 = new Person();
		
		person2.setName("Carl");
		person2.setAge(32);
		person2.setJobTitle("Manager");
		
Person person3 = new Person();
		
		person3.setName("Cloe");
		person3.setAge(23);
		person3.setJobTitle("Director");
		
Person person4 = new Person();
		
		person4.setName("Leo");
		person4.setAge(21);
		person4.setJobTitle("QA Consultant");
		
		
		PersonList listP = new PersonList();
		
		listP.setList(person1);
		listP.setList(person2);
		listP.setList(person3);
		listP.setList(person4);
		
		listP.getList();
		listP.searchByName("Leo");
		
		listP.streamPOutput();
		
	}
}
