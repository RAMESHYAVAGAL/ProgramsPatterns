package July03;
import java.util.*;
public class Pattern10 {
	public static void main(String[] args){
		int r=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows = ");
		int rows = sc.nextInt();
		for(int i=1; i<=rows; i++){
		for(int j=1; j<=i; j++){
		System.out.print((char)(r+64)+" ");
		r++;
		}
		System.out.println();
		}	
		}
}