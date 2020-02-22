import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Problem4 {

	public static boolean isPossible(List<Integer> calCounts, int requiredCals) {
		List<Integer> sorted = calCounts.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		int sum = requiredCals;
		for(int i = 0; i < sorted.size(); i++) {
			for(int j = i; j < sorted.size(); j++) {
				if(sum == 0) {
					return true;
				}
				else {
					if(sorted.get(j) >)
				}
			}
		}
	}

	private static boolean helpIsPossible(List<Integer> calCounts, int requiredCals, int sum) {

	}
	
}
