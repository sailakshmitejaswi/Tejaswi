package com;

public class main {

	public static void main(String[] args) {
		//System.out.println("---------------using normalmethod ------------------------------");
		instrument i = new instrument();
		//i.play();
		System.out.println("---------------Without Lambda expressions -------------------------");
		Piano p1 = new Piano() {
			
			@Override
			public void play() {
				System.out.println("Hi Hello Welcome to Piano ");
				
			}			
			
		};
		p1.play();
		System.out.println("---------------Using Lambda expressions -------------------------");
		Piano p=()->System.out.println("I am interested in Piano");
		p.play();
		Guitar g =()->System.out.println("I am interested in Guitar");
		g.play();
	}

}