package com.te.practice.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Sort {

	public static void main(String[] args) {
		Set<Student> list = new HashSet<Student>();
		list.add(new Student(103, "Amith", 35, 21));
		list.add(new Student(101, "Bmith", 45.5, 22));
		list.add(new Student(104, "Cmith", 55.6, 23));
		list.add(new Student(101, "Dmith", 67.2, 24));
		System.out.println(list);
		
		ArrayList<Student> list1 = new ArrayList<Student>(list);
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter 1 for sorting");
		int a = userInput.nextInt();
		while(a==1){
		System.out.println("Select the option to sort");
		
		System.out.println("1.sort by Id");
		System.out.println("2.sort by name");
		System.out.println("3.sort by marks");
		System.out.println("4.sort by age");
		int value = userInput.nextInt();

		System.out.println("------After sorting-----");
		
			switch (value) {
			case 1:
				Collections.sort(list1, new SortById());
				for (Student student : list1) {
					System.out.println(student);
				}
				break;
			case 2:
				Collections.sort(list1, new SortByName());
				for (Student student : list1) {
					System.out.println(student);
				}
				break;
			case 3:
				Collections.sort(list1, new SortByMarks());
				for (Student student : list1) {
					System.out.println(student);
				}
				break;
			case 4:
				Collections.sort(list1, new SortByAge());
				for (Student student : list1) {
					System.out.println(student);
				}
				break;
			default:
				break;
			}
			System.out.println("Enter 1 for sorting again and 0 for exit");
      a = userInput.nextInt();
		}
	}
}
