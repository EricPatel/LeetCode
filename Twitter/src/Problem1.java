import java.util.List;

public class Problem1 {

    public static int balancedSum(List<Integer> sales) {
    		int leftSum = sales.get(1);
    		int rightSum = 0;
    		int index = 1;
    		for(int i = 2; i < sales.size(); i++) {
    			rightSum += sales.get(i);
    		}
    		while(leftSum != rightSum) {
    			leftSum+=sales.get(index);
    			rightSum-=sales.get(index++);
    		}
    		return index;
    }
}
