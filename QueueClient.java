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
public class QueueClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayQueue arr= new ArrayQueue(5);
        arr.enqueue(10);
        arr.enqueue(13);
        arr.enqueue(5);
        arr.enqueue(9);
        arr.enqueue(13);
                
        LLQueue ll= new LLQueue();
        
        ll.enqueue("yo");
        ll.enqueue("woah");
        ll.enqueue("HOLLA");
        ll.enqueue("shawty");
        ll.enqueue("wssup");
          
        
        ll.dequeue();
        /*arr.enqueue(21);
        
        arr.enqueue(23);
        arr.enqueue(123);
*/
        System.out.println(arr.toString() );
        System.out.println("Is list full " + arr.isFull());
        
        System.out.println("Queue List: " + ll.toString());

        
    } 
    
}
