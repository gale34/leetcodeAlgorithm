package leetcodeTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import leetcodePractice.P001TwoSum;

class P001 {

	P001TwoSum twoSum = new P001TwoSum();
	
	@Test
	void test() {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		
		int[] wantedAnswer = {0,1};
		int[] answer;
		
		answer = twoSum.twoSum2(nums, target);
		
		assertArrayEquals(wantedAnswer,answer);
	}

}
