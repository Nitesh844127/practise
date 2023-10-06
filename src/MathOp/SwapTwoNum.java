package MathOp;

import java.util.Scanner;

public class SwapTwoNum {
	public static void main(String[] args) {
		int x,y,tmp;
		System.out.println(" put x and y ");
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		System.out.println("before Swap x = " + x + " y=  "  + y);
		tmp=x;
		x=y;
		y=tmp;
		System.out.println(" After Swap x= " + x+" y= " + y);
	}
}
