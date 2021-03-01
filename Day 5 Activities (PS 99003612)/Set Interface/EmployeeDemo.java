package java6;

import java.util.ArrayList;

import java.util.Collections;

import java.util.HashSet;

 

public class EmployeeDemo {

 

	public static void main(String[] args) {

		// TODO Auto-generated method stub

 

		ArrayList<Employee> al=new ArrayList<Employee>();

		al.add(new Employee("Arun","Associate",28000));

		al.add(new Employee("Sachin","Manager",100000));

		al.add(new Employee("Rohit","Assistant Manager",50000));

		HashSet<String> hs=new HashSet<String>();

		System.out.println(al);

		

		for(Employee e:al) {

			System.out.println(e);

		}

		Collections.sort(al);

		System.out.println("***** After Sorting ****");

		for(Employee e:al) {

			System.out.println(e);

		}

	}

 

}