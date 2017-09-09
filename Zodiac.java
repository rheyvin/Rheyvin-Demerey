package zodiac;

import java.util.Scanner;
public class Zodiac {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter Month:");
        int month = i.nextInt();
        System.out.print("Enter Days:");
        int day = i.nextInt();
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }

        if      ((month == 12 && day >= 22 && day <= 31) || (month ==  1 && day >= 1 && day <= 19))
            System.out.println("The Zodiac sign for "+monthString +" " +day +" is Capricorn");
        else if ((month ==  1 && day >= 20 && day <= 31) || (month ==  2 && day >= 1 && day <= 17))
            System.out.println("The Zodiac sign for "+monthString +" " +day +" is Aquarius");
        else if ((month ==  2 && day >= 18 && day <= 29) || (month ==  3 && day >= 1 && day <= 19))
            System.out.println("The Zodiac sign for "+monthString +" " +day +" is Pisces");
        else if ((month ==  3 && day >= 20 && day <= 31) || (month ==  4 && day >= 1 && day <= 19))
            System.out.println("The Zodiac sign for "+monthString +" " +day +" is Aries");
        else if ((month ==  4 && day >= 20 && day <= 30) || (month ==  5 && day >= 1 && day <= 20))
            System.out.println("The Zodiac sign for "+monthString +" " +day +" is Taurus");
        else if ((month ==  5 && day >= 21 && day <= 31) || (month ==  6 && day >= 1 && day <= 20))
            System.out.println("The Zodiac sign for "+monthString +" " +day +" is Gemini");
        else if ((month ==  6 && day >= 21 && day <= 30) || (month ==  7 && day >= 1 && day <= 22))
            System.out.println("The Zodiac sign for "+monthString +" " +day +" is Cancer");
        else if ((month ==  7 && day >= 23 && day <= 31) || (month ==  8 && day >= 1 && day <= 22))
            System.out.println("The Zodiac sign for "+monthString +" " +day +" is Leo");
        else if ((month ==  8 && day >= 23 && day <= 31) || (month ==  9 && day >= 1 && day <= 22))
            System.out.println("The Zodiac sign for "+monthString +" " +day +" is Virgo");
        else if ((month ==  9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22))
            System.out.println("The Zodiac sign for "+monthString +" " +day +" is Libra");
        else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21))
            System.out.println("The Zodiac sign for "+monthString +" " +day +" is Scorpio");
        else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21))
            System.out.println("The Zodiac sign for "+monthString +" " +day +" is Sagittarius");
        else
            System.out.println("Illegal date");

    }
     
}
