// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        // TODO: Implement the concatenate method
        // This method should concatenate l2 to l1 and return l1
        // Remember to create new nodes instead of directly linking l1 to l2
        // Problem1.java
        ListNode l3 = ListNode(-1);
        if (l1 == null) {
          return l2;
        }
        if (l2 == null) {
          return l1;
        }
        int curr = l3.val;
        while (l1.next != null) {
            curr = l1.val;
            curr = l3.next.val;
        }
        
        while (l2.next != null) {
            curr = l2.val;
            curr = l3.next.val;
        }
        
        
        return l3;
    }
}
