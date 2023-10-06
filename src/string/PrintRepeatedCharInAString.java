package string;
import java.util.Scanner;

public class PrintRepeatedCharInAString {
		public static void main(String[] args) {
			// write your code here
			//  Scanner sc=new Scanner(System.in);
			//  System.out.println("enter letter");
			//String s=sc.nextLine();
			String s1="java hello world";
			String s =s1.toLowerCase();
			for(char ch='a'; ch<='z';ch++) {
				int c = 0;
				for (int i = 0; i < s.length(); i++) {
					if (ch == s.charAt(i))
						c++;
				}
				if (c > 1) {
					System.out.println(ch);
			}
		}
	}
}
