package July03;

public class Exercise26 {
	public static void main(String[] args) {
		int rows=5;
		for(int i=1;  i<=rows; i++){
			for(int j=1; j<=(rows-i); j++){
				System.out.print(" "+" ");
		    }
		    for(int j=i; j>=1; j--) {
			System.out.print(j+" ");
	        }
		    System.out.println();
		}
	}
}
