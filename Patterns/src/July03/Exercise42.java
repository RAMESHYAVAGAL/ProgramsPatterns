package July03;

public class Exercise42 {
	public static void main(String[] args) {
		int rows=6;
		int cols=7;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				if((i==1 && j%3==0)||(i==0 && j%3!=0)||(i-j==2)||(i+j==8)) {
					System.out.print("*"+" ");
				}
				else if (i==2 && j==1) {
					System.out.print("R"+" ");
				}
				else if (i==2 && j==2) {
					System.out.print("O"+" ");
				}
				else if (i==2 && j==3) {
					System.out.print("H"+" ");
				}
				else if (i==2 && j==4) {
					System.out.print("I"+" ");
				}
				else if (i==2 && j==5) {
					System.out.print("T"+" ");
				}
				else if (i==3 && j==2) {
					System.out.print("4"+" ");
				}
				else if (i==3 && j==4) {
					System.out.print("5"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		
	}
}

