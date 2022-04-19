package com.bridgelabz.mapinterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterfaceDemo {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		
		//add methods called put method  //<k,v> k is key and v is value
		map.put("MyName", "Nitish");
		map.put("Actor", "john");
		map.put("Teacher", "Shubham sir");
		map.put("love", "mother");
		System.out.println("add key "+map);              // its hash map not have insertion oder
		
// get method		
		map.get(map);
		System.out.println("Get all current key and value "+map);
		
		// remove method
		map.remove("Actor");
		System.out.println("Remove Actor key "+map);
		
		map.get(map);
		System.out.println("Get all current key and value "+map);
	
		//putAll method
		
		map.putAll(map);
		System.out.println(map);
		
		// putIfAbsentmethod
		//insert the specified key and value ,only if already not specified
		
		map.putIfAbsent("Movies", "johnWick");
		System.out.println(map);
		
		// keySet method ,
		// it return the set view  contain all only key
		Collection<String> set=map.keySet();
		System.out.println("only key contain "+set);
		
		// size method
	    int element=	map.size();
		System.out.println("size "+element);
		
		// replace method , if you want change key value than flow;Key oldValue to change newValue
		map.replace("love", "mother","son");
		System.out.println("replace value but key fixed "+map);
		
		//value () method
		Collection<String> value=	map.values();
		System.out.println("value "+value);
		// clear method
		map.clear();
		System.out.println("clear "+map);
		
		
	
		
	}
}