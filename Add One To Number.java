import java.util.* ;
import java.io.*; 
public class Solution
{
public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr)
    {
        int n=arr.size();
        int carry=1;
        for (int i = n-1; i >=0; i--) {
            int digit=arr.get(i)+carry;
            arr.set(i, digit%10);
            carry=digit/10;
        }
        if (carry>0) {
            arr.add(0,carry);
        }

        while (!arr.isEmpty()&&arr.get(0)==0) {
            arr.remove(0);
        }
        return arr;
    }
}
