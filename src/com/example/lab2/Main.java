
package com.example.lab2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
	public static <Fruit> void main(String[] args) {
		List<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("fruit list (ordered by name)");
		Fruit f1 = new Fruit(101, "Apple", 1000);
		fl.add(f1);
		Fruit f2 = new Fruit(102, "Watermelon", 1000);
		fl.add(f2);
		Fruit f3 = new Fruit(103, "Banana", 2000);
		fl.add(f3);
		Fruit f4 = new Fruit(104, "Melon", 1500);
		fl.add(f4);
		Fruit f5 = new Fruit(105, "Kiwi", 3000);
		fl.add(f5);
		Fruit f6 = new Fruit(106, "Tomato", 4000);
		fl.add(f6);
		Fruit f7 = new Fruit(107, "Orange", 2000);
		fl.add(f7);
		Fruit f8 = new Fruit(108, "Sweetberry", 1500);
		fl.add(f8);
		Fruit f9 = new Fruit(109, "Mango", 6000);
		fl.add(f9);
		Fruit f10 = new Fruit(101, "Durian", 1200);
		fl.add(f10);
		
		Collections.sort(fl, new FruitComparator());
		
		for (Fruit s : fl) {
			System.out.println(s.toString());
		}
		System.out.println("Fruit list reverse ordered by name");
		Collections.sort(fl, new FruitComparatorDesc());
		for (int i=0; i<fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}
	}
}