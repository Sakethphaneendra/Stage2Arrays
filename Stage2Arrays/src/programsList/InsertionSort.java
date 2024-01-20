package programsList;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int arr[] = new int[] {1,5,36,2,35,2,79,28,58,3520,23,471,1,4,5,68};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp;
					temp=arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
