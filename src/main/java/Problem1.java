// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
      ListNode l = null;
      ListNode l_iterator = null;

      if (l1 != null) {
        l = new ListNode(l1.val);
        ListNode l1_iterator = l1.next;
        l_iterator = new ListNode(l1_iterator.val);
        l.next = l_iterator;
        while (l1_iterator.next != null) {
          l_iterator.next = new ListNode(l1_iterator.next.val);
          l_iterator = l_iterator.next;
          l1_iterator = l1_iterator.next;
        }
        l_iterator.next = new ListNode(l2.val);
        l_iterator = l_iterator.next;
      }
      else {
        l_iterator = new ListNode(l2.val);
        l = l_iterator;
      }

      if (l2 != null) {
        ListNode l2_iterator = l2;
        while (l2_iterator.next != null) {
          l_iterator.next = new ListNode(l2_iterator.next.val);
          l_iterator = l_iterator.next;
          l2_iterator = l2_iterator.next;
        }
      }

      return l;
    }
}
