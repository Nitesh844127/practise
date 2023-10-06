package com.internshala.javapp;

public class subStringPrint {
	public static void main(String[] args){

		String nam1="nitya";
        String nam2="nisha";

		System.out.println(nam1.length());//print length of the string

		System.out.println(nam1.charAt(3));//print char at index no.

		System.out.println(nam2.replace('a','u'));//replacing char

		System.out.println(nam2.substring(1,5));//print substring value

for (int i=0;i<=nam1.length();i++){
	System.out.println(nam1.charAt(i));
}
	}

}
