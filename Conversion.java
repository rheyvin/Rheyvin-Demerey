/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp;

import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        double f;
        double c;
        System.out.println("Temperature Conversion");
        System.out.print("Enter Celcius:");
        c= i.nextDouble();
        f = c * 1.8 + 32;
        System.out.println("Its Equivalent in fahrenheit is:" +f);
        System.out.print("Enter Fahrenheit:");
        f = i.nextDouble();
        c = (f - 32) * .5556;
        System.out.println("Its Equivalent in Celcius is:" +c);
            
        System.out.println("Distance Conversion");
        double cm, m, dm , km, dcm, mm;
        System.out.print("Enter Centimeter: ");
        cm = i.nextDouble();
        m = cm / 100;
        dm = cm  * 0.1;
        km = cm * 0.00001000000;
        dcm = cm * 0.001;
        mm = cm * 10; 
        System.out.println("Meter:" +m +"m");
        System.out.println("Decimeter:" +dm + "dm");
        System.out.println("Kilometer:" +km + "km");
        System.out.println("Decameter:" +dcm + "dm");
        System.out.println("Millimeter:" +mm +"mm");
        
    }
    
}
