package baekjoon;

import java.util.Scanner;

public class B10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] iArr = new int[size];
		for(int i=0; i<iArr.length; i++) {
			int first, second;
			first = sc.nextInt();
			second = sc.nextInt();
			System.out.println(first+second);
		}
	}
}
