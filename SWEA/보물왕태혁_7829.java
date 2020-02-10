package SWEA;

import java.util.Scanner;

public class 보물왕태혁_7829 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int result = 0;
			int P = sc.nextInt(); // 약수 갯수
			if (P == 1) {
				int val = sc.nextInt();
				result = val * val;

			} else {
				int min = 1000000001;
				int max = 0;
				for (int i = 0; i < P; i++) { // 약수 갯수만큼 입력
					int input = sc.nextInt();
					if (min > input) {
						min = input;
					}
					if (max < input) {
						max = input;
					}
				}
				result = min * max;
			}
			System.out.println("#" + tc + " " + result);
		}
	}

}
