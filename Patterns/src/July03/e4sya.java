package July03;
import java.util.Scanner;
public class e4sya {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value");
	int r=sc.nextInt();
	for(int i=1; i<=r; i++) {
		for(int j=1; j<=r-i; j++) {
			System.out.print(" "+" ");

		}
		for(int j=1; j<=i; j++) {
			System.out.print("*"+" ");
		}
		for(int j=2; j<=i; j++) {
			System.out.print("*"+" ");
		}
		System.out.println();
	}
}
}
