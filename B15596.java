package baekjoon;
/*
 * Author : Jeonghun Cho
 * Date : December 4, 2019
 * https://www.acmicpc.net/problem/15596
 */
public class B15596 {
	long sum(int[] a) {
		long ans = 0;
		for(int i=0; i<a.length; i++) {
			ans+=a[i];
		}
		return ans;
	}
}
