package string;
import java.util.Scanner;

public class reverseString {
		public static void main(String[] args){
			Scanner str=new Scanner(System.in);
			String input=str.nextLine();
			//String input="nitesh";

			char[] reverseInput=input.toCharArray();
			for(int i=reverseInput.length-1;i>=0;i--)
			{
				System.out.print( reverseInput[i]);
			}

			System.out.println();
			System.out.println(reverseInput.length);

		}
	}


