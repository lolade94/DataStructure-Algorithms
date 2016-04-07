/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistc;

/**
 *
 * @author lolade94
 * @param <T>
 */
public abstract class CircularLinkedList<T> extends LinkedListClass<T> {

    @Override
    public boolean search(T searchItem) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    boolean found;
    found=false;
    
    LinkedListNode<T> current;
    current=first;
    
    
    while(current!=null && !found){
        Comparable<T> temp= (Comparable<T>)current.info;
        
        if(temp.compareTo(searchItem)==0)
            found=true;
        
        else
            current=current.link;   
    }
    
    if(found)
        found=current.info.equals(searchItem);
    
    return found;
    }
    
    public void insert(T insertNode){
       LinkedListNode<T> trail;
       LinkedListNode<T> current;
       boolean endloop;
       int nodeseen=0;
        
       LinkedListNode<T> newNode;
       newNode= new LinkedListNode<T> (insertNode, null);
       
       
     
 
       
       //Case 1: list is empty;
       if(first==null)
       {    first=newNode;
            newNode.link=first;
            
            count++;
       }
       
       //Case 2: list has one node to insert before or after
        
       else if(first==first.link)
               // pointint to 1st node location
           {
           Comparable<T> temp= (Comparable<T>) first.info;
           //5 > 2 //insert newNode in front;
           if(temp.compareTo(insertNode)>=0)
           {
               first.link=newNode;
               newNode.link=first;
               first=newNode;
               
               count++;
           }
           //1>2  1,2
           else{//insert after first node;
               first.link=newNode;
               newNode.link=first;
               last=newNode;
               
               count++;
             }
       }
       else{
           trail=first;
           current=first;
           endloop=false;
    
           while(nodeseen<count && !endloop){
               Comparable<T> temp= (Comparable<T>)current.info;
             if(temp.compareTo(insertNode)>=0)
                 endloop=true;
             else 
             {
              trail = current;
              nodeseen++;
              if(nodeseen!=count)
              { current=current.link;}
              else{current=last;}
  
             }
             
           } 
           
       
       if(current==first){
               newNode.link=first;
               first=newNode;
               
               count++;
               
               }
       else if(current==last){
           newNode.link=first;
           last.link=newNode;
           last=newNode;
           
           count++;
       }
       else{
           trail.link=newNode;
           newNode.link=current;
           if(current.link==null)
               last=newNode;
           count++;
       }
    }
    }

    @Override
    public void insertFirst(T newItem) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    insert(newItem);
    }

    @Override
    public void insertLast(T newItem) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    insert(newItem);
    }

    @Override
    public void deleteNode(T deleteItem) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void initilizeList() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
