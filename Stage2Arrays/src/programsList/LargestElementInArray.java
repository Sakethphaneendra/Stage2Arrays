package programsList;

public class LargestElementInArray {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,6,8,34,49,2,67,98,3,24,64,12,43};
		int big=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > big) {
				big = arr[i];
			}
		}
		System.out.println(big);
		

	} 

}


//  Time Complexity : O(n) Loop
