/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float total,average,a,b,c,d,e;
      
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the mark of English:");
        a=input.nextFloat();
        System.out.println("Enter the mark of Tamil:");
        b=input.nextFloat();
        System.out.println("Enter the mark of Maths:");
        c=input.nextFloat();
        System.out.println("Enter the mark of Science:");
        d=input.nextFloat();
        System.out.println("Enter the mark of Social:");
        e=input.nextFloat();
        total=a+b+c+d+e;
        average=total/5;
        System.out.println("The Total Marks is " + total);
        System.out.println("The Average Mark is " + average+"%" );
    }
    
}
