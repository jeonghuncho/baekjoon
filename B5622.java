package baekjoon;
/*
 * Author : Jeonghun Cho
 * Date : December 5, 2019
 * https://www.acmicpc.net/problem/5622
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5622 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine(); // 사용자 값 입력
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // 문자열 저장
		String[] alphabetArr = new String[8];  // A-Z까지 저장할 크기가 9인 문자열 배열 생성
		int count = 0, sum = 0;
		br.close();
		
		for(int i=0; i<alphabetArr.length; i++) { 
			// substring()메소드를 사용해서 세 칸 간격으로 잘라서 각 각 배열에 저장. 단,인덱스가 5와 7일 경우만 배열에 네 칸 저장.
			if(i==5 || i==7) {
				alphabetArr[i]=alphabet.substring(count,count+=4);
				continue;
			}
			alphabetArr[i]=alphabet.substring(count,count+=3); 		
		} // for end
		count = 0;
		while(true) { // 사용자가 입력한 문자열을 alphabetArr배열에서 찾기
			char ch = input.charAt(count);
			for(int i=0; i<alphabetArr.length; i++) {
				for(int j=0; j<alphabetArr[i].length(); j++) {
					if(ch == alphabetArr[i].charAt(j)) {
						sum += (i+2);
						count++;
					}
				}
			}
			if(count == input.length()) {
				System.out.println(sum+input.length());
				break;
			}
		}
	}
}