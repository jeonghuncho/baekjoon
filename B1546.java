package baekjoon;
/*
 * Author : Jeonghun Cho
 * Date : December 3, 2019
 * https://www.acmicpc.net/problem/1546
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1546 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] size = new int[Integer.parseInt(br.readLine())]; 
		String[] str = br.readLine().split(" "); 
		double dSize = 0.0, maxSize = 0.0, sum = 0.0;
		for(int i=0; i<size.length; i++) { 
			size[i] = Integer.parseInt(str[i]); 
			if(maxSize < size[i]) { 
				maxSize = size[i];
			}
		}
		for(int i=0; i<size.length; i++) { 
			sum += size[i]/maxSize*100;
		}
		bw.write(sum/size.length+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
