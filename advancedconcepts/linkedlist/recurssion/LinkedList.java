package company.dsa.advancedconcepts.linkedlist.recurssion;

import java.security.PublicKey;

public class LinkedList {
    private int size=0;
    private Node head;
    private Node tail;

    public void insertAtFirst(int data)
    {
        size++;
        Node n = new Node(data);
        if (head == null) {
            head=n;
            return;
        }
        n.next=head;
        head=n;
    }

    public void insertAt(int data, int index, Node temp)
    {
        if (index==0)
        {
            size++;
            Node n= new Node(data);
            temp.next=n;
            n.next=temp.next;
            return;
        }
        insertAt(data,index--, temp.next);
    }


    public void display()
    {
        if (size==-1)
        {
            System.out.println("Empty LinkedList");
        }
        else
        {
            Node t = head;
            do {
                {
                    System.out.print(t.data+ " -->");
                    t=t.next;
                }
            }
            while (t!=null);
            System.out.println("End");
        }
    }
}
