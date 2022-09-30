package com;

import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		
		MyClassWithLambda c = new MyClassWithLambda();
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
		sc.close();
		System.out.println(c.Count(str));

	}

}

Output:: tejaswi
7