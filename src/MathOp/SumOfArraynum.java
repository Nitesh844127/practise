package MathOp;

public class SumOfArraynum {
	static int arr[] = {12, 13, 4, 6, 8};

	static int sum(){

	int sum = 0;
	int i;
	for(i=0;i<arr.length;i++)
	sum +=arr[i];
	return sum;

}
	public static void main(String[] args) {
		System.out.println(sum());
	}
}
