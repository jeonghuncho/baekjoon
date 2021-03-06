package baekjoon;
/*
 * Author : Jeonghun Cho
 * Date : December 2, 2019
 * https://www.acmicpc.net/problem/2438
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class B2438 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int starLen = Integer.parseInt(br.readLine());
		for(int i=1;i<=starLen;i++) { // enter
			for(int j=0; j<i; j++) { // star
				bw.write("*");
				bw.flush();
			}
			bw.write("\n");
		}
	}

}
