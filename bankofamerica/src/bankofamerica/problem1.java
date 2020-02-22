package bankofamerica;

public class problem1 {
	public static int sumOfDigits(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(i % 5 != 0 && i % 7 != 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumOfDigits(27));
		System.out.println(sumOfDigits(19));
	}
}
