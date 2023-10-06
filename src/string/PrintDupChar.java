package string;
import java.util.Scanner;

public class PrintDupChar {
	public static void main(String[] args) {
		String str1 = "Helloword he";
		String str=str1.toLowerCase();
		//Scanner sc=new Scanner(System.in);
		//String str=sc.nextLine();
		int count=0;
		char[] inp=str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
              //count=count+1;
			for (int j =i+1; j < str.length(); j++) {
				if(inp[i] == inp[j]){
					System.out.println(inp[j]);
					count++;
					break;
				}
			}
		}
	}
}
