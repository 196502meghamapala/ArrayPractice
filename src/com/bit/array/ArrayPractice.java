package com.bit.array;

import org.junit.Test;

public class ArrayPractice {
	@Test
	
	public void n() {
	
	String cars[]= new String[3];
	
	cars[0]="BMW";
	cars[1]="Toyota";
	cars[2]="Benz";
	
	for (int i=0; i<cars.length; i++) {
		System.out.println(cars[i]);
		
	}
	System.out.println("                     ");
    System.out.println("+++++++++++");
	System.out.println("                     ");
		
    for (int a=cars.length-1; a>=0; a--) {
    	System.out.println(cars[a]);
    }
	}
	
	@Test
	public void array1() {
		//write a method that
		System.out.println("git purpose");
	}
	
	@Test
	 public void twoDimensionwithForLoop() {
	        int[][] values = { { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 } };
	        
	        System.out.println("Loop Using Enhanced for loop:");
            System.out.println("Elements are :");
	        for(int i=0; i< values.length; i++) {
	            for(int j=0; j< values[i].length; j++) {
	                System.out.print(values[i][j] + "\t");
	            }
	            System.out.println("");
	        }
	    }
	
	@Test
	/**
	 * Program to demonstrate iterating two dimensional array using enhanced for
	 * loop
	 */
	    public void twoDimensionwithEnhancedLoop() {
	        int[][] contents = { { 88, 66, 79 }, { 56, 25, 39 }, { 58, 47, 69 } };
	 
	        System.out.println("                              ");
            System.out.println("Loop Using Enhanced for loop:");
	        for (int[] eachRow : contents) {
	            for (int j : eachRow) {
	                System.out.print(j + "\t");
	            }
	            System.out.println("");
	        }
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

