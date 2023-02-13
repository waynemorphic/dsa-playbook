package DataStructuresNotes.LinkedLists;

/*
 * You are given the pointer to the head node of a linked list and an integer to add to 
 * the list. Create a new node with the given integer. Insert this node at the tail of the
 *  linked list and return the head node of the linked list formed after inserting this new
 *  node. The given head pointer may be null, meaning that the initial list is empty.

Function Description

Complete the insertNodeAtTail function in the editor below.

insertNodeAtTail has the following parameters:

SinglyLinkedListNode pointer head: a reference to the head of a list
int data: the data value for the node to insert
Returns

SinglyLinkedListNode pointer: reference to the head of the modified linked list
Input Format

The first line contains an integer n, the number of elements in the linked list.
The next n lines contain an integer each, the value that needs to be inserted at tail.

Sample Output

141
302
164
530
474
Explanation

First the linked list is NULL. After inserting 141, the list is 141 -> NULL.
After inserting 302, the list is 141 -> 302 -> NULL.
After inserting 164, the list is 141 -> 302 -> 164 -> NULL.
After inserting 530, the list is 141 -> 302 -> 164 -> 530 -> NULL. 
After inserting 474, the list is 141 -> 302 -> 164 -> 530 -> 474 -> NULL, 
which is the final list.
 */

import java.io.BufferedWriter;
import java.io.IOException;

public class InsertNodeAtTail {
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

        public SinglyLinkedList() {
            this.head = null;
        }
      
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if (head == null){ 
            head = node;
        }
        else if (head.next == null){
            head.next = node;
        }
        else {
            SinglyLinkedListNode tail = head;
            
            do{
                tail = tail.next;
            }
            while(tail.next != null);
            
            tail.next = node;
        }
        
        // System.out.println(node.data);
                 
        return head;

    }
}
