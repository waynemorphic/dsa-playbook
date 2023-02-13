package DataStructuresNotes.LinkedLists;

import java.io.BufferedWriter;
import java.io.IOException;

/*
 * Given a pointer to the head of a linked list, insert a new node before the head. The next
 *  value in the new node should point to head and the data value should be replaced with a
 *  given value. Return a reference to the new head of the list. The head pointer given may 
 *  be null meaning that the initial list is empty.

Function Description

Complete the function insertNodeAtHead in the editor below.

insertNodeAtHead has the following parameter(s):

SinglyLinkedListNode llist: a reference to the head of a list
data: the value to insert in the data field of the new node
Input Format

The first line contains an integer n, the number of elements to be inserted at the head of the list.
The next n lines contain an integer each, the elements to be inserted, one per function call.


Sample Input

5
383
484
392
975
321
Sample Output

321
975
392
484
383
Explanation

Intially the list in NULL. After inserting 383, the list is 383 -> NULL.
After inserting 484, the list is 484 -> 383 -> NULL.
After inserting 392, the list is 392 -> 484 -> 383 -> NULL.
After inserting 975, the list is 975 -> 392 -> 484 -> 383 -> NULL.
After inserting 321, the list is 321 -> 975 -> 392 -> 484 -> 383 -> NULL.
 */
public class InsertAtHead {
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

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        node.data = data;
        node.next = llist;

        return node;

    }
}
