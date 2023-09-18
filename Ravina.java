/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ravina;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ravina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println ("Select Converter");
        System.out.println ("Press 1 to Celsius to Fahrenheit");
        System.out.println ("Press 2 to Fahrenheit to Celsius");
        System.out.println ("Press 3 to Kelvin to Fahrenheit");
        System.out.println ("Press 4 to Kelvin to Celsius");
        System.out.println ("Press 5 to Celsius to Kelvin");
        System.out.println ("Press 6 to Fahrenheit to Kelvin");
        double a=0;
        double b=a *((9/5)+32);
        double c=0;
        double d=(((32*a)-32)*5/9);
        double e=a+273.25;
        double f=((32*a)-32)*(5/9)+(273.25);
        double h=a-273.15;
        double g=1.8*(a-273.15)+32;

        c = input.nextDouble();
        System.out.println ("Enter the first value");
        a = input.nextDouble();
        if (c==1) {
            b = (((32*a)-32)*(5/9));
            System.out.println("The value is:" + b);
        } else if (c==2){
            d = ((a-32)*(5/9));
            System.out.println ("The value is:" + d);
        } else if (c==3){
            g = (a-273.15)*(9/5)+32;
            System.out.println ("The value is:" + g);
        } else if (c==4){
            h = a-273.15;
            System.out.println ("The value is:" + h);
        } else if (c==5){
            e = a+273.15;
            System.out.println ("The value is:" + e);
        } else if (c==6);{
            f = ((32*a)-32)*(5/9)+(273.15);
            System.out.println ("The value is:" + f);
        } else{
                System.out.println ("Cannot Perform");
                }



               

        
    }
    
}
