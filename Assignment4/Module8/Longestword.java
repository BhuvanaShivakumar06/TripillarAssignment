package Assignment4.Module8;

public class Longestword {
    public static void main(String[] args) {
        String s = "Java is very powerful Language";
        String[] words = s.split("");
        String longest ="";
        for(String word : words){
            if (word.length()> longest.length()){
                longest= word;

            }
        }
        System.out.println("Longest Word:" + longest);
    }
}
