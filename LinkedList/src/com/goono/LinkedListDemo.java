package com.goono;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
        LinkedList<String> countryele=new LinkedList<String>();
           countryele.add("India");
           countryele.add("Nepal");
           countryele.add("Srilanka");
           countryele.add("Banala desh");
           countryele.add("Pakistan");
           new LinkedListDemo().printList(countryele);
           countryele.add(1,"Bragil");
           new LinkedListDemo().printList(countryele);
           countryele.set(5,"Bragil");
           new LinkedListDemo().printList(countryele);
           countryele.remove();
           new LinkedListDemo().printList(countryele);
	}
	public void printList(LinkedList<String> strLL)
	{
		for (String string : strLL) {
			System.out.println(string);
		}
		System.out.println("********************************");
	}
}
