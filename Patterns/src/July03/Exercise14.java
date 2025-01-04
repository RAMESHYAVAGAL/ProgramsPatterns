package July03;

public class Exercise14 {
public static void main(String[] args) {
	int rows=10;
	for(int i=1; i<=rows; i++) {
		for(int j=(rows+1-i); j<=rows; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
}
