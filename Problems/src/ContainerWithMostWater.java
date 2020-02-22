
public class ContainerWithMostWater {

	public static int maxArea(int[] height) {
		int maxArea = 0;
		for (int i = 0; i < height.length; i++) {
			for (int j = i + 1; j < height.length; j++) {
				maxArea = Math.max(maxArea, (j - i) * Math.min(height[i], height[j]));
			}
		}
		return maxArea;
	}

	public static int maxArea2(int[] height) {
		int max1 = height[(height.length/2)-1];
		int max2 = height[height.length/2];
		int p1 = (height.length/2)-1;
		int p2 = (height.length/2);
		int max1Index = p1;
		int max2Index = p2;
		while(p1 >= 0 && p2 < height.length) {
			max1 = Math.max(max1, height[p1--]);
			max2 = Math.max(max2, height[p2++]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(maxArea(test));
		System.out.println(maxArea2(test));
	}

}
