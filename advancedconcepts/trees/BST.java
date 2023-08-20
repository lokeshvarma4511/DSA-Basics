package company.dsa.advancedconcepts.trees;

import jdk.dynalink.NoSuchDynamicMethodException;

public class BST {
    class Node
    {

        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value)
        {
            this.value= value;
        }
        public int getValue()
        {
            return value;
        }
    }

    public BST(){
    }
    private Node root;
    public void insert(int value){
        root=insert(root,value);
    }
    public int height(Node node)
    {
        if (node==null)
        {
            return -1;
        }
        return node.height;
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value<node.value)
        {
            node.left=insert(node.left,value);
        }
        if (value>node.value)
        {
            node.right=insert(node.right,value);
        }

        return node;
    }
}