package baekjoon;
/*
 * Author : Jeonghun Cho
 * Date : December 2, 2019
 * E-mail : jeonghun3800@gmail.com
 * https://www.acmicpc.net/problem/15552
 */
import java.io.*;

public class B15552 {
    public static void main(String[] agrs) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	try {
    		int n = Integer.parseInt(br.readLine()); // size
    		for(int i=0; i<n; i++){
    			String[] temp = br.readLine().split(" ");
    			bw.write(Integer.parseInt(temp[0])+Integer.parseInt(temp[1])+"\n");
    		}
    		br.close();
    		bw.flush();
    		bw.close();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}