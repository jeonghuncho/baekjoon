package baekjoon;
/*
 * น้มุ 1330
 */
import java.util.Scanner;

public class b1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int first, second;
		first = sc.nextInt();
		second = sc.nextInt();
		if(first > second) {
			System.out.println(">");
		}else if(first < second) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
	}

}
