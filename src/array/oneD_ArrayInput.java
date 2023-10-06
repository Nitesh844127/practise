package array;
import java.util.Scanner;
public class oneD_ArrayInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elements of an array");
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		/*for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = i; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
				}
				if (count > 1) {
					System.out.println(array[i] + count);
				}
			}
		 */
		for (int i = 0; i < array.length; i++) {
			int k=0;
			for (int j = i; j < array.length; j++) {
				if (array[i] == array[j]) {
					k++;
				}
			}
			if(k>1){
				System.out.println(array[i] + "     " + k);
			}
		}
		}
	}
