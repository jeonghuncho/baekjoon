package baekjoon;
/*
 * Author : Jeonghun Cho
 * Date : December 3, 2019
 * https://www.acmicpc.net/problem/8958
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B8958 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] size = new int[Integer.parseInt(br.readLine())]; 
		String[] str = new String[size.length]; 
		int count = 0;
		int sum = 0;
		char ch;
		
		for(int i=0; i<size.length; i++) { 	
			str[i] = br.readLine(); 
		}
		for(int i=0; i<size.length; i++) { 
			for(int j=0; j<str[i].length(); j++) { 
				ch = str[i].charAt(j); 
				if(ch == 'O') {
					sum = sum + (++count); 
				}else {
					count = 0; 
				}
			}
			bw.write(sum+"\n");
			sum = 0;
			count = 0;
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
