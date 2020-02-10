package BOJ;

import java.util.Scanner;

public class 정수삼각형_1932 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n + 1];
		int depthCount = 0;
		for (int i = 1; i <= n; i++) {
			depthCount++;
			if (i == 1) {
				arr[i] = sc.nextInt();
				continue;
			}
			int temp[] = new int[n + 1];
			for (int j = 1; j <= depthCount; j++) {
				if (j == 1)
					temp[j] = arr[j] + sc.nextInt();
				else if (j == depthCount)
					temp[j] = arr[j - 1] + sc.nextInt();
				else
					temp[j] = Math.max(arr[j - 1], arr[j]) + sc.nextInt();
			}
			arr = temp;
		}
		int max = -1;
		for (int i = 1; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		System.out.println(max);
	}

}
