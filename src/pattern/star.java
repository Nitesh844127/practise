package pattern;

public class star {
	public static void main(String[] args) {
		int k=1 ,n=10;
		for(int i=5;i>=1;i--){
			System.out.print("  ");
			for(int j=i;j<=5;j++) {
				System.out.print(k);
				System.out.print("  ");
				k++;
			}
			 for (int l=5;l>1;l--){
				 System.out.print(n);
				 System.out.print( "  ");
				 n--;
			 }

			System.out.println( " ");
		}
	}
}
