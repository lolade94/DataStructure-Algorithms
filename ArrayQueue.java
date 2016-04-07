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
public class ArrayQueue {
    
    private Object[] arr;
    private int front;
    private int rear;
    private int size;    
    
    public ArrayQueue(){
        // this.(100);
    }
    
    public ArrayQueue(int n){
        size=n;
        arr= new Object[size];
        front=rear=-1;
    }
    
    
    public boolean isEmpty(){
        return front==-1;
    }
    
    
    public boolean isFull(){
        
        return rear == size - 1 ;
    }
    
    public void enqueue(Object data){
        //array is full or empty
        if(rear==size-1 || rear==-1)
        {   
            rear=front= 0;
            arr[0]=data;
               
        } 
        else
        { 
            arr[++rear]= data;
         
        }
        System.out.println(rear);
    }
    
   
    
    @Override
    public String toString(){
        String str="";
       for(int i=0; i<arr.length; i++){
         str+=  arr[i] +" ";
       }
       
       return str;
    }
    
    
}
    
    
    
    
