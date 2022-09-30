package com;

public interface Guitar {

	default void play() {
		System.out.println("Hello I am playing Guitar");
	};
}
