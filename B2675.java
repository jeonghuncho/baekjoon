package baekjoon;
/*
 * Author : Jeonghun Cho
 * Date : December 6, 2019
 * https://www.acmicpc.net/problem/2675
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2675 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine()); 
		String[] input = new String[size]; 
		
		for(int i=0; i<size; i++) { 	
			input = br.readLine().split(" ");
			for(int j=0; j<input[1].length(); j++) { 
				char ch = input[1].charAt(j);
				for(int k=0; k<Integer.parseInt(input[0]); k++) {
					//System.out.print(ch);
					bw.write(ch);
				}
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
