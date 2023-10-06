package string;

import java.util.Locale;

public class printEachCharacter {
	public static void main(String[] args) {
		String name = "Nitesh";
		//String name=name1.toLowerCase();
		//char[] fullName=name.toCharArray();
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			System.out.println(ch);
		}

	}
}
