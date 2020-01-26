package baekjoon;
/*
 * Author : Jeonghun Cho
 * Date : December 2, 2019
 * https://www.acmicpc.net/problem/2741
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2741 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		for(int i=1; i<=number; i++) {
			System.out.println(i);
		}
	}

}
