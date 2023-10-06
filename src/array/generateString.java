package array;

import java.util.Scanner;

public class generateString {
	static String solution(int n) {
		String ans = " ";
		if (n % 2 != 0) {
			for (int i = 0; i < Math.min(n, 24); i++) {
				ans += (char) ('z' + i);
			}
			if (n > 24) {
				for (int i = 0; i < (n - 24); i++)
					ans += 'a';
			}
		} else {
			for (int i = 0; i < Math.min(n, 25); i++) {
				ans += (char) ('c' + i);
			}
			if (n > 25) {
				for (int i = 0; i < (n - 25); i++)
					ans += 'a';
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int n;

		Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(solution(n));
	}
}
