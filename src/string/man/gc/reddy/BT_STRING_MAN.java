package string.man.gc.reddy;

import org.junit.Test;

public class BT_STRING_MAN {
	
	@Test
	public void test2() {
		//find the second o from "how are you"
		String d = "how are you";
		int d1 = d.indexOf('o');
		System.out.println(d1);
		
		int d2 = d.lastIndexOf('o'); // 
		int d3 = d.lastIndexOf('o', d2-1);
		System.out.println(d.charAt(d3)); //this will get the 2nd o from the string  
	}
	
	@Test
	public void test4() {
		//find the send a from a string 
		String s = "united states if america";
		int s1 = s.indexOf('a');
		int s2 = s.indexOf('a', s1+1);
		System.out.println(s.charAt(s2));
		
	}
	
	@Test
	public void test3() {
		//how to print in reverse order by character 
		String s = "united states if america";
		char s2[] = s.toCharArray();
		
		//Ascending order 
		for(int i=0; i<s2.length; i++) {
			System.out.println(s2[i]);
		}
		
		//Descending order 
		for(int j=s2.length-1; j>=0 ;j--) {
			System.out.println(s2[j]);
		}
		
	}
	
	@Test
	public void test5() {
		//how to divide a string and print by word 
		String s = "how are you";
		String s1[] = s.split(" ");
		for(String s3 : s1) {
			System.out.println(s3);
		}
		//print the same value using for loop
		//print the value in reverse order 
	}
	
	/*
* How to find duplicate value from an array?

Is given word palindrome or not: "MOM"?

Is given word Anagram or not "LOOP"?

How to swap number without declaring third number?

How to find Fibonacci number?

How to find prime number?

How to find factorial value for a number?
	 */
	
	
	@Test
	public void test7() {
		//String buffer VS Builder
		//The main difference between StringBuilder and StringBuffer is StringBuilder is Synchronized and StringBuffer is not synchronized. 
		//Also, StringBuffer is faster than StringBuilder
		StringBuffer sb = new StringBuffer("apple");//is Not synchronized and mutable 
		String sk = sb.toString();
		sk.contains("eue56u");
		sb.append("whats up");
		sb.reverse();
		
		StringBuilder st = new StringBuilder("hii");
		
	}
	
	
	
	
	
	
}


