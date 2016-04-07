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
public class OrderedLinkedList<T> extends LinkedListClass<T>  {
    
    public OrderedLinkedList(){
        super();
    }
    

    @Override
    public boolean search(T searchItem) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    boolean found;
    found= false;
    
    LinkedListNode<T> current;
    
    current=first;
    
    while( current!= null && !found)
    {    
       Comparable<T> temp= (Comparable<T>) current.info;
       
       if(temp.compareTo(searchItem)>=0)
           found=true;
       else
           current=current.link;
    }
    
    if(found)
        found=current.info.equals(searchItem);
    
    return found;
 }
    
    public void insert( T newItem){
        
        LinkedListNode<T> current= null;
        LinkedListNode<T> trailCurrent;
        boolean found;
        
        found=false;
        
        LinkedListNode<T> newNode;
        newNode= new LinkedListNode<T>( newItem, null);
        
        
        //case 1: list is empty  now we insert a node
        if(current==first){
            
            
            first=newNode;//1st pointer newNode
            last=newNode;//last pointer to newNode
            
            
            count++;//1 node
        }
        
        
        else{
            trailCurrent= null;
            current=first;
            
            while(current!=null && !found){
             //search the list to find the right positon of insertion
                Comparable<T> temp= (Comparable<T>)current.info;
                //need to compare item dat to be inserted to the data in each node
                
                if(temp.compareTo(newItem)>=0)//found
                    found=true;
                 else
                {   //move to the next Node
                    trailCurrent= current;
                    current= current.link;
                }         
            }
            //case 2: inserting at the first postion
            if(current==first){
             newNode.link=first;
             first=newNode;
             
             count++;
            }
            else{
                
              //case 3: insert in the middle
                trailCurrent.link= newNode;
                newNode.link=current;
                
                
                if(current==null)//if current is pointing to last postion
                    last=newNode; //add newNode at last postion;
                
                count++;
            }
            
          }
        }
        
        
    
    @Override
    public void insertFirst(T newItem) {
       insert(newItem);
    }

    /**
     *
     * @param newItem
     */
    @Override
    public void insertLast(T newItem) {
       insert(newItem);
    }

    @Override
    public void deleteNode(T deleteItem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void initilizeList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
