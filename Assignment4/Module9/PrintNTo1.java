package Assignment4.Module9;

public class PrintNTo1 {
    static void print(int n){
        if(n==0) return;
        System.out.println(n + " ");
        print(n -1);
    }
    public static void main (String[] args){
        print(5);
    }
}
