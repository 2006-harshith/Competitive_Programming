package leetcode;
import java.math.BigInteger;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        String num1 = "";
        String num2 = "";
        while ((cur1 != null) || (cur2 != null)) {
            if (cur1 != null) {
                num1 = Integer.toString(cur1.val) + num1;
                cur1 = cur1.next;
            }
            if (cur2 != null) {
                num2 = Integer.toString(cur2.val) + num2;
                cur2 = cur2.next;
            }
        }
        BigInteger val1 = new BigInteger(num1);
        BigInteger val2 = new BigInteger(num2);
        String num3 = val1.add(val2).toString();

        ListNode last = new ListNode(Character.getNumericValue(num3.charAt(0)));

        for (int i = 1; i < num3.length(); i++) {
            ListNode temp = new ListNode(Character.getNumericValue(num3.charAt(i)), last);
            last = temp;
        }
        return last;
    }
}