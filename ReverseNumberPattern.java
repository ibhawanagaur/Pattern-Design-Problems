package Patterns;
import java.util.Scanner;
public class ReverseNumberPattern {

	public static void main(String[] args) {
		System.out.println("Enter the row numbers n = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		while(row<=n) {
			int	column= 1;
			int temp = row;
			while(column<=row) {
					System.out.print(temp);
					column = column+1;
					temp = temp-1;
			}
			System.out.println();
			row = row+1;
		}
	}
}