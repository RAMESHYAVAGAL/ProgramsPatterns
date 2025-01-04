package July03;

public class Exercise37 {
public static void main(String[] args) {
	for(int i=1; i<=5; i++) {
		for(int j=1; j<=5-i; j++) {
			System.out.print(" "+" ");
		}
		for(int j=i; j>=1; j--) {
			System.out.print(j+" ");
		}
		for(int j=2; j<=i; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	for(int i=4; i>=1; i--) {
		for(int j=1; j<=5-i; j++) {
			System.out.print(" "+" ");
		}
		for(int j=i; j>=1; j--) {
			System.out.print(j+" ");
		}
		for(int j=2; j<=i; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	
}
}
