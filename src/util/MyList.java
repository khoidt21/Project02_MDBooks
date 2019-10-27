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
        //throw new UnsupportedOperationException("Remove this line and implement your code here!");
        Node newnode = new Node(b);
        if (tail == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail = newnode;
            tail.next = newnode;
        }
    }

    //add a new Book to the begining of list
    public void addFirst(Book b) {
        throw new UnsupportedOperationException("Remove this line and implement your code here!");
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

       while(current !=null){
           if(size == k){
               return current;
           }
           size++;
           current = current.next;
       }
       return current;
        
    }
    
    //add a new book after a position k
    public void addAfter(Book b, int k) {
        throw new UnsupportedOperationException("Remove this line and implement your code here!");
    }

    //delete a book at position k
    public void deleteAt(int k) {
        throw new UnsupportedOperationException("Remove this line and implement your code here!");
    }

    //search a Node by a given book code
    public Node<Book> search(String bCode) {
        throw new UnsupportedOperationException("Remove this line and implement your code here!");
    }

}
