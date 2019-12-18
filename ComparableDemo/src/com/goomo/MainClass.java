package com.goomo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class State implements Comparable<State> {
	private String stateNames;

	public State(String stateNames) {
		this.stateNames = stateNames;
	}

	/*
	 * @Override public int compareTo(State obj) { if (stateNames.length() ==
	 * obj.stateNames.length()) return 0; else if (stateNames.length() <
	 * obj.stateNames.length()) return -1; return 1; }
	 */
	@Override
	public int compareTo(State obj) {
		if (stateNames.length() == obj.stateNames.length())
			return 0;
		else if (stateNames.length() < obj.stateNames.length())
			return 1;
		return 11;
	}

	@Override
	public String toString() {
		return "State [stateNames=" + stateNames + "]";
	}

}

public class MainClass {
	public static void main(String[] args) {
		List<State> statename = new LinkedList<State>();
		statename.add(new State("Karnataka"));
		statename.add(new State("BIHar"));
		statename.add(new State("AP"));
		statename.add(new State("JH"));
		statename.add(new State("TN"));
		MainClass class1 = new MainClass();
		class1.printList(statename);
	}

	public void printList(List<State> str) {
		ListIterator<State> iterator = str.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element :" + iterator.next());
		}
	}
}
