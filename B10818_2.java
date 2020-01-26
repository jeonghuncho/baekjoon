package baekjoon;
/*
 * Author : Jeonghun Cho
 * Date : December 3, 2019
 * https://www.acmicpc.net/problem/10816
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10818_2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine()); 
		String[] str = br.readLine().split(" "); 
		br.close();
		int[] answer = new int[size]; 
		int maxNumber = -1000000;
		int minNumber = 1000000;
		for(int i=0; i<size; i++) { 
			answer[i] = Integer.parseInt(str[i]); 
			if(maxNumber < answer[i] ) {
				maxNumber = answer[i]; 
			}
			if(minNumber >= answer[i]) {
				minNumber = answer[i];
			}
		}
		System.out.println(minNumber+" "+maxNumber);		
	}
}