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

public class SearchesAndSorts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Array Size: ");
        int size;
        size = input.nextInt();

          //create new car object
       Car c=new Car();
       
       
        //create a care array
       Car[] car= new Car[size];
       
       //filling a car
       c.fill(car);
       c.bubble(car);
       System.out.println(" Enter the key: ");    
       int numb= input.nextInt();
       
       int target = c.binarySearch(car, numb);
      
       c.printArr(car);
       
       
        int[] arr = new int[size];
        int num = 0;

        fillArray(num, arr);
        bubbleSort(arr);
        printArray(arr);

        System.out.println();

        int key = 0;
        int item = 0;

        System.out.println("Enter target key: ");
        key = input.nextInt();

        item = binarySearch(key, arr);
        System.out.println("Key of: " + item);
        
       
         }

    public static void fillArray(int x, int[] a) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a series of numbers: ");
        for (int i = 0; i < a.length; i++) {
            x = input.nextInt();
            a[i] = x;
        }
    }

    //2, 1, 4, 3
    //1, 2, 4, 3
    public static void bubbleSort(int[] a) {
        int temp;
        //
        for (int i = 0; i < a.length; i++) {

            //0<2 process of elimination
            for (int j = 0; j < a.length - (i + 1); j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int binarySearch(int k, int[] a) {

        int lo;
        int high;

        lo = 0;
        high = a.length - 1;
        while (lo <= high) {
            int mid;
            mid = (lo+high) / 2;
            //1 2,3, 4, 6, 7, 8
            if (k < a[mid]) {
                high = mid - 1;
            }
           else if (k > a[mid]) {
                lo = mid + 1;
            } 
            else {
                return mid;
            }
        }

        return -1;
    }

}
