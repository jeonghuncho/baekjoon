package baekjoon;

import java.util.Scanner;

public class B2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour, minute;
		hour = sc.nextInt();
		minute = sc.nextInt();
		if(minute >= 45) {
			minute -= 45;
			System.out.println(hour+" "+minute);
		}else {
			hour--;
			if(hour < 0	) {
				hour = 23;
			}
			minute -=45;
			int result = Math.abs(minute);
			minute = 60-result;
			System.out.println(hour+" "+minute);
		}
	}
}
