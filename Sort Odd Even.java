import java.util.* ;
import java.io.*; 
public class Solution {

	public static void sortOddEven(int[] nums) {
		List<Integer>oddList=new ArrayList<>();
		List<Integer>evenList=new ArrayList<>();
		for (Integer i : nums) {
			if(i%2==0)
			{
				evenList.add(i);
			}
			else{
				oddList.add(i);
			}
		}
		Collections.sort(evenList);
		
		Collections.sort(oddList,Collections.reverseOrder());
int i=0;
		for (int  odd : oddList) {
			nums[i++]=odd;
		}
		for (int even : evenList) {
			nums[i++]=even;
		}

	}

}
