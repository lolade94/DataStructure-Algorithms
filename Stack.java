package stackclient;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lolade94
 */

import java.util.*;

public class Stack {
    private ArrayList stackList= new ArrayList();
   // private LinkedList link= new LinkedList();
    
    public class List{
       private LinkedList link= new LinkedList();
       
       public List(){
           
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
     
    }
    public Stack(){
        
    }
    
    public Stack(int n){
        stackList.ensureCapacity(n);
        
    }
    
    public boolean isEmpty(){
        
      return stackList.isEmpty();
    }
    
    public void clear(){
        stackList.clear();
        
    }
    public Object peek(){
        if(stackList.isEmpty())
            throw new EmptyStackException();
      return stackList.get(stackList.size()-1);
    }
    public void push(Object n){
        stackList.add(n);
    }
    
    public Object pop(){
        if(stackList.isEmpty())
           throw new EmptyStackException();     
     return  stackList.remove(stackList.size()- 1);
    }
    
    @Override
    public String toString()
    {
      return stackList.toString();
    }
}