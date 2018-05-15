package leetcodePractice;

public class P002AddTwoNumber {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode answerNode = new ListNode(-1);
		ListNode answer = answerNode;

		while (l1 != null || l2 != null || carry == 1) {
			int sum = carry;
			carry = 0;

			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}

			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}

			if (sum >= 10) {
				carry = 1;
				sum -= 10;
			}

			if (answerNode.val == -1)
				answerNode.val = sum;
			else {
				answerNode.next = new ListNode(sum);
				answerNode = answerNode.next;
			}
		}
		if (answer.val == -1)
			answer.val = 0;

		return answer;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}