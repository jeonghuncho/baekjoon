package baekjoon;
/*
 * Author : Jeonghun Cho
 * Date : December 5, 2019
 * https://www.acmicpc.net/problem/2908
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2908_2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		int first = Integer.parseInt(new StringBuffer(a).reverse().toString());
		int second = Integer.parseInt(new StringBuffer(b).reverse().toString());
		
		if(first > second) {
			System.out.println(first);
		}else {
			System.out.println(second);
		}
		br.close();		
	}
}
