package com.Quiz6;

// Quiz 6
// Instructions: Update our tree implementation

// This is the main class
public class Main
{
    public static void main(String[] args)
    {
        Tree tree = new Tree();

        tree.insert(24);
        tree.insert(180);
        tree.insert(900);
        tree.insert(53);
        tree.insert(32);
        tree.insert(48);
        tree.insert(19);
        tree.insert(4);
        tree.insert(356);
        tree.insert(12);
        tree.insert(9);

        // This searches and outputs a node by its value
        // Output 'null' if the value is non-existent
        System.out.println("\nSearching for node...\n");
        System.out.println(tree.get(999));

        // This traverses and prints the tree in Ascending Order
        System.out.println("\nASCENDING ORDER");
        System.out.println("---------------");
        tree.traverseInOrder();

        // This traverses and prints the tree in Descending Order
        System.out.println("\nDESCENDING ORDER");
        System.out.println("----------------");
        tree.traverseInDescendingOrder();

        // This outputs the Min Value
        System.out.println("\nMIN VALUE");
        System.out.println("---------");
        System.out.println(tree.getMin());

        // This outputs the Max Value
        System.out.println("\nMAX VALUE");
        System.out.println("---------");
        System.out.println(tree.getMax());
    }
}