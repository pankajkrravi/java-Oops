package com.goomo.phone;

public class Oneplus5 implements Phone {
	public String processor() {
		return "SD-835 ";
	}

	@Override
	public String OS() {
		return "Android !!";
	}

	@Override
	public int speedInGB() {
		return 64;
	}
}
