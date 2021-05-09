import java.util.*;

public class MatrixAndChef {
	static void print(int n, int[][] mat) {
		int[] arr = new int[n];
		int k = 0;
		while (k < n && mat[0][k] == 0) {
			k++;
		}
		for (int i = k; i < n; i++) {
			arr[k] = -mat[0][k];
			if (Math.abs(arr[k] + mat[0][i]) == mat[k][i]) {
				arr[i] = -mat[0][i];
			} else {
				arr[i] = mat[0][i];
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		print(n, mat);
		while (m-- > 0) {
			int ind = sc.nextInt() - 1;
			for (int i = 0; i < n; i++) {
				mat[i][ind] = mat[ind][i] = sc.nextInt();
			}
			print(n, mat);
		}
	}
}