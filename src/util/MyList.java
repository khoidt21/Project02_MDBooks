/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import entity.Book;

/**
 *
 * @author ADMIN
 */
public class MyList {

    Node<Book> head, tail;

    //ctor
    public MyList() {
        head = tail = null;
    }

    //check if the list is empty or not
    public boolean isEmpty() {
        return head == null;
    }

    //add a new Book to the end of list
    public void addLast(Book b) {

        Node node_new = new Node(b);
        if (tail == null) {
            head = node_new;
            tail = node_new;
        } else {

            tail.next = node_new;
            tail = node_new;
        }
    }

    //add a new Book to the begining of list
    public void addFirst(Book b) {

        Node<Book> node_new = new Node(b);
        if (head == null) {
            head = node_new;
            tail = node_new;
        } else {
            node_new.next = head;
            head = node_new;
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
        if(i == k){
            node.next = current;
            previous.next = node;
        }
        if(current == null){
            tail = node;
        }
    }
    
    //delete a book at position k
    public void deleteAt(int k) {
       
        if (head == null) 
            return; 
        
        Node temp = head; 
        if (k == 0) 
        { 
            head = temp.next;
            return; 
        } 
        for (int i=0; temp!=null && i<k-1; i++) 
            temp = temp.next; 
        
        if (temp == null || temp.next == null) 
            return; 
        
        Node next = temp.next.next; 
        temp.next = next;
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

}
