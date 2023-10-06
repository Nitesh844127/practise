package array;

public class SumOfArray {
	public void sumOfArray(){
		int sum=0;
		int[] arr={10,5,2,3,25,15};
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

public static void main(String[] args){
	SumOfArray obj=new SumOfArray();
	obj.sumOfArray();
}
}
