package leetcodePractice;

import java.util.HashMap;
import java.util.Map;

public class P003LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> longestSubString = new HashMap<Character, Integer>();
		int answer = 0;

		for (int start = 0, last = 0; last < s.length(); last++) {

			if(longestSubString.containsKey(s.charAt(last))) {
				start = Math.max(longestSubString.get(s.charAt(last)), start);
			}
			answer = Math.max(answer, last - start + 1);
			longestSubString.put(s.charAt(last), last + 1);
		}

		return answer;
	}
}
