package leetcodePractice;

public class P005LongestPalindromicSubstring {
	public String longestPalindrome(String s) {
		int maxLen = 0;
		String answer = null;
		int stringSize = s.length();

		boolean[][] palindrome = new boolean[stringSize][stringSize];
		
		for (int i = stringSize-1; i >= 0; i--) {
			for (int j = i; j < stringSize; j++) {
				System.out.println(i + " " +j);
				palindrome[i][j] = s.charAt(i) == s.charAt(j) && (i+1 >= j-1 || palindrome[i+1][j-1]);
				
				if (palindrome[i][j]) {
					int len = j - i + 1;
					if (maxLen < len) {
						maxLen = len;
						answer = s.substring(i, j + 1);
					}
				}
			}
		}

		return answer;
	}
}
