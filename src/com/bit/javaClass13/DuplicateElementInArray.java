package com.bit.javaClass13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.Test;

public class DuplicateElementInArray {
	
	int arr[]= {2,5,3,1,8,7,5,3};

	
	@Test
	public void duplicateElementUsingForloop() {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Dup.Element is ==>"+arr[i]);
				}
			}
		}
	}
	
	@Test
	public void duplicateElementUsingSet() {
		
		Set<Integer> arrSet=new HashSet<>();
		
		for(Integer val: arr) {
			
			if(arrSet.add(val) == false) {
				System.out.println("==>"+val+"  Using HashSet <==");
				
			}
		}
		
	}
	
	@Test
	public void duplicateElementUsingHashMap() {
		HashMap<Integer, Integer> arrMap = new HashMap<>();
		
		for(int i =0; i <arr.length; i++) {
			
			if(arrMap.containsKey(arr[i])) {
				arrMap.put(arr[i], arrMap.get(arr[i])+1);
				} else {
					arrMap.put(arr[i], 1);
				}
			 }
		Set<Map.Entry<Integer, Integer>> entry = arrMap.entrySet();
		
		for(Map.Entry<Integer, Integer> ent: entry) {
			
			if(ent.getValue() > 1) {
				System.out.println("==>"+ent.getKey()+"  Using HashMap");
			}
		}
}
	
	
	

}
