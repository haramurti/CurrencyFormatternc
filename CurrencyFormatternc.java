import java.text.NumberFormat;
import java.time.*;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatternc {
    public static void main (String[]args){

        Time();

        System.out.println(" ");
        System.out.println("this is nevalnc CurrencyFormatternc, hello where ever you are from");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("input the amount money an we will automaticly format it to local Currnecy!");


        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();

        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount);
        String india = NumberFormat.getCurrencyInstance (new Locale("en", "in")).format(amount);
        String indonesia = NumberFormat.getCurrencyInstance (new Locale("id", "ID")).format(amount);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount);
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(amount);
        
        System.out.println("US: " + us );
        System.out.println("INDIA: " + india);
        System.out.println("CHINA: " + china);
        System.out.println("FRANCE: " + france);
        System.out.println("INDONESIA: " + indonesia);

    }   
    public static void Time() {
        LocalDate date = LocalDate.now();
        System.out.println("date today = " + date);
        LocalTime Timenow = LocalTime.now();
        System.out.println("time now = " + Timenow);
        
    }

}  