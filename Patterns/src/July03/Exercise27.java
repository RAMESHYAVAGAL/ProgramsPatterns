package July03;

public class Exercise27 {
public static void main(String[] args) {
	int rows=5;
	for(int i=1; i<=rows; i++) {
		for(int j=1; j<=(rows-i); j++) {
			System.out.print(" "+" ");
		}
		for(int j=1; j<=i; j++) {
			System.out.print(6-j+" ");
		}
		for(int j=(i-1); j>=1; j--) {
			System.out.print(6-j+" ");
		}
		System.out.println();
	}

}
}
