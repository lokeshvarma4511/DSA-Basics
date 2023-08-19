package company.dsa.advancedconcepts.trees;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree b1 = new BinaryTree();
        b1.populate(sc);
        b1.prettyDisplay();
    }
}