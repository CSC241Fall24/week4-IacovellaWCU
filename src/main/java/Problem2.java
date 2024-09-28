
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
      ListNode l = null;
      ListNode l_iterator = null;

        ListNode l1_iterator = head.next;
        l_iterator = new ListNode(l1_iterator.val);
        l = new ListNode(head.val);
        l.next = l_iterator;
        int i = 0;
        
        while (i < position && l1_iterator.next != null) {
            l_iterator.next = new ListNode(l1_iterator.next.val);
            l_iterator = l_iterator.next;
            l1_iterator = l1_iterator.next;
            i = i + 1;
        }
        l_iterator.next = new ListNode(val);
        while (l1_iterator.next != null) {
            l_iterator.next = new ListNode(l1_iterator.next.val);
            l_iterator = l_iterator.next;
            l1_iterator = l1_iterator.next;
        }
      

      return l;
    }
}
