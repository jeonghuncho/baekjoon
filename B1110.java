package baekjoon;
/*
 * Author : Jeonghun Cho
 * Date : December 3, 2019
 * https://www.acmicpc.net/problem/1110
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1110 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		if(str.length() == 1) {
			str = "0"+str;
		}
		String answer = str; 
		int cnt = 0;
		while(true) {
			int tens = str.charAt(0)-48; 
			int units = str.charAt(1)-48; 
			int result = tens+units; 
			if(result >= 10) {
				result %= 10; 
			}
			str = units+""+result; 
			cnt++; 
			if(str.equals(answer)) {
				bw.write(cnt+"\n");
				bw.flush();
				break;
			}
		}
	}
}
