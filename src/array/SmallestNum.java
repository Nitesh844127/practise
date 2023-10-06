package array;

import java.util.Scanner;

public class SmallestNum {
	static int solution(int n) {
		// write your code in Java SE 8
	     n=n+1;
		int r,pr=-1,f=0;
		int t=n;
		while(f==0){
			f=1;
			t=n;
			pr=-1;
			while(t!=0){
				r=t%10;
				if(pr==r)
					f=0;
				t=t/10;
				pr=r;
			}
			if(f!=0){
				f=1;
				return n;
			}
			else
				f=0;
			n++;
		}
		return 0;

	}

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Second Maximum no is :  " + solution(n));
	}
}
