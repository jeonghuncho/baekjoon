package baekjoon;
/*
 * Author : Jeonghun Cho
 * Date : December 2, 2019
 * https://www.acmicpc.net/problem/10871
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10871 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" "); 
		int size = Integer.parseInt(str[0]); 
		int point = Integer.parseInt(str[1]); 
		String[] input = br.readLine().split(" ");
		for(int i=0; i<size; i++) {
			int result = Integer.parseInt(input[i]);
			if(result < point) {
				bw.write(result+" ");
			}
		}
		bw.flush();	
		bw.close();
		br.close();
	}
}

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//    	   	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    	   	StringTokenizer st = new StringTokenizer(br.readLine());
//    	   	StringBuilder bd = new StringBuilder();
//    	   	int n1 = Integer.parseInt(st.nextToken());
//    	   	int n2 = Integer.parseInt(st.nextToken());
//    	   	
//    	   	StringTokenizer num_line = new StringTokenizer(br.readLine());
//    	   	
//    	   	for(int i=0; i<n1; i++) {
//    	   		int output_num_line = Integer.parseInt(num_line.nextToken());
//    	   		if(output_num_line<n2) {
//    	   			bd.append(output_num_line).append(" ");
//    	   		}
//    	   	}
//    	   	System.out.print(bd);
//
//    	   	
//    	}
//}