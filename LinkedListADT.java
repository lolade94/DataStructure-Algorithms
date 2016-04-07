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
public interface LinkedListADT <T> extends Cloneable{
    
    //implement these methods in LinkedListNode class
    public boolean isEmptyList();
    public void initilizeList();
    public Object clone() throws CloneNotSupportedException;
    public int length();
    ///these implement in LinkedListNode Class
    public T front();
    public T back();
    
    //for unordered and ordered linked list
    public boolean search(T searchItem);
    public void insertFirst(T newItem);
    public void insertLast(T newItem);
    public void deleteNode(T deleteItem);
    
    
    
}
