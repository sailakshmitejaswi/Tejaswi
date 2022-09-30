package com;

import java.security.Permission;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		String name = "Tejaswi";
		int id = 2020;
		float address = 200.30f;
		int salary = 20000;
		list.add(name);
		list.add(id);
		list.add(address);
		list.add(salary);
		
		Iterator it = list.iterator();
		list.forEach(l-> System.out.println(l));
		//System.out.println(person);
		
	}

}

output:: 

Tejaswi
2020
200.3
20000
