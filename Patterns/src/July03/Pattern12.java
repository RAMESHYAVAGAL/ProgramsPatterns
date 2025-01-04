package July03;
import java.util.*;
public class Pattern12 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows = ");
		int rows = sc.nextInt();
		for(int i=1; i<=rows; i++){
		for(int j=1; j<=i; j++){
		System.out.print((i+j-1)%2 +" ");}
		System.out.println();
		}	
		}
}
