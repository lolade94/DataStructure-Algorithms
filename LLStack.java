/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackclient;

/**
 *
 * @author lolade94
 */

import java.util.*;

public class LLStack {

       private LinkedList link= new LinkedList();
       
       public LLStack(){
           
       }
       
       public boolean isEmpty(){
         return  link.isEmpty();
       }
       
       public void push(Object n){
           link.push(n);
       }
       
       public void pop(){
          link.pop();
       }
       
       public Object peek(){
           
           return link.peek();
       }
       
        /**
         *
         * @return
         */
        @Override
       public String toString(){
           return link.toString();
       }
       
       public boolean match(String str){
           //(())
           
           
          

           char c;
           for (int i=0; i<str.length(); i++){
               c = str.charAt(i);
               if (c=='('){
               link.push(c);
               }
               else if(c=='(')
                   link.push(c);
               else if(c==')')
                 if(link.isEmpty())
                    return false;
               else if((char)link.peek() == '(')
                   link.pop();
               else
                   return false;
               if(c ==')')
                   link.push(c);
               else if((char)link.peek()=='(')
                   link.pop();
               else
                   return false;
           }
           
           return link.isEmpty();
                       
       }
       
     
    }


