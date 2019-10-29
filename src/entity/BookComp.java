/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class BookComp implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        if(o1.getPrice() < o2.getPrice()){
            return 1;
        }
        else{
            return -1;
        }
    }
    
}
