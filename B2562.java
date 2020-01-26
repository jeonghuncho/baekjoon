package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * Author : Jeonghun Cho
 * Date : December 3, 2019
 * https://www.acmicpc.net/problem/2562
 */
public class B2562 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int maxNumber = Integer.MIN_VALUE;
		int cnt=0;
		int[] iArr = new int[9];
		for(int i=0;i<iArr.length;i++) {
			iArr[i] = Integer.parseInt(br.readLine());
			if(maxNumber < iArr[i]) {
				maxNumber = iArr[i];
				cnt = i+1;
			}
		}
		bw.write(maxNumber+"\n");
		bw.write(cnt+"\n");
		bw.flush();
		bw.close();
	}
}