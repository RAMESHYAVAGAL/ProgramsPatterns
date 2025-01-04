package July03;

public class Exercise43 {
	public static void main(String[] args) {
		int rows=9;
		int cols=9;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				if((i==0)||(i==rows-1)||(j==0)||(j==cols-1)||(i==(rows/2))||(j==cols/2)||(i==j)||(i+j==rows-1)) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
}
	}
