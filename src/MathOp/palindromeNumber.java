package MathOp;


public class palindromeNumber {
	public static void main(String[] args) {
		int num=12121;
		int sum=0,rem,temp=0;
      temp=num;
		while(num>0){
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==sum)
			System.out.println("Palindrome number");
		else
			System.out.println("Not Palindrome");
	}
}
