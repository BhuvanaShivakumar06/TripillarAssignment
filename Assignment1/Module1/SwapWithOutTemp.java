package Assignment1.Module1;

public class SwapWithOutTemp {
    public static void main(String[] args) {
        int a = 10, b= 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(" after swap: a =" + a +", b=" + b);
    }
}
