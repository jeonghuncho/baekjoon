package baekjoon;
/*
 * น้มุ 2739
 */
import java.util.Scanner;

public class B2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(input+" * "+i+" = "+input*i);
		}
	}
}