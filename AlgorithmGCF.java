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
public class AlgorithmGCF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=8;
        int y=42;
        CommonFactors gcd= new CommonFactors(x, y);
        CommonFactors gcd2=new CommonFactors(25,5);
        
        int gcf= gcd.gcd(x,y);
        int gcf2= gcd2.gcd2(25, 5);
        
        System.out.println("Greatest Common Factor of " + x + " and " + y + " is " + gcf);
        
        System.out.println("Greatest Common Factor of " + 25 + " and " + 5 +" is " + gcf2);
        
    }
    
}
