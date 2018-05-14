package leetcodePractice;

import java.util.HashMap;
import java.util.Map;

public class P167TwoSum2 {
	public int[] twoSum(int[] numbers, int target) {
		int[] answer = new int[2];

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(target - numbers[i])) {
				answer[1] = i + 1;
				answer[0] = map.get(target - numbers[i]) + 1;
				return answer;
			}
			map.put(numbers[i], i);
		}

		return answer;
	}

	public int[] twoSum2(int[] numbers, int target) {
		int[] answer = new int[2];
		int left = 0;
		int right = numbers.length - 1;

		int sum;

		while (left < right) {
			sum = numbers[left] + numbers[right];

			if (sum < target) {
				left++;
			} else if (sum > target) {
				right--;
			} else {
				answer[0] = left + 1;
				answer[1] = right + 1;
				break;
			}
		}

		return answer;
	}
}
