import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean checkBits(int n) {
        int mynum=n;
        ArrayList<Integer> num=new ArrayList<>();
        while (mynum>0) {
            num.add(mynum%2);
            mynum/=2;
        }

        for (int index = 0; index < num.size()-1; index++) {
            int checkbit=num.get(index);
            if(num.get(index+1)==checkbit){
                return false;
            }
        
        }
        return true;
    }
}
