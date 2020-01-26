package baekjoon;

import java.io.*;

/*
 * Author : Jeonghun Cho
 * Date : December 2, 2019
 * https://www.acmicpc.net/problem/11021
 */
public class B11021 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine()); 
		for(int i=1; i<=size; i++) {
			String[] str = br.readLine().split(" ");
			int result = Integer.parseInt(str[0])+Integer.parseInt(str[1]);
			bw.write("Case #"+i+": "+result+"\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}

}
