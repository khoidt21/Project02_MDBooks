
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

        Scanner input = new Scanner(System.in);
        //boolean mainLoop = true;
        BookList bookList = new BookList();

        int choice = -1;
        do {
            System.out.println("Book List");
            System.out.println("1. Input Book and add to the end");
            System.out.println("2. Display books");
            System.out.println("3. Search by code");
            System.out.println("4. Input Book and add to beginning");
            System.out.println("5. Add Book after position k");
            System.out.println("6. Delete Book at position k");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
                   
            try{
            choice = input.nextInt();
            switch (choice) {

                case 1:
                    bookList.addLast();
                    break;
                case 2:
                    bookList.list();
                    break;
                case 3:
                    System.out.print("Enter book code: ");
                    input = new Scanner(System.in);
                    String code = input.nextLine();
                    System.out.println("Inforation of book code " + code);
                    bookList.search(code);
                    break;
                case 4:
                    bookList.addFirst();
                    break;
                case 5: 
                    //add after 
                    bookList.addAfter();
                    break;

                case 6:

                case 0:
                    System.out.println("Exiting Program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println(choice + " is not a valid Menu Option! Please Select Another.");

            }
            }catch(InputMismatchException ex){
                System.out.println("Choice is number input");
                input.nextLine();
            }
        } while (choice != 0);

    }

}
