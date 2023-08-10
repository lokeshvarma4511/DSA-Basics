package company.dsa.advancedconcepts.linkedlist;

public class LinkedList
{
    int size;
    ListNode tail; // using tail inserting at last becomes in constant time
    ListNode head;
    public LinkedList()
    {
        this.size=0;
    }
    //   I        N        S        E        R        T        I        N        G
    // inserting at last without tail
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
        size+=1;
    }
    // inserting at last with tail
    public void insertLast(int data) {
        if (tail == null) {
            insertFirst(data);
//            return;
        }
        else {
            ListNode node = new ListNode(data);
            tail.next = node;
            tail = node;
            size += 1;
        }
    }
    //insert at first
    public void insertFirst(int val)
    {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size+=1;
    }
    //inserting at a particular position
    public void insertAt(int data, int index) {
        if (index == 0) {
            insertFirst(data);
        }
        if (index == size) {
            insertLast(data);
        }
        ListNode temp=head;
//        6     0     6     0
        for (int i = 1; i <index ; i++)
        {
            temp=temp.next;
        }
        ListNode node = new ListNode(data);
        node.next=temp.next;
        temp.next = node;
        size++;
    }
    //    D        E        L        E        T        I        N        G
    //deleting first element
    public int deleteFirst()
    {
        int val = head.data;
        ListNode temp = head;
        head = head.next;
//        temp = null;
        if (head == null) {
            tail=null;
        }
        size--;
        return val;
    }
    //deleting last element
    public int deleteLast()
    {
        if (size == 1) {
            return deleteFirst();
        }
        int val= tail.data;
//        7    7   8   5  0
        ListNode temp = head;
        for (int i = 0; i < size-2; i++) {
            temp=temp.next;
            if (i==(size-3))
            {
                tail=temp;
                temp.next = null;
            }
        }
        size--;
        return val;
    }
    //deleting at index
    public int deleteAt(int index) {
        int val;
        if (index == 0) {
            deleteFirst();
        }
        if (index == size - 1) {
            deleteLast();
        }
            ListNode temp = head;
            //    9    5    2    7    4
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            val=temp.next.data;
            temp.next = temp.next.next;

        return val;
    }
    // F      I      N      D      I      N      G
    public int find(int value) {
        ListNode a1=head;
        int siz=-1;
        boolean found=false;
        int i=0;
        while (i<size) {
            if (a1.data==value)
            {
                found = true;
                break;
            }
            else {
                a1 = a1.next;
            }
            i++;
            siz++;
        }
        if (found) {
            System.out.print("\nElement found at:");
            return siz+1;
        }
        else
        {
            System.out.print("\nElement not found");
            return -1;
        }
    }
    //    D        I        S        P        L         A        Y
    //display
    public void display()
    {
        ListNode node = head;
        while(node.next!=null)
        {
            System.out.print(node.data + " --> ");
            node = node.next;
        }
        System.out.print(node.data);
//        if (node.next == null) {
            System.out.print(" END ");
//        }
    }
    public void equal(ListNode a, ListNode b)
    {
        boolean b1= (a==b);
        System.out.println(b1);
    }
}