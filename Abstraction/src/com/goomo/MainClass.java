package com.goomo;

import com.goomo.persion.NonVegan;
import com.goomo.persion.Person;
import com.goomo.persion.Vegan;

public class MainClass {
	public static void main(String[] args) {
		Person persoV = new Vegan();
		persoV.sppek();
		persoV.eat();
		System.out.println("=========================================");
		Person personnv=new NonVegan();
		personnv.sppek();
		personnv.eat();
	}
}
