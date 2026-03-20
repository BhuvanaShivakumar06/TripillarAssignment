package Assignment4.Module8;

public class VowelsConsonants {
    public static void main (String[] args){
        String s = "Hello World";
        int v =0, c =0;
        for (char ch : s.toCharArray()){
            if (Character.isLetter(ch)){
                if("aeiouAEIOU".indexOf(ch) != -1){
                    v++;
                }else{
                    c++;
                }
            }
            System.out.println("Vowels:" + v+","+ "Consonants:" + c);
        }
    }
}
