// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        // TODO: Implement the concatenate method
        // This method should concatenate l2 to l1 and return l1
        // Remember to create new nodes instead of directly linking l1 to l2
        // Problem1.java
        ListNode poinby = null;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        poinby = l1;
        while (poinby.next != null) {
            poinby = poinby.next;
        } 
        poinby.next = l2;
        
        return l1;
    }
}
