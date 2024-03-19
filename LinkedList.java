// package java;
public class LinkedList {
    // Node class to represent individual elements in the list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Create head node
        Node head = new Node(10);

        // Add more nodes to the list
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        // Connect the nodes
        head.next = second;
        second.next = third;
        third.next = fourth;

        // Print the linked list
        printList(head);
    }

    // Function to print the linked list
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }
}