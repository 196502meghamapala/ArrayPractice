package com.bit.support;

import org.junit.Test;

public class Loops {
	    //while loop
		//do while loop
		//for loop
		//for each OR enhanced
		int a = 1;
		int b = 5;
		
		@Test
		public void whileLoop() {
			//while loop always check the condition then perform the action. 
			//as long as the condition is true, loop will continue 
			
			while(a < b) {
				System.out.println(a);
				a++;
			}
			
		}
		
		@Test
		public void doWhileLoop() {
			//do while loop will do the action at least once then check the condition 
			//as long as the condition is true, loop will continue 
			
			do{
				System.out.println(a);
				a++;
			}
			while(a < b);
			
		}
		
		@Test
		public void forLoop() throws InterruptedException {
			//there are 4 steps in for loop 
			//initialization, condition, action, increment/decrement 
			
			int c = 3;
			int i;
			
			for(i=1; i<c; i++) {
				System.out.println(i);
				
			}
        }
		
		int aa= 5;
		int bb=10;
		
		@Test
		public void loop() {
			for(int i=0; i<=10; i++) {
				System.out.println(i);
			}
		}
		
		
		}
