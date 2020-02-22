
public class PizzaProblem {

	public static int maxTip(int[] a, int[] b, int alice, int bob) {
		if (alice == 0 && bob == 0) {
			return 0;
		}
		else {
			int maxIndex = 0;
			int max = -1;
			for (int i = 0; i < a.length; i++) {
				if (max < Math.max(a[i], b[i])) {
					maxIndex = i;
					if (a[i] >= b[i]) {
						max = a[i];
						alice--;
					} else {
						max =  b[i];
						bob--;
					}
					System.out.println(max);
					a[i] = 0;
					b[i] = 0;
					return max + (maxTip(a, b, alice, bob));
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 2, 4, 5, 1 };
		int[] b = new int[] { 1, 7, 2, 5 };
		System.out.println(maxTip(a, b, 2, 1));
	}
}
