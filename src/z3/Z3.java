/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z3;

import java.util.Scanner;
public  class Z3{
    
    public static void main( String [] args){
        
         Scanner colo = new Scanner(System.in);
         int x,y;  
         double r;
     
         System.out.print(" enter x value :  ");
          x =  colo.nextInt();
     
        System.out.print("  enter the y value :  ");
        y = colo.nextInt();
        
        r = Math.sqrt( x*x + y*y);
        
        System.out.println( r + " is the hypotenuse");
       
    }  
    
}