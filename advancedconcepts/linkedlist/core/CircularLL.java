package company.dsa.advancedconcepts.linkedlist.core;
public class CircularLL {
    Node head;
    Node tail;
    int size;
    public void insertFirst(int data)
    {
        Node node = new Node(data);
        if (head == null)
        {
            head = node;
            tail = node;
            return;
        }
        node.next=head;
        tail.next=node;
        tail=node;
    }
    public void display()
    {
        Node temp = head;
        do {
            System.out.print(temp.data+"-->");
            temp=temp.next;
//            size++;
        }
        while (temp != head);
        System.out.println("HEAD");
    }
    public void delete(int val)
    {
        Node node = head;
        if (node == null) {
            return ;
        }

        if (node.data == val) {
            head = node.next;
            tail.next = head;
            return;
        }
        do {
            Node n = node.next;
            if (n.data==val)
            {
                node.next=n.next;
                return;
            }
            node=node.next;
        }
        while (node !=null );
    }
    class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
        }
    }
}