package TwoSum;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int shiftCounter = 0;
        int[] nums_shifted = nums.clone();
        nums_shifted = shift(nums_shifted);
        shiftCounter++;
        while(true) {
        	for(int i = 0; i < nums.length; i++) {
        		if(nums[i] + nums_shifted[i] == target) {
        			int curr = shiftCounter+i;
        			int index = (curr) >= nums.length ? (curr - nums.length) : (curr);
        			if (i < index)
        				return new int[] {i, index};
        			else
        				return new int[] {index, i};
        		}
        	}
            nums_shifted = shift(nums_shifted);
            shiftCounter++;
        }
    }
    
    private static int[] shift(int[] numbers) {
    	int start = numbers[0];
    	for(int i = 0; i < numbers.length-1; i++) {
    		numbers[i] = numbers[i+1];
    	}
    	numbers[numbers.length-1] = start;
    	return numbers;
    }
    
    public static void main(String[] args) {
    	int[] nums = new int[]{591,955,829,805,312,83,764,841,12,744,104,773,627,306,731,539,349,811,662,341,465,300,491,423,569,405,508,802,500,747,689,506,129,325,918,606,918,370,623,905,321,670,879,607,140,543,997,530,356,446,444,184,787,199,614,685,778,929,819,612,737,344,471,645,726};
    	//System.out.println(nums.length);
    	int target = 789;
    	int[] answer = twoSum(nums, target);
    	for(int x : answer)
    		System.out.println(x);
    }
}
