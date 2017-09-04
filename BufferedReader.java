
package act3;
import java.io.*;
public class Act3 {
    public static void main(String[] args)throws IOException {
    BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
    String a,b,c;
    int average;
    System.out.print("Enter 1st Score:");
    String inputa = input.readLine();
    int result1 = Integer.parseInt(inputa); 

    int n1 = Integer.parseInt(inputa);
    
    System.out.print("Enter 2nd Score:");
    String inputb = input.readLine();
    int result2 = Integer.parseInt(inputb);
    int n2 = Integer.parseInt(inputb);
    
    System.out.print("Enter 3rd Score:");
    String inputc = input.readLine();
    int result3 = Integer.parseInt(inputc);

    int n3 = Integer.parseInt(inputc);
    
    average = (n1+n2+n3)/3;
    System.out.print("The Average is:" +average);
    
    if(average >= 60)
        System.out.print(" :) ");
    else
        System.out.print(" :( ");
    }
    
}
