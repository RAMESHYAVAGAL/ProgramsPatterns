package July03;

public class Exercise19 {
	public static void main(String[] args) {
		int rows=5;
		for(int i=1;  i<=rows; i++){
			for(int j=1; j<=(rows-i); j++){
				System.out.print(" "+" ");
		    }
		    for(int j=1; j<=i; j++) {
			System.out.print(i+" ");
	        }
		    System.out.println();
		}
	}
}
