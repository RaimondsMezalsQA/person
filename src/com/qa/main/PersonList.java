package com.qa.main;

import java.util.ArrayList;
//import java.util.List;

public class PersonList {
	
	Person personL = new Person();
	
	public ArrayList<Person> personList = new ArrayList<>();
	
	public void setList(Person input) {
		
		personList.add(input);
		
	}
	 public void getList() {
		 
			System.out.println(personList);
		 
	 }
	 
	 public void searchList(int input) {
		 
		 System.out.println(personList.get(input));
		 
	 }
	
	 public void searchByName(String inputName) {
		 
		 
		 for(Person i : personList) {
			 
			 String typedPerson = inputName;
			 String currentPerson = i.getName();
			 
			 //System.out.println(currentPerson);
			 
			 if(typedPerson.equals(currentPerson)) {
				 
				 System.out.println(i);
				 
			 }
			 
		 }
		 
	 }
	 
	 public void streamPOutpus() {
		 
		 personList.stream().forEach( Person -> System.out.println(Person));
		 
	 }
	
	
}
