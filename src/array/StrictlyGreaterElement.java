package array;

import java.util.Scanner;

public class StrictlyGreaterElement {
	static int StrictlyGreater(int[] arr , int x){
		int Greater=0;
		int count=0;
		for (int i=0;i<arr.length;i++){
			if(arr[i]>x) {
				count++;
			}

//			if(arr[i]>x){
//				Greater=arr[i];
//				break;
//			}

		}
		return count;
	//	return Greater;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n=sc.nextInt();

		int[] arr=new int[n];
		System.out.println(" Enter array elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println(" Enter value of x : ");
		int x=sc.nextInt();
		System.out.println(" Strictly greater value of : " + x + " is " + StrictlyGreater(arr,x));
	}
}
