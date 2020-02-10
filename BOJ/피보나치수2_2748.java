package BOJ;

import java.util.Scanner;

public class 피보나치수2_2748 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long arr[] = new long[91];
		arr[0] = 0;
		arr[1] = 1;
		for(int i=2; i<arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(arr[n]);
	}

}
