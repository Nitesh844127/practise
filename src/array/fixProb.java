package array;

import java.util.Scanner;

public class fixProb {
		static int solution(int[] S) {
			int max_sum = 0;
			int current_sum = 0;
			boolean positive = false;
			int n = S.length;
			for (int i = 0; i < n; ++i) {
				int item = S[i];
				if (item < 0) {
					if (max_sum < current_sum) {
						max_sum = current_sum;
						current_sum = 0;
					}
				} else {
					positive = true;
					current_sum += item;
				}
			}
			if (current_sum > max_sum) {
				max_sum = current_sum;
			}
			if (positive) {
				return max_sum;
			}
			return -1;
		}

	public static void main (String args[]){



		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int n = sc.nextInt();

		int[] S = new int[n];
		System.out.println("Enter array elements : ");
		for (int i = 0; i < S.length; i++) {
			S[i] = sc.nextInt();

		}

		System.out.println(" Maximum no is :  " + solution(S));
	}
}
