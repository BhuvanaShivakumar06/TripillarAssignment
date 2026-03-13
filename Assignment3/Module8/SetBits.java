package Assignment3.Module8;

public class SetBits {
    public static void main(String[] args) {

        int num = 7;
        int count = 0;

        while(num > 0){
            count += num & 1;
            num = num >> 1;
        }

        System.out.println("Set Bits = " + count);
    }
}
