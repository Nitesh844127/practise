package string;
import java.util.Scanner;
public class DeleteDuplicateChar {
	public static void main(String[] args){
		Scanner str=new Scanner(System.in);
		String input=str.nextLine();
		//char ch;
		String ans="";

		for(int i=0;i<input.length();i++){
		     char ch=input.charAt(i);

			if(ans.indexOf(ch)<0){
				ans +=ch;
			}
			}

		System.out.println(ans);
	}
}
