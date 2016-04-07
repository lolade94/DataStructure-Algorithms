/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmgcf;

/**
 *
 * @author lolade94
 */
public class CommonFactors {
    
    
    private int x;
    private int y;
    
    public CommonFactors(int x, int y){
        
        this.x=x;
        this.y =y;
    }
    
    public void set(int x, int y){
        
        this.x=x;
        this.y=y;
        
    }
    
    public int getX(){
        
        return x;
    }
    
    public int getY(){
        
        return y;
    }
    public int gcd(int p, int r){
     p=x;//variables to point x and y memory location
     r=y;
     
     while(p!=r){//check if numbers to be equal, gcd found!
         if(p>r){
             p=p-r;
         }
         else{
             r=r-p;
         }
         
     }
     //at this point, gcd(p,m) =gcd(p,p)=p
   
     return p;
   }
    //12 4
    //8 4
    //4 4
    //method 2 for faster result using modulus
    
    public int gcd2(int p, int q){
        
        p=x;
        q=y;
        while( p!=0 && q!=0){
        if (p>q){
            p=p%q;
        }
        else
            q=q%p;
        
    }
        return Math.max(p, q);
    }
    // 12 4
    //0 4
  
    @Override
    public String toString(){
        
        return " " + x + " " + y;
    }
    
}
