package Assignment1.Module1;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the temperature in Celsius:");
        double c = sc.nextDouble();
        double fahrenheit= (c * (9/5) + 32) ;
        System.out.println("Temperature in Fahrenheit:" +fahrenheit);



    }
}
