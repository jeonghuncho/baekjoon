package baekjoon;

import java.io.IOException;
import java.util.Scanner;

/*
 * น้มุ 10430
 */
public class b10430 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] array = new int[3];
		for(int i=0; i<3; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println((array[0]+array[1])%array[2]);
		System.out.println((array[0]%array[2]+array[1]%array[2])%array[2]);
		System.out.println((array[0]*array[1])%array[2]);
		System.out.println((array[0]%array[2]*array[1]%array[2])%array[2]);
	}
}
