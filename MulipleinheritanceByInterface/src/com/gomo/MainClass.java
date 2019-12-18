package com.gomo;

import com.gomo.person.Person;
import com.gomo.person.Vegan;

public class MainClass {
	public static void main(String[] args) {
		Person person1 = new Vegan();
		person1.breathe();
		person1.message();
		person1.speak();
		person1.eat();
	}
}
