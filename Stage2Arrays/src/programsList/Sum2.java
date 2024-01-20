package programsList;

public class Sum2 {

	public static void main(String[] args) {
		int target = 5;
		int[] arr = new int[]{1,2,3,-1,-1,1,-2,4,6,7,3,2};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j] == target) {
					System.out.print ("(" + arr[i] + "," + arr[j] + ")\t" ) ;
				}
			}
		}
	}

}
