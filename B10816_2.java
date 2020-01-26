package baekjoon;
/*
 * Author : Jeonghun Cho
 * Date : December 3, 2019
 * https://www.acmicpc.net/problem/10816
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10816_2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine()); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0; i<size; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			min = Math.min(min, tmp);
			max = Math.max(max, tmp);
		}
		System.out.println(min+" "+max);
	}
}