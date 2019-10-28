
import entity.Book;
import java.util.InputMismatchException;
import util.MyList;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {

        BookList bookList = new BookList();
        
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println("Book List");
            System.out.println("1. Input Book and add to the end");
            System.out.println("2. Display books");
            System.out.println("3. Search by code");
            System.out.println("4. Input Book and add to beginning");
            System.out.println("5. Add Book after position k");
            System.out.println("6. Delete Book at position k");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            int choice = -1;
            
            while(choice < 1 || choice > 6){

            System.out.println("Enter \"1\", \"2\", \"3\", \"4\", \"5\" or \"6\"");
            if(scanner.hasNextInt())
               choice = scanner.nextInt();
            }   
            switch (choice) {
                case 1:
                    bookList.addLast();
                    break;
                case 2:
                    bookList.list();
                    break;
                case 3:
                    String keyword = scanner.nextLine();
                    System.out.println("Enter book code: " + keyword);
                    bookList.search(keyword);
                    break;
                case 4:
                    bookList.addFirst();
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 0:
                    keepRunning = false;
                    break;
                default:
                    break;
            }

        }

    }
}
