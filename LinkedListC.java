/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistc;

/**
 *
 * @author lolade94
 */
import java.util.*;
public class LinkedListC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input= new Scanner(System.in);
     
     UnorderedLinkedList<Integer> numbers= new UnorderedLinkedList<Integer>();
     
    Integer num;
    
    System.out.println("Enter numbers: ");
    num=input.nextInt();
    
    while(num!=999){
        
        numbers.insertFirst(num);
        num=input.nextInt();
        
    
    }
      System.out.print("Numlist: ");
      numbers.print();
    
      
     // System.out.println("The first node is: " + numbers.front() );
    
     // System.out.println(" The last node is: " + numbers.back() );
      
      boolean found= numbers.search(8);
      
      System.out.println("Is number 8 in the list? " + found);
      
      System.out.println("The size of the list: " + numbers.length());
      
      numbers.deleteNode(9);
     numbers.print();
      
               
    }
    
}
