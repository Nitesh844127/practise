package array;
public class LargestNum {
	public static void main(String[] args) {
		int n = 10, a = 0, b = 1,c=0,sum=0;
		for (int i = 0; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}
			if (c== 0 || c == 1) {
			if (c == 2) {
				sum = 2;

				for (int i = 2; i <= n; i++) {
					if (c % i == 0) {
					}
				else{
							sum = 2;
							sum += c;
						}
						System.out.println(sum);
					}
				}
			}
		}
	}
