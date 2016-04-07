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
public class UnorderedLinkedList<T> extends LinkedListClass<T>
{
    
   public UnorderedLinkedList(){
       
       super();
   }

    @Override
    public boolean search(T searchItem) {
   boolean found;
   found=false;
   
   LinkedListNode<T> current;
   current=first;
   
   while( current!= null && !found){
       
       Comparable<T> temp = (Comparable<T>)current.info;
       
       if(temp.compareTo(searchItem)==0)
           found=true;
       else
           current=current.link;
   }
   
   if(found)
      found= current.info.equals(searchItem);
   return found;
  
  }

    @Override
    public void insertFirst(T newItem) {
     
        
    LinkedListNode<T> newNode;
    
    newNode = new LinkedListNode<T> ( newItem, first);
    
    first= newNode;
    
    if(last==null)
       last = newNode;
        
    count++;
    }

    @Override
    public void insertLast(T newItem) {
   
       LinkedListNode<T> newNode;
       newNode= new LinkedListNode( newItem, null);
       
       if(first==null)
       {
           
           first= newNode;
           last= newNode;
       }
       
       else{
           last.link= newNode;
           last=newNode;
       }
       count++;
    
    }

    @Override
    public void deleteNode(T deleteItem) {
        
        
        LinkedListNode<T> trailNode;
        LinkedListNode<T> currentNode;
        
        boolean found;
     
        
        
        if(first==null) //case 1:list is empyt
            System.out.println("Empty list. Add items of data!");
        else
        {// case 2: if list has 1 node
          if(first.info.equals(deleteItem))
            { first=first.link;//first node link points to next node or null
             
            if(first== null)
               last=null;
          
            count--;//delete node
             }//end case 2
          
        //else case 3
           else{ 
                //case 3: search and traverse for the list
               found=false;
               trailNode=first;
               currentNode=first.link;
                
                
                while(currentNode!=null && !found)
                {
                 if(currentNode.info.equals(deleteItem))
                  found=true; 
                 else{
                trailNode=currentNode;//trail points to next currentnode
                currentNode= currentNode.link;//points to  next node
                 }
 
              }//end while
                
                if (found) //true or if found
                {    count--;//delete data
                     trailNode.link=currentNode.link;//trail node link points to deleted node's info to current.link
                
                if(last==currentNode)
                   //node to be deleted is the last node
                   last=trailNode;//now the last node is replaced with the node before it
                //last node is now the trail current;
                
               }
                else
                    System.out.println("Item to be deleted is not in the list.");
            }    
        }
    }
   

    @Override
    public void initilizeList() {
       super.initializeList();
    }
   
  
    
    
    
}
