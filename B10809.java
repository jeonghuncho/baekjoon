package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10809 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine(); // baekjoon 입력
		String str = "abcdefghijklmnopqrstuvwxyz"; // 스펠링
		int[] iArr = new int[input.length()]; // baekjoon 입력 시 크기가 8인 정수형 배열 선언
		int[] alphabet = new int[26]; // 스펠링을 저장할 크기가 26인 정수형 배열 선언
		int count = 0;
		
		
		for(int i=0; i<iArr.length; i++) { // 입력한 문자열을 문자형 배열에 각각 저장
			iArr[i] = input.charAt(i);
		}
		for(int i=0; i<input.length(); i++) { 
			for(int j=0; j<alphabet.length; j++) {
				alphabet[j] = str.charAt(j); 
				if(iArr[i] == alphabet[j]) { 
					alphabet[j] = i; 
					break;
				}
			}
		}
		for(int i=0; i<alphabet.length; i++) {
			System.out.print(alphabet[i]+" ");
		}
		
	}
}
