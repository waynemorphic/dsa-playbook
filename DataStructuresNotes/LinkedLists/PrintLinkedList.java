package DataStructuresNotes.LinkedLists;

/*
 * Java LinkedList class uses a doubly linked list to store elements. It implements the
 * List and Deque interfaces and extends the AbstractSequentialList.
 * -- Note that:
 * 1. LinkedList class can contain duplicates
 * 2. LinkedList maintains an insertion order
 * 3. LinkedList is non synchronized
 * 4. Manipulaion in LinkedList is fast because no shifting needs to occur
 * 5. It can be used as a List, Stack or queue
 * 6. It is not sychronized, thus is not thread safe
 * 7. Does not support RandomAcsess interface because LinkedList support sequential access only
 * 
 * In doubly linked list, elemets can be added or removed from both sides
 * 
 * --- Problem
 * Function Description

Complete the printLinkedList function in the editor below.

printLinkedList has the following parameter(s):

SinglyLinkedListNode head: a reference to the head of the list
Print

For each node, print its data value on a new line (console.log in Javascript).
Input Format

The first line of input contains n, the number of elements in the linked list.
The next n lines contain one element each, the data values for each node.

Note: Do not read any input from stdin/console. Complete the printLinkedList function in the editor below.

Sample Input

2
16
13
Sample Output

16
13

Explanation

There are two elements in the linked list. They are represented as 16 -> 13 -> NULL. 
So, the printLinkedList function should print 16 and 13 each on a new line.

 */

import java.util.*;


public class PrintLinkedList {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    // printing the elements 
    static void printLinkedList(SinglyLinkedListNode head) {
        System.out.println(head.data);
        if (head.next != null){
            printLinkedList(head.next);
        }       

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }

        printLinkedList(llist.head);

        scanner.close();
    }
}
