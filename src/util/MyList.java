/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import entity.Book;
import entity.BookComp;
import java.util.Collections;

/**
 *
 * @author ADMIN
 */
public class MyList {

    Node<Book> head, tail;

    //contructor MyList
    public MyList() {
        head = tail = null;
    }

    //check if the list is empty or not
    public boolean isEmpty() {
        return head == null;
    }

    //add a new Book to the end of list
    public void addLast(Book b) {

        Node nodeNew = new Node(b);
        if (tail == null) {
            head = nodeNew;
            tail = nodeNew;
        } else {

            tail.next = nodeNew;
            tail = nodeNew;
        }
    }

    //add a new Book to the begining of list
    public void addFirst(Book b) {

        Node<Book> nodeNew = new Node(b);
        if (head == null) {
            head = nodeNew;
            tail = nodeNew;
        } else {
            nodeNew.next = head;
            head = nodeNew;
        }
    }

    //output information of all books in the list
    public void traverse() {

        Node<Book> current = head;
        while (current != null) {
            System.out.println(current.info);
            current = current.next;

        }
    }

    //return number of nodes/elements in the list
    public int size() {
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
    // function to sort a singly linked list using insertion sort 
    Node<Book> sorted;

    public void insertionSort(Node<Book> headref) {
        // Initialize sorted linked list 

        Node current = headref;
        // Traverse the given linked list and insert every 
        // node to sorted 
        while (current != null) {
            // Store next for next iteration 
            Node next = current.next;
            // insert current in sorted linked list 
            sortedInsert(current);
            // Update current 
            current = next;
        }
        // Update head_ref to point to sorted linked list 
        head = sorted;
        //tail = sorted;

        Node<Book> c = head;
        Node<Book> p = null;
        while (c != null) {

            p = c;
            c = c.next;
        }
        tail = p;

    }

    public void sortedInsert(Node<Book> newnode) {
        /* Special case for the head end */

        Book b = newnode.info;

        if (sorted == null || b.getbCode().compareTo(newnode.info.getbCode()) < 0) {
            newnode.next = sorted;
            sorted = newnode;
        } else {
            Node<Book> current = sorted;
            /* Locate the node before the point of insertion */
            while (current.next != null && current.next.info.getbCode().compareTo(newnode.info.getbCode()) < 0) {
                current = current.next;
            }
            newnode.next = current.next;
            current.next = newnode;
        }
    }

    //return a Node at position k, starting position is 0
    public Node<Book> getNode(int k) {
        int size = 0;
        Node current = head;

        while (current != null) {
            if (size == k) {
                return current;
            }
            size++;
            current = current.next;
        }
        return current;

    }

    //add a new book after a position k
    public void addAfter(Book b, int k) {

        Node<Book> node = new Node(b);
        if (this.head == null) {
            if (k != 0) {
                return;
            } else {
                this.head = node;
                this.tail = node;
            }
        }
        if (head != null && k == 0) {
            node.next = this.head;
            this.head = node;
            return;
        }
        Node current = this.head;
        Node previous = null;

        int i = 0;
        while (i < k) {
            previous = current;
            current = current.next;
            if (current == null) {
                break;
            }
            i++;
        }
        if (i == k) {
            if (current == null) {
                tail = node;
            }
            node.next = current;
            previous.next = node;
        }

    }

    //delete a book at position k
    public void deleteAt(int k) {

        Node current = head;
        Node parent = null;
        int index = 0;

        while (current != null && index < k) {
            parent = current;
            current = current.next;

            index++;
        }
        if (current != null && parent == null) {
            if (current.next != null) {
                head = current.next;
            } else {
                head = null;
                tail = null;
            }
        } else if (current != null) {
            parent.next = current.next;
            if (current.next == null) {
                tail = parent;
            }
        }

    }

    //search a Node by a given book code
    public Node<Book> search(String bCode) {

        Node<Book> current = head;
        while (current != null) {
            if (current.info.getbCode().equals(bCode)) {
                return current;
            }
            current = current.next;

        }
        return current;
    }

    public void sortList() {

//        Node current = null, index = null;
//        int temp;
//        //Check whether list is empty  
//        if (head == null) {
//            return;
//        } else {
//            //Current will point to head  
//            for (current = head; current.next != null; current = current.next) {
//                //Index will point to node next to current  
//                for (index = current.next; index != null; index = index.next) {
//                    //If current's data is greater than index's data, swap the data of current and index  
//                    if (current > index) {
//                        temp = current.data;
//                        current.data = index.data;
//                        index.data = temp;
//                    }
//                }
//            }
//        }
    }
}
