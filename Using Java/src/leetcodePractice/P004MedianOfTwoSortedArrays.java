package leetcodePractice;

public class P004MedianOfTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int totalSize = nums1.length + nums2.length;
		int idx1 = 0;
		int idx2 = 0;
		double answer = 0;

		for (int i = 0; i < totalSize; i++) {
			int target = 0;

			if(idx1 >= nums1.length)
				target = nums2[idx2++];
			else if(idx2 >= nums2.length)
				target = nums1[idx1++];
			else if (nums1[idx1] <= nums2[idx2])
				target = nums1[idx1++];
			else if (nums1[idx1] > nums2[idx2])
				target = nums2[idx2++];

			if (totalSize % 2 == 0 && (i == totalSize / 2 - 1 || i == totalSize / 2)) {
				answer += target;
			} else if (totalSize % 2 != 0 && i == totalSize / 2)
				answer = target;
		}

		if (totalSize % 2 == 0)
			answer /= 2;

		return answer;
	}
}
