package company.dsa.advancedconcepts.trees;

import java.util.Scanner;

public class BinaryTree {
    class Node
    {
        int value;
        Node left;
        Node right;
        Node(int value)
        {
            this.value = value;
        }
    }
    private Node root;
    public void populate(Scanner sc) {
        System.out.println("Enter the root element: ");
        int value=sc.nextInt();
        root = new Node(value);
        populate(sc,root);
    }
    public void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter a value to left of "+node.value +" :");
        boolean left= sc.nextBoolean();
        if (left)
        {
            System.out.println("Enter the value: " );
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc,node.left);
        }
        System.out.println("Do you want to enter a value to right of "+node.value +" :");
        boolean right= sc.nextBoolean();
        if (right)
        {
            System.out.println("Enter the value: " );
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc,node.right);
        }
    }

    void prettyDisplay()
    {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int index) {
        if (node==null)
        {
            return;
        }
        prettyDisplay(node.right,index+1);
        if (index!=0)
        {
            for (int i = 0; i <index-1 ; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|----> "+node.value);
        }
        else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left,index+1);
    }


//    void display()
//    {
//        display(root, "");
//    }
//    private void display(Node node, String s) {
//        if (node==null)
//        {
//            return;
//        }
//        System.out.println(s+node.value);
//        display(node.left,s+"\t");
//        display(node.right,s+"\t");
//    }
}