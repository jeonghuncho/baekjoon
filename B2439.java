package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * Author : Jeonghun Cho
 * Date : December 2, 2019
 * https://www.acmicpc.net/problem/2439
 */
public class B2439 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int starLen = Integer.parseInt(br.readLine()); // 5
		for(int i=1; i<=starLen; i++) {
			for(int j=0;j<starLen-i;j++) {
				bw.write(" ");
			}
		if(starLen-i<starLen) {
			for(int k=starLen; k>starLen-i;k--) {
				bw.write("*");
				bw.flush();
			}
		}
			bw.write("\n");
			bw.flush();
		}
	}
}
