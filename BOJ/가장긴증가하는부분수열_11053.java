package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장긴증가하는부분수열_11053 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n + 1];
		int dp[] = new int[n + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 1; i < arr.length; i++) {
			int max = -1;
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && dp[j] > max) {
					max = dp[j];
				}
			}
			dp[i] += max + 1;
		}
		int max = 0;
		for(int i=0; i<dp.length; i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}

}
