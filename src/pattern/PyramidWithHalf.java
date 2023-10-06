package pattern;

public class PyramidWithHalf {
		public static void main(String[] args){
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println(" ");
			}
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <= 4 - j + 1; k++) {
					System.out.print("*");
				}
				System.out.println(" ");
			}

		}
	}
