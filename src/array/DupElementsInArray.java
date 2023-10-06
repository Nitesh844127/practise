package array;
import java.util.Scanner;

public class DupElementsInArray {

	public static void main(String[] args) {
	int array[] = new int[]{1, 2, 2, 5, 5};
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

