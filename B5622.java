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
		String input = br.readLine(); // ����� �� �Է�
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // ���ڿ� ����
		String[] alphabetArr = new String[8];  // A-Z���� ������ ũ�Ⱑ 9�� ���ڿ� �迭 ����
		int count = 0, sum = 0;
		br.close();
		
		for(int i=0; i<alphabetArr.length; i++) { 
			// substring()�޼ҵ带 ����ؼ� �� ĭ �������� �߶� �� �� �迭�� ����. ��,�ε����� 5�� 7�� ��츸 �迭�� �� ĭ ����.
			if(i==5 || i==7) {
				alphabetArr[i]=alphabet.substring(count,count+=4);
				continue;
			}
			alphabetArr[i]=alphabet.substring(count,count+=3); 		
		} // for end
		count = 0;
		while(true) { // ����ڰ� �Է��� ���ڿ��� alphabetArr�迭���� ã��
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