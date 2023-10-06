package string;
import java.util.Scanner;
import java.util.HashMap;

public class Occurance_of_word_in_a_string {
	public static void main(String[] args) {
			Scanner str=new Scanner(System.in);
			String str1=str.nextLine();
		//String str1="hi this is hi";
		String[] split=str1.split(" ");
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for (int i=0;i<split.length;i++){
			if(map.containsKey(split[i])){
				int count=map.get(split[i]);
				map.put(split[i],count+1);
			}
			else{
				map.put(split[i],1);
			}

		}
		System.out.println(map);
	}
}
