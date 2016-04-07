    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistc;

import java.util.NoSuchElementException;

/**
 *
 * @author lolade94
 * @param <T>
 */
public abstract class LinkedListClass<T> implements LinkedListADT<T>  {
    
    /**
     *
     * @param <T>
     */
    protected class LinkedListNode<T> implements Cloneable
    {
        
    
    public T info;//data
    public LinkedListNode<T> link;//address
    
    
    public LinkedListNode(){
        //this is the empty constructor
         info=null;//initialize to nothing
         link=null;
        
    }
    
    public LinkedListNode(T elem, LinkedListNode<T> ptr){
        //alternate constructor to instantiate data and address link
        info = elem;//node data and data type
        link = ptr;//addresst to next node
    
    }
    
    
    //make a shallow copy throw exception the try and catch
    
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        LinkedListNode<T> copy= null;//initialize node copy
        
        try{
              //typecast node to super.clone()
            copy = (LinkedListNode<T>) super.clone();
        }
        
        catch(CloneNotSupportedException e){//catch exception
            
            copy=null;
        }
  
        return copy;//pass back copied node
   }
    
    
    @Override
    public String toString(){
        //convert node data to string
        return info.toString();
    
    }
    
    
    
    
    
    
    }//end of protected method
    
    
    public class LinkedListIterator<T> {
       
        protected LinkedListNode<T> current; //points to current node in the list
        protected LinkedListNode<T> previous; //points to the node before the current node
        
    
    
    public LinkedListIterator(){
        
        current = (LinkedListNode<T>)first;
        previous = null;   
    
    }
    
    //method to reset the iterator back to first node
    
    public void reset(){
        
        current = (LinkedListNode<T>)first;
        previous= null;
        
    }

//return a reference to current and advance iterator to next node
    
    public T next(){
        
        if(!hasNext())
            throw new NoSuchElementException();
            LinkedListNode<T> temp = current;//temporary store current
            previous = current;
            current = current.link;//point to the next node
            
            return temp.info;//display previous
        
       }
    
    
    public boolean hasNext(){
      
        return current!=null;
        //as long as current doesn't point to nothing
    }
    
    
    public void remove(){
        
        if (current== null)
            throw new NoSuchElementException();
    
        if (current==first)//both point to first node
        {first = first.link;// store next node address
            current = (LinkedListNode<T>)first;//current stores next node address
            previous = null;//previous node is deleted
            
         if(first==null)//no first node then last node is empty too
             last=null;
        }
        
        
        else{
            previous.link=current.link;//both previous and current are pointing to the same NODE
            
            if(current==last) //current  and last points same node
            {    last=first; //last is point to first node so last node is the first node
            while(last.link!=null) //as long last node isn't nothing then continue on 
                last=last.link;  //next node address
            }
            current= current.link; //store next node address
         }
     count--; //delete a node 
    }
  
  }//endLinkedListIterator 

protected LinkedListNode<T> first;
protected LinkedListNode<T> last;
protected int count;


public LinkedListClass(){
    
    first=null;
    last=null;
    count=0;
    
}

public void initializeList(){
    
    first=null;
    last=null;
    count=0;
    //everything empty
}

    @Override
    public boolean isEmptyList(){
    
    return(first == null);//first node is emppty
}
    
    public void print(){
        
        LinkedListNode<T> current;
        
        current=first;//start an first node
        
        while(current!= null)//as long as current not equal to null
        {
            System.out.print(current.info + " ");//data information
            current= current.link;  //next current       
        }
       
      }
    

    @Override
    public int length(){//size of list
    
    return count;
}

    @Override
    public T front(){//first node data
                 //first is Type 
    return first.info;
}

    /**
     *
     * @return
     */
    @Override
    public T back(){
    return last.info;
}

    /**
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
   public Object clone() throws CloneNotSupportedException
    {
        
        LinkedListClass<T> copy= null;
        
        
        try{
            
            copy= (LinkedListClass<T>)super.clone();
        }
        catch(CloneNotSupportedException e){
            copy=null;
        }
                
   
    if (first!= null){
        copy.first= (LinkedListNode<T>)first.clone();
        //copy to the first node
        
        //copy to the copy the first node into the the last node
        copy.last=copy.first;
        
        LinkedListNode<T> current;
        if(first!=null)
            current=first.link;//next node
        else                   //list is empty
            current = null;
        while(current!=null)//loop through list
        {
            //clone the remaining nodes
         copy.last.link= (LinkedListNode<T>) current.clone();
         copy.last=copy.last.link;
         current=current.link;
    
        }
    }
    
    
    return copy;
    
  }
   
    
    public LinkedListIterator<T> iterator(){
        
        return new LinkedListIterator();
    }
    
    
    
    @Override
    public abstract boolean search(T searchItem);

    /**
     *
     * @param newItem
     */
    @Override
    public abstract void insertFirst(T newItem);
    @Override
    public abstract void insertLast(T newItem);

    /**
     *
     * @param deleteItem
     */
    @Override
    public abstract void deleteNode(T deleteItem);

}//end of linkedlistClass






