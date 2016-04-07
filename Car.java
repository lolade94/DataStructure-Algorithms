/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchesandsorts;

/**
 *
 * @author lolade94
 */
import java.util.*;

public class Car implements Comparable<Car> {
    
   private String car;
   private int num; 
 //private Car[] = new Car[5];
   
   public Car(){
       
       car="";
       num=0;
   }

   public Car( String c, int n){
       
       car=c;
       num=n;
       
   }
   public int getValue(){
       return num;
   }
   
   public String getCar(){
       return car;
   }
   
   
    @Override
    public int compareTo(Car t) {
     
        return getValue() - t.getValue();
    }
    
    
    public void fill(Car [] cars){
    Scanner input= new Scanner(System.in);
        for(int i=0;i<cars.length;i++){
            
       System.out.println("Enter Car Model: ");
           System.out.print("Car: ");
           car=input.next();

           System.out.print("Model #" );
           num=input.nextInt();
           cars[i]= new Car( car, num);        
    }
    }
    
    public void printArr(Car[] cars){
        
     for(int i=0;i<cars.length;i++){
          System.out.print(cars[i] + " ");
     }
    }
    
    
    public void bubble(Car[] cars){
        Arrays.sort(cars);
    }
    
    public int binarySearch( Car[] cars, int key){
       int low=0;
       int high= cars.length-1;
       
     while(low<=high){
         int mid;
         mid=(low + high)/2;
          if(key<cars[mid].num)
           high=mid-1;
          else if(key<cars[mid].getValue())
              low= mid+1;
     }
        return -1;
    }
   @Override
    public String toString(){
     return "Car: " + car + " | " + "Model: " + num + "\n";
    }
}
