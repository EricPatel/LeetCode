package AddTwoNumbers;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int value, ListNode next) {
		this.val = value;
		this.next = next;
	}
	public ListNode(int value) {
		this.val = value;
		this.next = null;
	}
	
	public String toString() {
		String result = "";
		ListNode curr = this;
		while(curr.next != null) {
			result += curr.val + " -> ";
			curr = curr.next;
		}
		result += curr.val;
		return result;
	}
}
