package array;

public class MaxOfArray {
	public void maxOfArray() {
		int[] arr = {1, 2, 5, 8, 7, 6};
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(" Max of Array is:- " + max);
	}
	public static void main(String[] args) {
		MaxOfArray obj=new MaxOfArray();
		obj.maxOfArray();

	}
}
