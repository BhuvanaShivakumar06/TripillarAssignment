package Assignment1.Module1;

public class SwapWithTemp {
    public static void main(String[] args) {
        int a = 10, b= 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(" after swap: a =" + a +", b=" + b);
    }
}
