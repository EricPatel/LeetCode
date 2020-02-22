package bankofamerica;

import java.util.ArrayList;
import java.util.List;

public class problem2 {
	public static long splitTheNumber(long x, String y) {
		String num = String.valueOf(x);
		long a;
		long b;
		int index;
		if (y.indexOf("+") != -1) {
			index = y.indexOf("+");
			a = Long.parseLong(num.substring(0, index));
			b = Long.parseLong(num.substring(index, num.length()));
			return a + b;
		} else {
			index = y.indexOf("-");
			a = Long.parseLong(num.substring(0, index));
			b = Long.parseLong(num.substring(index, num.length()));
			return a - b;
		}

	}

	public static void main(String[] args){
		long x = 776L;
		String line = "1,2,3,4:4,5,6";
		String[] lists = line.split(";");
		String[] numsA = listsp
				line.
	}
}
