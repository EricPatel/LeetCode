import java.util.ArrayList;
import java.util.List;

public class Problem2 {

	public static int maxHeight(List<Integer> tablePositions, List<Integer> tableHeights) {
		int max = 0;
		for (int i = 1; i < tablePositions.size(); i++) {
			if (tablePositions.get(i) - tablePositions.get(i - 1) > 1) {
				max = Math.max(max, getMax(tablePositions.get(i) - tablePositions.get(i - 1) - 1, tableHeights.get(i - 1),
						tableHeights.get(i)));
			}
		}
		return max;
	}

	private static int getMax(int gap, int hA, int hB) {
		int max = Math.max(hA, hB);
		int min = Math.min(hA, hB);
		if (max >= min + gap) {
			return min + gap;
		} 
		else {
			return Math.min(min + gap, max+1);
		}
	}

	public static Integer helper(List<Integer> heights, int index) {
		if (index == 0) {
			heights.set(0, helper(heights, index + 1));
			return heights.get(index);
		}
		if (heights.get(index) == -1) {
			heights.set(index, Math.min(helper(heights, index - 1), helper(heights, index + 1)) + 1);
			return heights.get(index);
		} else {
			return heights.get(index);
		}
	}

	public static void main(String[] args) {

	}
}
