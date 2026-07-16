class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode temp3 = dummy;

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        int carry = 0;

        while (temp1 != null || temp2 != null) {

            int sum = carry;

            if (temp1 != null) {
                sum += temp1.val;
                temp1 = temp1.next;
            }

            if (temp2 != null) {
                sum += temp2.val;
                temp2 = temp2.next;
            }

            carry = sum / 10;
            int digit = sum % 10;

            temp3.next = new ListNode(digit);
            temp3 = temp3.next;
        }

        if (carry > 0) {
            temp3.next = new ListNode(carry);
        }

        return dummy.next;
    }
}