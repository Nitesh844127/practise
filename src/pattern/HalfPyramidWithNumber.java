package pattern;

public class HalfPyramidWithNumber {
	public static void main(String[] args) {
		int g=1;
		int h=4;
	for(int i=1;i<=5;i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print(j);
		}
		System.out.print(g);
		g++;
		System.out.println(" ");
	}
	for(int j=1;j<=4;j++){
		for(int k=1;k<=4-j+1;k++){
			System.out.print(k);
		}
		System.out.print(h);
		h--;
		System.out.println(" ");
	}
}
}
