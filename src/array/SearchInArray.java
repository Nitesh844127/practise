package array;

public class SearchInArray {
	public void searchinArray() {
		int x = 7;
		int ans = -1;
		int[] arr = {1, 5, 8, 4, 10, 5, 6};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				ans = i;
				break;
			}
		}
		if(ans==-1){
				System.out.println("not found " + ans);
			}else {
			System.out.println("found " + x + " at index of " + ans);
		}
			}



	public static void main(String[] args) {
		SearchInArray obj = new SearchInArray();
		obj.searchinArray();

	}
}
