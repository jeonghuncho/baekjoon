package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10809 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine(); // baekjoon �Է�
		String str = "abcdefghijklmnopqrstuvwxyz"; // ���縵
		int[] iArr = new int[input.length()]; // baekjoon �Է� �� ũ�Ⱑ 8�� ������ �迭 ����
		int[] alphabet = new int[26]; // ���縵�� ������ ũ�Ⱑ 26�� ������ �迭 ����
		int count = 0;
		
		
		for(int i=0; i<iArr.length; i++) { // �Է��� ���ڿ��� ������ �迭�� ���� ����
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
