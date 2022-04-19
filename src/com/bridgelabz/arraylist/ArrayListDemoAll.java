package com.bridgelabz.arraylist;
import java.util.*;
// collection Framework using by ArrayList we use all type collection set, linkedlist..
public class ArrayListDemoAll {
	public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<>();
		 
	// add operation	 
		 list.add(1);
		 list.add(2);
		 list.add(3);
		 System.out.println("add "+list);
		 
		 //get operation call
		int element= list.get(1);    // get(1) mean Index position
		System.out.println("get "+element);
		
		//Modify or add between;
		list.add(0,4);        //add first index position add 4
		System.out.println("add b/w "+list);
		
// remove or delete		
		list.remove(0);                // remove 0 index position
		System.out.println("remove index position "+list);
//	or	
//		list.removeAll(list);      
//		System.out.println("removeAll"+list);
		
	//size	
		int size = list.size();
		System.out.println("size of arrayList is "+size);
		
		// loops
		for(int i=0; i<list.size();i++) {
			System.out.print(" "+list.get(i));
		}
		System.out.println();
		
		//sorting 
		
		Collections.sort(list);
		System.out.println("Sorting elements " +list);
		
		// map
		Map<Integer,String>map = new HashMap<>();  //Map<Integer, Integer> depend upon you
		map.put(1,"John");
		System.out.println("map "+map);
	}

}
