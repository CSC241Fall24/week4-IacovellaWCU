
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
      ListNode l = null;
      ListNode l_iterator = null;

        ListNode l1_iterator = head.next;
        l_iterator = new ListNode(l1_iterator.val);
        l.next = l_iterator;
        
        if (position == 0) {
            l = new ListNode(val);

            l_iterator.next = new ListNode(l1_iterator.next.val);
            l_iterator = l_iterator.next;
            l1_iterator = l1_iterator.next;
            
        } else {
            l = new ListNode(head.val);
        }

        int i = 1;
        
        while (i < position && l1_iterator.next != null) {
            l_iterator.next = new ListNode(l1_iterator.next.val);
            l_iterator = l_iterator.next;
            l1_iterator = l1_iterator.next;
            i = i + 1;
        }
        if (position > 0) {
            l_iterator.next = new ListNode(val);
                          }
        while (l1_iterator.next != null) {
            l_iterator.next = new ListNode(l1_iterator.next.val);
            l_iterator = l_iterator.next;
            l1_iterator = l1_iterator.next;
        }
      

      return l;
    }
}
