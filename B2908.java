package baekjoon;
/*
 * Author : Jeonghun Cho
 * Date : December 5, 2019
 * https://www.acmicpc.net/problem/2908
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2908 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputNumber = br.readLine().split(" ");
		br.close();
		for(int i=0; i<inputNumber.length; i++) {
			String temp = inputNumber[i].charAt(0)+""; 
			String temp2 = inputNumber[i].charAt(2)+"";
			inputNumber[i] = temp2+(inputNumber[i].charAt(1)+"")+temp;
		}
		
		if(Integer.parseInt(inputNumber[0]) > Integer.parseInt(inputNumber[1])) {
			System.out.println(inputNumber[0]);
		}else {
			System.out.println(inputNumber[1]);
		}
	}
}