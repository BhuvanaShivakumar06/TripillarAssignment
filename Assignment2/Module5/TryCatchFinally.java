package Assignment2.Module5;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
        } catch (Exception e) {
            System.out.println("Exception occurred");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
