package assessment;
import java.util.Scanner;

public class LuckyDraw {

	public static void main(String[] args) {
		//int input=1230;
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int sum = 0;
		if (input >= 1000 ) {
				for (int i = 0; i < 2; i++) {
					int rem = 0;
					rem = input % 10;
					sum += rem;
					input /= 10;
				}
				if (sum == 3 || sum == 8) {
					System.out.println("Lucky draw winner");
				} else {
					System.out.println("not a lucky draw winner");
				}
			}

		else {
			System.out.println("enter 1000 to 2000 betweeen number ");
		}
	}
}
