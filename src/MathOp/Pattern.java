package MathOp;

public class Pattern {
	public static void main(String[] args) {
		int i=1,j=4;
		while (i<5){
			while (j>=i){
				System.out.print(" * ");
				j--;
			}
			System.out.println();
			i++;
			j=4;
		}
	}
}
