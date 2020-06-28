package sef.module9.activity;
//Needs to be completed

import java.util.*;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		 List namelist = new ArrayList();
		 
		 	namelist.add("John");
			namelist.add("Andrew");
			namelist.add("Jack");
			namelist.add("Boris");
			namelist.add("Ivan");
			
		//2 - Call print method to print the list passed as its parameter.
			ListActivity printList = new ListActivity();	
			printList.print (namelist);
	}
	
	void print(List list)
	{
		Iterator i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		//3 - Type code to print this list
		//Notice the order in which elements get printed.
	
	}
}
