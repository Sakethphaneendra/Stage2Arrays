package programsList;
import java.util.Scanner;
public class ArmStrongNumber {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			System.out.print("Enter an Numeber  : ");
			int n = in.nextInt();
			
			int val=0;
			for(int i=0;i<=n;i++) {
				n = n/10;
				val++;
				
			}
			System.out.println(val);
			
		

	}

}
