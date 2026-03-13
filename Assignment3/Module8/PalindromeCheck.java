package Assignment3.Module8;
//madam,radar,malayalam
public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        String reverse ="";
        for(int i = str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not a Palindrome");
        }
    }
}
