package baekjoon;

import java.io.*;

/*
 * Author : Jeonghun Cho
 * Date : December 2, 2019
 * https://www.acmicpc.net/problem/11022
 */
public class B11022 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine()); 
		for(int i=1; i<=size; i++) {
			String[] str = br.readLine().split(" ");
			int first = Integer.parseInt(str[0]);
			int second = Integer.parseInt(str[1]);
			bw.write("Case #"+i+": "+first+" + "+second+" = "+(first+second)+"\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}

}
