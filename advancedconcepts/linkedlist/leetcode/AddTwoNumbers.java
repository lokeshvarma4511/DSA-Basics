package company.dsa.advancedconcepts.linkedlist.leetcode;

import java.util.List;

class ListNode {
    ListNode head;
     int val;
     ListNode next;
    ListNode() {}
     ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public void insert(int data)
    {
        ListNode node = new ListNode(data);
        node.next=null;
        if (head==null)
        {
            head=node;
        }
        else
        {
            ListNode n=head;
            while(n.next!= null)
            {
                n =n.next;
            }
            n.next = node;
        }
//        size+=1;
    }
    public void display()
    {
       ListNode node = head;
        while(node.next!=null)
        {
            System.out.print(node.val + " --> ");
            node = node.next;
        }
        System.out.print(node.val);
//        if (node.next == null) {
        System.out.print(" END ");
//        }
    }
  }

public class AddTwoNumbers {
    public static void display(ListNode ans)
    {
        ListNode node = ans;
        while(node.next!=null)
        {
            System.out.print(node.val + " --> ");
            node = node.next;
        }
        System.out.print(node.val);
//        if (node.next == null) {
        System.out.print(" END ");
//        }
    }
    public static void main(String[] args) {

        ListNode l1 =new ListNode();
        l1.insert(2);
        l1.insert(4);
        l1.insert(3);
        ListNode l2 = new ListNode();
        l2.insert(5);
        l2.insert(6);
        l2.insert(4);
        System.out.println(addTwoNumbers(l1,l2));
        ListNode ans=addTwoNumbers(l1,l2);
        display(ans);


    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1=l1;
        ListNode head2= l2;
        int sum1=0;
        while (head1!=null ) {
            sum1=sum1*10+ (head1.val);

            head1=head1.next;
        }

        int sum2=0;
        while (head2!=null) {
            sum2=sum2*10+ (head2.val);

            head2=head2.next;
        }

        int total = sum1+sum2;
        System.out.println(total);
        ListNode sumList = new ListNode();
        ListNode head= sumList;

        while (total!=0)
        {
            int rem=total%10;
            total/=10;
            ListNode node= new ListNode(rem);
            if (head==null)
            {
                head=node;
            }
            else
            {
                ListNode t = head;

                while (t.next!=null)
                {
                    t=t.next;
                }
                t.next=node;
            }

        }
        return head;
    }
}
