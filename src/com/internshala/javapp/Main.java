package com.internshala.javapp;

public class Main {

    public static void main(String[] args) {
	String input="sonu";
        		char[] reverseInput=input.toCharArray();

        		for(int i=reverseInput.length-1;i>=0;i--){

        			System.out.print(reverseInput[i]);

        	}
    }
}
