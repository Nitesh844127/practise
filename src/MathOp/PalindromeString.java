package MathOp;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class PalindromeString {
	public static void main(String[] args) {
		//hashmap example
		HashMap<Integer,String> s=new HashMap<>();
		s.put(2,"Nitesh");//the value store in hashmap is unorder and key value pair this is three type linkedHashmap order preserve tree hashmap is sorting the key
		s.put(1,"Atul");
		s.put(3,"yash");
		System.out.println(s);//1-Atul,2-Nitesh,3-yash
		//linkedHashmapExample
		LinkedHashMap<Integer,String> s1=new LinkedHashMap<>();
		s1.put(2,"Nitesh");
		s1.put(1,"Atul");
		s1.put(3,"yash");
		System.out.println(s1);//2-Nitesh,1-Atul,3-yash


		String str = "yay";
		String reverseStr = "";
		int length = str.length();

		for (int i = length - 1; i >= 0; i--) {
			reverseStr =reverseStr + str.charAt(i);
		}
     if(str.equals(reverseStr)){
	     System.out.println("palindrome String");
     }
	 else
	     System.out.println("Not a PalindromeString");
	}
}
