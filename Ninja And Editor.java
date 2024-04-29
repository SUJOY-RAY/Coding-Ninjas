import java.util.* ;
import java.io.*; 
public class Solution {
    public static String editSentence(String str){
        StringBuilder correct=new StringBuilder();

        if (Character.isUpperCase(str.charAt(0))) {
            correct.append(Character.toLowerCase(str.charAt(0)));
        }else{
            correct.append(str.charAt(0));
        }


        for (int i = 1; i < str.length(); i++) {
            char c=str.charAt(i);
            if (Character.isUpperCase(c)) {
                correct.append(' ');
                correct.append(Character.toLowerCase(c));
            }else{
                correct.append(c);
            }
        }
        return correct.toString();
    }
}
