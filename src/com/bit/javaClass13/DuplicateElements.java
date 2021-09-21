package com.bit.javaClass13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.junit.Test;

//Find Duplicate Value From an Array
public class DuplicateElements {
	
	String names[] = {"Java","JavaScript","Ruby","C","Python","Java","Ruby"};

	
	@Test
	public void duplicateValueArrayUsingForLoop() {
	
	//1. compare each element using loop: 0(nxn) --worst solution--not recommended for large amount of data
	for(int i=0; i<names.length; i++) {
		for(int j = i+1; j<names.length; j++) {
			if(names[i].equals(names[j])) {
				System.out.println("Duplicate element is(for loop):" + names[i]);
			}
		}
		}
	}
	//2. Using HashSet: Java Collection: Store Unique values: 0(n)
	@Test
	public void usingSet() {
		Set<String> store = new HashSet<String>();
		for(String name : names) {
			if(store.add(name) == false) {
				System.out.println("duplicate element is(Set):"+name);
			}
			}
		}
	
	//3. Using HashMap: 0(2n)
	@Test
	public void usingHashMap() {
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		
		for(String name : names) {
			Integer count = storeMap.get(name);
			if(count ==null) {
				storeMap.put(name, 1);
			}
			else {
				storeMap.put(name, ++count);
			}
		}
		//get the value from this HashMap
		
		 Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		 for(Entry<String, Integer> entry : entrySet){
			if(entry.getValue()>1) {
				System.out.println("duplicate element is(Hash Map):"+entry.getKey());
			}
		}
	}
}
	
