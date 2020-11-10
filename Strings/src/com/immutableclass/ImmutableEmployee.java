package com.immutableclass;

import java.util.HashMap;
import java.util.Iterator;

//made this class as final so that no other class can extends this immutable class
final public class ImmutableEmployee {
	
	private final String empName;
	  private final int age;
	 private final HashMap<String,String> testMap;
	   
	   
	   public ImmutableEmployee(String name, int age ,HashMap<String,String> map) {
	      super();
	      this.empName = name;
	      this.age = age;
	      //create new reference and assign values because if we pass values by reference in constructor there might be chance of changing  values.
	      HashMap<String,String> tempMap=new HashMap<String,String>();
			String key;
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()){
				key=it.next();
				tempMap.put(key, map.get(key));
			}
			this.testMap=tempMap;
	   }
	   public String getEmpName() {
	      return empName;
	   }
	   public int getAge() {
	      return age;
	   }
	public HashMap<String, String> getTestMap() {
		return (HashMap<String, String>) testMap.clone();
	}
	
	public static void main(String[] args) {
		HashMap<String, String> h1 = new HashMap<String,String>();
		h1.put("1", "first");
		h1.put("2", "second");
		
		String name = "adithya";
		
		int age=10;
		
		ImmutableEmployee ce = new ImmutableEmployee(name,age,h1);
		
		//Lets see whether its copy by field or reference
		System.out.println(name==ce.getEmpName());
		System.out.println(h1 == ce.getTestMap());
		//print the ce values
		System.out.println("ce id:"+ce.getAge());
		System.out.println("ce name:"+ce.getEmpName());
		System.out.println("ce testMap:"+ce.getTestMap());
		//change the local variable values
		age=20;
		name="modified";
		h1.put("3", "third");
		//print the values again
		System.out.println("ce id after local variable change:"+ce.getAge());
		System.out.println("ce name after local variable change:"+ce.getEmpName());
		System.out.println("ce testMap after local variable change:"+ce.getTestMap());
		
		HashMap<String, String> hmTest = ce.getTestMap();
		hmTest.put("4", "new");
		
		System.out.println("ce testMap after changing variable from accessor methods:"+ce.getTestMap());

	}
	   
}
