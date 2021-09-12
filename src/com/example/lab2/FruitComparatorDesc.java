package com.example.lab2;

import java.util.Comparator;

public class FruitComparatorDesc implements Comparator<Fruit>{

		public int compare(Fruit o1, Fruit o2) {
			return o2.name.compareTo(o1.name);
		}
}