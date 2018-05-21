package leetcodeTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import leetcodePractice.P001TwoSum;
import leetcodePractice.P003LongestSubstringWithoutRepeatingCharacters;
import leetcodePractice.P005LongestPalindromicSubstring;

class P001 {

	P001TwoSum twoSum = new P001TwoSum();
	P003LongestSubstringWithoutRepeatingCharacters p003 = new P003LongestSubstringWithoutRepeatingCharacters();
	P005LongestPalindromicSubstring p005 = new P005LongestPalindromicSubstring();
	
	@Test
	void test() {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		
		int[] wantedAnswer = {0,1};
		int[] answer;
		
		answer = twoSum.twoSum2(nums, target);
		
		assertArrayEquals(wantedAnswer,answer);
	}
	
	@Test
	void p003Test() {
		int answer = p003.lengthOfLongestSubstring("abcabcbb");
		int wantedAnswer = 3;
		
		assertEquals(wantedAnswer,answer);
	}
	
	@Test
	void p005Test() {
		String answer = p005.longestPalindrome("babad");
		String wantedAnswer = "bab";
		
		assertEquals(wantedAnswer,answer);
	}

}
