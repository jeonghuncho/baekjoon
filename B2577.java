package baekjoon;
/*
 * Author : Jeonghun Cho
 * Date : December 3, 2019
 * https://www.acmicpc.net/problem/2577
 */
import java.io.*;

public class B2577 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = new String[3];
		String result = null;
		int cnt = 0;
		int[] iArr = new int[10];
		for(int i=0;i<str.length;i++) {
			str[i] = br.readLine();
		}
		result =  (Integer.parseInt(str[0]) * Integer.parseInt(str[1]) * Integer.parseInt(str[2]))+""; // 1035
		for(int i=0; i<result.length(); i++) { // 4
			iArr[result.charAt(i) - 48] = iArr[result.charAt(i)-48] += 1;
		}
		for(int i=0; i<iArr.length; i++) {
			bw.write(iArr[i]+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}