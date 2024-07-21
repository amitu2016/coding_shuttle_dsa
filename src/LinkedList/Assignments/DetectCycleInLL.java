package LinkedList.Assignments;

public class DetectCycleInLL {
    public ListNode detectCycle(ListNode head) {
      if(head == null || head.next == null) return head;

      ListNode fast = head;
      ListNode slow = head;

      while(fast != null && fast.next != null ){
          slow = slow.next;
          fast = fast.next.next;

          if(slow == fast){
              //cycle detected
              ListNode cycleStart = head;

              while(cycleStart != slow){
                  cycleStart = cycleStart.next;
                  slow = slow.next;
              }
              return cycleStart;
          }

      }

     //No cycle detected
        return new ListNode(-1);

    }
}
