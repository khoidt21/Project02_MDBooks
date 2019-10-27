/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import entity.Book;
import java.util.InputMismatchException;
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
        
        String code = null;
        String title = null;
        boolean check = true;
        Book newbook = new Book();
        System.out.println("Enter input information book. ");
        
        Scanner scanner = new Scanner(System.in);
        // code
        while(code == null || code.isEmpty()){
            System.out.println("Input code: ");
            code = scanner.nextLine();
            newbook.setbCode(code);
        }
        // title 
        while(title == null || title.isEmpty()){
            System.out.println("Input title: ");
            title = scanner.nextLine();
            newbook.setTitle(title);
        }
        // quantity 
        
        do{
            try{
                System.out.println("Input quantity:");
                newbook.setQuantity(scanner.nextInt());
                check = false;
            }
            catch(InputMismatchException e){
                System.out.println("Quantity is number.Input quantity");
                check = true;
                scanner.nextLine();
            }
        }while(check);
        // lended 
        
        do{
            try{
                System.out.println("Input lended:");
                newbook.setLended(scanner.nextInt());
                check = false;
            }
            catch(InputMismatchException e){
                System.out.println("Lended is number.Input lended");
                check = true;
                scanner.nextLine();
            }
            
        }while(check);
        // price 
        
        do{
            try{
                System.out.println("Input price:");
                newbook.setPrice(scanner.nextDouble());
                check = false;
                scanner.nextLine();
                
            }catch(InputMismatchException e){
                System.out.println("Price is number.Input price");
                check = true;
                scanner.nextLine();
            }
        
        }while(check);
        
        return newbook;
        
    }
    
    //1.1 accept and add a new Book to the end of book list
    public void addLast() {
        books.addLast(getBook());
    }

    //1.2 output information of book list
    public void list() {
        
        String c_code = "Code";
        String c_title = "Title";
        String c_quantity = "Quantity";
        String c_lender = "Lender";
        String c_price = "Price";
        String c_value = "Value";
        
        System.out.println(String.format("%s %10s %22s %7s %8s %9s",c_code,c_title,c_quantity,c_lender,c_price,c_value));
        books.traverse();   
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
