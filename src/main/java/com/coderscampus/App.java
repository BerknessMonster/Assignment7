package com.coderscampus;

public class App {
	
  public void launch(){
    System.out.println("Hi! Put your code here, for launching your app.");
		
		CustomArrayList<String> jonnyCustomList = new CustomArrayList<>();
		jonnyCustomList.add("This");
		jonnyCustomList.add("is");
		jonnyCustomList.add("the");
		jonnyCustomList.add("best");
		jonnyCustomList.add("way");
		jonnyCustomList.add("to");
		jonnyCustomList.add("bake");
		jonnyCustomList.add("a");
		jonnyCustomList.add("cake");
		jonnyCustomList.add("added item");
		System.out.println("The new array size is " + jonnyCustomList.getSize());
		System.out.println("---------------------");
		System.out.println("The get method works " + jonnyCustomList.get(1));
		System.out.println("---------------------");
		System.out.println("The add method works " + jonnyCustomList.add("Last item"));
		System.out.println("---------------------");
		for (int i = 0; i < jonnyCustomList.getSize(); i++) {
			System.out.println(jonnyCustomList.get(i));
		}
		System.out.println(jonnyCustomList);

	}
  }

