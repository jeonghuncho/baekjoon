package baekjoon;
/*
 * Author : Jeonghun Cho
 * Date : December 2, 2019
 * https://www.acmicpc.net/problem/10952
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10952 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String[] str = br.readLine().split(" ");
			if(str[0].equals("0") && str[1].equals("0")) {
				break;
			}
			bw.write(Integer.parseInt(str[0])+Integer.parseInt(str[1])+"\n");
			bw.flush();
		}
		br.close();
		bw.close();
	}
}
