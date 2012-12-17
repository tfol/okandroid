package com.joseinvest;

public class Gugudan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i =2; i<=9; i++) {
			printDan(i);
			}
				
		
	}

	public static void printDan(int i) {
		for(int j =1; j<10; j++) {

			System.out.println(i + "x" + j + "=" + i*j);
		}
	}

}
