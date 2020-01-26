package baekjoon;

import java.util.Scanner;

public class B8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int sum = 0;
		for(int i=input; i > 0; i--) {
			sum += i;
		}
		System.out.println(sum);
	}
}
