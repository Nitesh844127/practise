package string;

public class Number_of_word_in_a_String {
	public static void main(String[] args) {


	String str="hi this is nitesh";
	int count=0;
	for(int i=0;i<str.length()-1;i++){
		if((str.charAt(i)==' ') && (str.charAt(i+1)!= ' ')){
			count++;
		}
	}
		System.out.println("number of words : " +count);
}
}


