package com.goomo;

import com.goomo.shop.Door;

public class Shop {
     public static void main(String[] args) {
		Door door=new Door();
		door.shopStatus();
		door.getLock().setLock(false);
		door.shopStatus();
	}
}
