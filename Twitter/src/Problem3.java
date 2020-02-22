import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Problem3 {
	public static void finalPrice(List<Integer> prices) {
		if (prices.size() == 0) {
			System.out.println(0);
			return;
		}
		// Next Less Element
		Deque<Long> priceStack = new ArrayDeque<>();
		List<Integer> fullPrices = new ArrayList<Integer>();
		long res = 0;
		for (int i = prices.size() - 1; i >= 0; i--) {
			while (priceStack.size() != 0 && priceStack.peek() > prices.get(i)) {
				priceStack.pop();
			}
			if (priceStack.isEmpty()) {
				res += prices.get(i);
				fullPrices.add(i);
			} else {
				res += prices.get(i) - priceStack.peek();
			}
			priceStack.push(prices.get(i));
		}
		System.out.println(res);
		for (int i = fullPrices.size() - 1; i >= 0; i--) {
			System.out.print(fullPrices.get(i));
			if (i != 0) {
				System.out.print(" ");
			}
		}
	}
}
