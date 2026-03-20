package Assignment4.Module8;

public class ReverseWords {
    public static void main(String[] args){
        String s = "Hello World";
        String[] words = s.split(" ");
        for (String word : words){
            System.out.println(new StringBuilder(word).reverse() + " ");
        }
    }
}
