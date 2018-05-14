package leetcodePractice;

import java.util.HashMap;
import java.util.Map;

public class P001TwoSum {
	public int[] twoSum(int[] nums, int target) {

		int[] answer = new int[2];

		for (int i = 0; i < nums.length; i++) {
			if (target >= 0 && nums[i] > target)
				continue;
			else if (target < 0 && nums[i] < target)
				continue;

			int remain = target - nums[i];

			for (int j = 0; j < nums.length; j++) {
				if (i == j)
					continue;
				if (nums[j] == remain) {
					answer[0] = i;
					answer[1] = j;
					return answer;
				}
			}
		}

		return answer;
	}
	
	/**
	 * HashMap »ç¿ë
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum2(int[] nums, int target) {
		
		int[] answer = new int[2];

		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(target - nums[i]))
			{
				answer[1] = i;
				answer[0] = map.get(target - nums[i]);
				return answer;
			}
			map.put(nums[i], i);
		}

		return answer;
	}
}
