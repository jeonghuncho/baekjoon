package baekjoon;

import java.util.Scanner;

public class B2884_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour, minute;
		hour = sc.nextInt();
		minute = sc.nextInt();
		
		minute -= 45;
		if(minute < 0) {
			minute += 60;
			hour -= 1;
		}
		if(hour < 0) {
			hour += 24;
		}
		System.out.println(hour+" "+minute);
	}
}
