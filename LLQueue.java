/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueclient;

/**
 *
 * @author lolade94
 */

import java.util.*;

public class LLQueue {
    
    private LinkedList llqueue= new LinkedList();
    
    
    public void enqueue(Object n){
    
     llqueue.addLast(n);
    }
    
    public void dequeue(){
        llqueue.removeFirst();
    }
    
    public boolean isEmpty()
    {
        return llqueue.isEmpty();
    }
    
    public int size(){
        
        return llqueue.size();
    }
    
    
    @Override
    public String toString(){
        
        return llqueue.toString();
    }
}
