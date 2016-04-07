/*
' * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackclient;

/**
 *
 * @author lolade94
 */
public class StackClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //declare array stack and linkedlist stack
         
        Stack s= new Stack();
        LLStack l= new LLStack();
       
        
        //Arraylist Implementation
        s.push(9);
        s.push(32);
        s.push(13);
        s.peek();
        System.out.println("Peek "+ s.peek());
        System.out.println("Stack bult"+ s.toString());
        s.clear();
        System.out.print("Stack is empty? " + s.isEmpty());
        System.out.println();
       
        //Linked List Implementation
        
        l.push("Hello");
        l.push("Gurl");
        l.push("Snapchat");
        
        System.out.println("Peek " + l.peek());
        System.out.println(l.toString());
        
       String str="((()))";
       boolean match= l.match(str);
      // System.out.println("Is string match "+ match);
        
    }
    
}
