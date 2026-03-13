package Assignment1.Module1;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius :");
        double r = sc.nextDouble();
        double area = Math.PI * r * r ;
        System.out.println("area of the circle:" +area);



    }
}
