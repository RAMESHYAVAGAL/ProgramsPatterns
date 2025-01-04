package July03;
import java.util.*;
public class Exercise15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the value of rows");
		int rows;
		rows = sc.nextInt();
		for(int i=1; i<=rows; i++) {
			for(int j=(rows+1-i); j<=rows; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
