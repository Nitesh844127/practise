package array;

import java.util.Scanner;

public class TargetSum {
	static int twopairSum(int[] arr,int target){
		int n=arr.length;
		int ans=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
					if (target == arr[i] + arr[j] ) {
						ans++;
					}
				}
			}

		return ans;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter array elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("Enter target sum : ");
		int target = sc.nextInt();
		System.out.println(" no. of pair sum is :  " + twopairSum(arr, target));
	}
}
