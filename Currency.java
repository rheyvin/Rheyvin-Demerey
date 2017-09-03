/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currency;

/**
 *
 * @author rldemerey
 */
import java.util.Scanner;
public class Currency {

    public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Philippine peso:" );
			float num=sc.nextFloat();
			float usd=num/43.33089f;
			float euro=usd*0.734719f;
			float yuan=usd*6.346934f;
			float koruna=usd*18.77263f;
			float krone=usd*5.449007f;
			float sheqel=usd*3.726334f;
			float dinar=usd*0.274588f;
			System.out.println("US Dollar : " + usd);
			System.out.println("Euro : " + euro);
			System.out.println("Yuan : " + yuan);
			System.out.println("Koruna : " +koruna);
			System.out.println("Krone : " +krone);
			System.out.println("Sheqel : " + sheqel);
			System.out.println("Dinar : " + dinar);
	}


}

