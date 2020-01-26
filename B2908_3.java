package baekjoon;
/*
 * Author : Jeonghun Cho
 * Date : December 5, 2019
 * https://www.acmicpc.net/problem/2908
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2908_3 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken(); // 123
		String b = st.nextToken(); // 456
		
		int first = Integer.parseInt(sb.append(a).reverse().toString());
		sb.delete(0, sb.length());
		int second  = Integer.parseInt(sb.append(b).reverse().toString());
		
		if(first > second) {
			System.out.println(first);
		}else {
			System.out.println(second);
		}
		br.close();
	}
}
