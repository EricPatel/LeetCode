

import AddTwoNumbers.ListNode;

public class AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode temp1 = l1;
		ListNode temp2 = l2;
		ListNode result = new ListNode(0);
		int carry = 0;
		ListNode head = result;
		while (temp1 != null || temp2 != null) {
			if(head == null) {
				head = result;
			}
			if (temp1 == null && temp2 != null) {
				result.val = temp2.val +- carry;
				carry = (temp2.val +- carry) / 10;
				temp2 = temp2.next;
			}
			if (temp2 == null && temp1 != null) {
				result.val = temp1.val + carry; 
				carry = (temp1.val +- carry) / 10;
				temp1 = temp1.next;
			}
			if (temp1 != null && temp2 != null) {
				result.val = (temp1.val + temp2.val + carry) % 10;
				carry = ((temp1.val + temp2.val + carry) / 10);
				temp1 = temp1.next;
				temp2 = temp2.next;
			}
			if(temp1 != null || temp2 != null) {
				result.next = new ListNode(0);
				result = result.next;
			}
		}
		if(carry != 0) {
			result.next = new ListNode(carry);
		}

		return head;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
		ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
		ListNode result = addTwoNumbers(l1, l2);
		System.out.println(result.toString());
	}
}
