package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class b2588 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int first, second;
		first = sc.nextInt();
		second = sc.nextInt();
		
		solve(first, second);
			
	}
	private static void solve(int first, int second){
		int temp = second;
		while(temp > 0) {
			System.out.println(first * (temp%10));
			temp /= 10;
		}
		System.out.println(first*second);
	}

}
