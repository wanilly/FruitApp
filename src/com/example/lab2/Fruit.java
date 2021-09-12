package com.example.lab2;

import java.util.Comparator;

public class Fruit implements Comparator<Fruit>{
	int no;
	String name;
	int price;
	
	Fruit(){};
	
	public Fruit(int no, String name, int price) {
		this.no = no;
		this.name = name;
		this.price = price;
	
	}
	@Override
	public String toString() {
		return "Fruit[no = " + no + ", name = "+ name +", price = " + price + "]";
	}
	
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setAge(int price) {
		this.price = price;
	}
	
	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.name.compareTo(o2.name);
	}
	

}

