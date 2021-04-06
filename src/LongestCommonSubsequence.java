import java.util.*;

public class LongestCommonSubsequence {
	public static void main(String args[]) {
		String s1 = "ACADB";
		String s2 = "CDBA";
		int m = s1.length();
		int n = s2.length();
		lcs(s1, s2, m, n);
	}

	static void lcs(String s1, String s2, int m, int n) {
		int[][] lcsTable = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0) 
					lcsTable[i][j] = 0;
				else if (s1.charAt(i - 1) == s2.charAt(j - 1))
					lcsTable[i][j] = lcsTable[i - 1][j - 1] + 1;
				else
					lcsTable[i][j] = Math.max(lcsTable[i - 1][j], lcsTable[i][j - 1]);
			}
		}
		int index = lcsTable[m][n];
		int temp = index;
		char[] lcs = new char[index + 1];
		int i = m, j = n;
		while (i > 0 && j > 0) {
			if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
				lcs[index - 1] = s1.charAt(i - 1);
				i--;
				j--;
				index--;
			} 
			else if (lcsTable[i - 1][j] > lcsTable[i][j - 1])
				i--;
			else
				j--;
		}
		System.out.print("S1 : " + s1 + "\nS2 : " + s2 + "\nLCS: ");
		for (int k = 0; k <= temp; k++)
			System.out.print(lcs[k]);
		System.out.println("");
	}

}