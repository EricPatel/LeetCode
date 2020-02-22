import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountOfSmallerNumbersAfterSelf {

	public static List<Integer> countSmaller(int[] nums) {
		if(nums.length == 0) {
			return null;
		}
		List<Integer> values = new ArrayList<Integer>(Collections.nCopies(nums.length, 0));
		values.set(nums.length-1, 0);
		for(int i = nums.length-2; i >= 0; i--) {
			int curr = 0;
			for(int j = i; j < nums.length-1; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = temp;
					curr++;
				}
				else {
					break;
				}
			}
			values.set(i, curr);
			curr = 0;
		}
		return values;
	}
	
	public static void main(String[] args) {
		List<Integer> values = countSmaller(new int[] {5,2,6,1});
		System.out.println(values.toString());
	}
}
