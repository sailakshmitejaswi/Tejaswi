package com;

public class instrument implements Piano,Guitar{

	@Override
	public void play() {
		
		System.out.println("I am Playing Piano and Guitar.....");
		ambiguity();
		Piano.super.play();
		
	}
	public void ambiguity(){
		
		System.out.println("There is an Ambiguity here.....");
		
	}
	

}