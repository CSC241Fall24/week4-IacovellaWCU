
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        int i = 0;
        ListNode new_head =  new ListNode(-1);
        ListNode iterator = new_head;
        iterator.next = head;
        while(i < position - 1 && iterator.next != null) {
            iterator = iterator.next;
            i++;
        }
        ListNode second_half = iterator.next;
        iterator.next = new ListNode(val);
        iterator.next.next = second_half;
        return new_head.next;

    }
}
