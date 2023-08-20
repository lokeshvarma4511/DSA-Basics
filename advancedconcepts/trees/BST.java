package company.dsa.advancedconcepts.trees;

import java.util.EmptyStackException;

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

    // empty tree or not
    public  boolean isEmpty(){
        return root==null;
    }
    // h e i g h t
    public int height(Node node)
    {
        if (node==null)
        {
            return -1;
        }
        return node.height;
    }

    // i n s e r t i o n
    public void insert(int value){
        root=insert(root,value);
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
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;
    }

    public boolean balanced()
    {
        return balanced(root);
    }

    private boolean balanced(Node node) {
    if (node==null)
    {
        return true;
    }
    return Math.abs(height(node.left)-height(node.right))<=1 &&balanced(node.left) && balanced(node.right);
    }
}
