package MathOp;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		int tmp,num;
				boolean isPrime=true;
				Scanner in =new Scanner(System.in);
				num=in.nextInt();
				in.close();
				for (int i=2;i<=num/2;i++){
					tmp=num%i;
					if(tmp==0){
						isPrime=false;
						break;
			}
		}
		if (isPrime)
			System.out.println(num + " num is  prime");
		else
			System.out.println(num + " num is not prime");
	}
}
