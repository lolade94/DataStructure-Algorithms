/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rescurvise;

/**
 *
 * @author lolade94
 */
public class Rescurvise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    
    
       int factors= fact(4);
    
       System.out.println( "Factorial of 4 is " + factors);
       
        count (8);
        System.out.println();
       // String test= "Hello";
        
        super_write(10);
        
        quiz(5);
        
      // print_my_name();
    }
    
    public static int fact (int n){
        
        //state easy case or base case
        if( n==0|| n==1)
            return 1;
        else
            return n * fact(n-1);
        
    }
    
    //
    public static void print_my_name(){
        
       System.out.println("My name is Lola!");
    
      // print_my_name();
    }
    
    public static void super_write(int n){
        if (n<0){
            System.out.println("-");
            super_write(Math.abs(n));
        }
        else if(n<10)
            System.out.println(n);
        else{
            super_write(n/10);
            System.out.println(n%10);
        }
    }
    
    
    public static void quiz(int i){
        
        if(i>1){
            
            quiz(i/2);
            quiz(i/2);
        }
        System.out.print("*");
    }
    
    public static void count( int n)
  
    {
        if(n>0){
            System.out.print ( n + " ");
            count(n-1);
        }
    }
    
    

}
