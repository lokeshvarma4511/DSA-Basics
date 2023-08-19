package company.dsa.advancedconcepts.linkedlist.leetcode;

import company.dsa.advancedconcepts.linkedlist.core.ListNode;

public class Questions {

    public boolean hasCycle(ListNode a) {
        ListNode slow = a;
        ListNode fast = a;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }


    public int lengthCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int length = 0;


        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                ListNode temp = fast;
                do {
                    temp = temp.next;
                    length++;
                }
                while (temp != fast);
                return length;
            }
        }
        return 0;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int length = 0;


        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                length = lengthCycle(slow);
                break;
            }
        }
        if (length==0)
        {
            return null;
        }

        ListNode first = head;
        ListNode second=head;
        while(length>0)
        {
            second=second.next;
            length--;
        }
        while (first!=second)    {
            second=second.next;
            first=first.next;
        }

        return  second;
    }




    //q           e             s           t              i           o              n

    public boolean isHappy(int n)
    {
        if (n==1)
        return true;
        int s=n;
        int f=n;
        do {
             s = squearOf(s);
             f = squearOf(squearOf(f));
        }
        while (s!=f);
        if (s==1)
            return true;
        else
            return false;
    }
    public int squearOf(int n)
    {
        int sum=0;
        int rem;
        while(n>0)
        {
            rem=n%10;
            sum+=rem*rem;
            n/=10;
        }
        return n;
    }
    public ListNode middleNode(ListNode head) {

        ListNode slow= head;
        ListNode fast= head;
        while(fast!=null &&  fast.next!=null ) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}