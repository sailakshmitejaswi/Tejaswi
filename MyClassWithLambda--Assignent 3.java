package com;

public class MyClassWithLambda implements WordCount{

	@Override
	public int Count(String str) {
		
		return str.split("").length;
	}

}
