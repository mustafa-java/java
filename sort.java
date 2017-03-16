/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author lenovo
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in =new Scanner(System.in);
   
         int[] first=new int[4];
         for(int i=0;i<first.length;i++){
             
             first[i]=in.nextInt();
            
         }/////////////////////////////
         int max=0,min=first[1];
         for(int i=0;i<first.length;i++){
             if(first[i]>max){
                 max=first[i];
             }
             if(first[i]<min)
             {
               min=first[i];  
             }
         }
  
         ///////////////////////////
         int c=first.length;
       do{
             for(int j=0;j<4;j++)
             {
                 if(first[j]==max)
                 {
                     System.out.print(max);
                     c--;
                 }
             }
          --max;   
         }while(c>0);
         
         
        
         
    }
    
}
