//print dup elements and

package assessment;

public class assessment {
		public static void main(String[] args) {
			int[] arr = new int[]{3, 6, 1, 8, 2, 9};
			int[] array = new int[]{9, 2, 6, 1, 4, 7};

			System.out.println("Duplicate elements are: ");

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < array.length; j++) {
					if (arr[i] == array[j]) {
						System.out.print(arr[i] + " ");
					}
				}
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < array.length; j++) {
					if (arr[i] == array[j]) {
						arr[i] = -1;
						array[j] = -1;
					}
				}
			}
			int ans;
			System.out.println(" ");
			System.out.println("Unique elements are: ");
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > 0) {
					ans = arr[i];
					System.out.print(ans + " ");
				}
			}
			for (int i = 0; i < array.length; i++) {
				if (array[i] > 0) {
					ans = array[i];
					System.out.print(ans + " ");
				}
			}
		}
	}

