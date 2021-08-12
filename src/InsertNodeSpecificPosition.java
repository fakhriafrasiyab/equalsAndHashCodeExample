import org.w3c.dom.Node;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InsertNodeSpecificPosition {
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

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));
            node = node.next;
            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }


    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        SinglyLinkedListNode head = llist;
        SinglyLinkedListNode nodeToInsert = new SinglyLinkedListNode(data);
        if (llist == null) {
            return nodeToInsert;
        }
        if (position == 0) {
            nodeToInsert.next = llist;
            return nodeToInsert;
        }
        int curPos = 0;
        while (curPos < position - 1 && llist.next != null) {
            System.out.println(head.data);
            llist = llist.next;
            curPos++;
        }
        SinglyLinkedListNode nodeAtPosition = llist.next;
        llist.next = nodeToInsert;
        llist = llist.next;
        llist.next = nodeAtPosition;
        return head;

    }

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        SinglyLinkedListNode node = head;
        if (position == 0) {
            head = node.next;
            return head;
        }

        for (int i = 0; i < position - 1 && node != null; i++) {
            node = node.next;
        }
        if (node == null || node.next == null)
            return head;

        SinglyLinkedListNode node1 = node.next.next;
        node.next = node1;
        System.out.println(node1);
        return head;
    }

    public static void main(String[] args) throws IOException {
        SinglyLinkedListNode node = new SinglyLinkedListNode(5);
        insertNodeAtPosition(node, 4, 0);

    }
}

