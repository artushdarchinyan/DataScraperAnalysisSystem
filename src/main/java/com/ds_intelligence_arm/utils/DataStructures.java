
package com.ds_intelligence_arm.utils;

import com.ds_intelligence_arm.storage.model.auto_am_DataRecord;

import java.util.LinkedList;

public class DataStructures {
    public static class SingleLinkedList extends LinkedList {
        public Node head;

        public class Node {
            auto_am_DataRecord data;
            Node next;

            Node(auto_am_DataRecord data) {
                this.data = data;
                this.next = null;
            }
        }

        public void add(auto_am_DataRecord record) {
            Node newNode = new Node(record);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
    }

    public static class Queue {
        public Node front;
        public Node rear;

        public class Node {
            auto_am_DataRecord data;
            Node next;

            Node(auto_am_DataRecord data) {
                this.data = data;
                this.next = null;
            }
        }

        public void enqueue(auto_am_DataRecord record) {
            Node newNode = new Node(record);
            if (rear == null) {
                front = rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
        }

        public auto_am_DataRecord dequeue() {
            if (front == null) {
                return null;
            }
            auto_am_DataRecord record = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return record;
        }

    }

    public static class Stack {
        private Node top;

        public class Node {
            auto_am_DataRecord data;
            Node next;

            Node(auto_am_DataRecord data) {
                this.data = data;
                this.next = null;
            }
        }

        public void push(auto_am_DataRecord record) {
            Node newNode = new Node(record);
            if (top == null) {
                top = newNode;
            } else {
                newNode.next = top;
                top = newNode;
            }
        }

        public auto_am_DataRecord pop() {
            if (top == null) {
                return null;
            }
            auto_am_DataRecord record = top.data;
            top = top.next;
            return record;
        }/* Implement the SingleLinkedList, queue, stack which wil store the DataRecords. */
    }
}
