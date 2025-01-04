package July03;
import java.util.*;
public class Pattern5 {
	public static void main(String[] args){
		int k=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		for(int j=1; j<=rows; j++){
		for(int i=1; i<=rows; i++){
		System.out.print(k +" ");
		k++;
		}
		System.out.println();
		}
		}
}
