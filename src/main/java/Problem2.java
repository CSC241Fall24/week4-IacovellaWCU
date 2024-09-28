
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
      ListNode l = null;


        if (position == 0) {
            ListNode start = val;
        } else {
            ListNode start = head;
        }

        ListNode l = start;
        for (int i = 1; i < position; i++) {
            l.next = head.next;
        }
        if (head.next != null) {
            start.next = head.next;
        }

        
    
      return l;
    }
}
