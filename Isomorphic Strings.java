import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean areIsomorphic(String str1, String str2) {
        Map<Character,Character> map=new HashMap<>(); 
        Map<Character,Boolean> used=new HashMap<>() ;
            
        if (str1.length()!=str2.length()) {
            return false;
            
        }
        for (int i = 0; i < str1.length()-1; i++) {
                char char1=str1.charAt(i);
                char char2=str2.charAt(i);

                if (map.containsKey(char1)) {
                    if (map.get(char1)!=char2) {
                        return false;
                    }
                }else{
                    if (used.containsKey(char2)) {
                        return false;
                    }
                    map.put(char1, char2);
                    used.put(char2, true);
                }
        }         
            return true;
    }
}
