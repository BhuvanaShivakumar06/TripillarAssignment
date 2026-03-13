package Assignment1.Module2;


import java.util.Scanner;

public class SquareMethods {
    static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Square: " + square(n));
    }
}

