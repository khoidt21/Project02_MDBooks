/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import entity.Book;
import java.util.Scanner;
import util.MyList;

/**
 *
 * @author ADMIN
 */
public class BookList {

    //a list of book
    private MyList books;

    public MyList getBooks() {
        return books;
    }

    
    
    public BookList() {
        books = new MyList();
    }

    //1.0 accept information of a Book
    private Book getBook() {
        
        System.out.println("Nhap thong tin book: ");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin code: ");
        String code = scanner.nextLine();
        
        System.out.println("Nhap thong tin title: ");
        String title = scanner.nextLine();
        
        System.out.println("Nhap thong tin quantity: ");
        int quantity = scanner.nextInt();
        
        System.out.println("Nhap thong tin price: ");
        double price = scanner.nextDouble();
        
        System.out.println("Nhap thong tin lended: ");
        int lended = scanner.nextInt();
        
        Book newbook = new Book();
        
        newbook.setbCode(code);
        newbook.setTitle(title);
        newbook.setQuantity(quantity);
        newbook.setPrice(price);
        newbook.setLended(lended);
        return newbook;
        
    }
    
    //1.1 accept and add a new Book to the end of book list
    public void addLast() {
        books.addLast(getBook());
    }

    //1.2 output information of book list
    public void list() {
        for(int i=0;i < books.size();i++){
            //System.out.println("books: " + books.getNode(i));
            Book k = books.getNode(i);
            
        }
        
    }
    
    //1.3 search book by book code
    public void search() {
        throw new UnsupportedOperationException("Remove this line and implement your code here!");
    }

    //1.4 accept and add a new Book to the begining of book list
    public void addFirst() {
        throw new UnsupportedOperationException("Remove this line and implement your code here!");
    }

    //1.5 Add a new Book after a position k
    public void addAfter() {
        throw new UnsupportedOperationException("Remove this line and implement your code here!");
    }

    //1.6 Delete a Book at position k
    public void deleteAt() {
        throw new UnsupportedOperationException("Remove this line and implement your code here!");
    }
}
