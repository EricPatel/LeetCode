package goldman;

public class problem2 {
	public static int maxLCS(String s) {
		return splitAt(s, 1);
	}

	public static int splitAt(String s, int index) {
		if (index == s.length()) {
			return 0;
		}
		String s1 = s.substring(0, index);
		String s2 = s.substring(index, s.length());
		int common = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s2.contains("" + s1.charAt(i))) {
				common++;
				int spot = s2.indexOf(s.charAt(i));
				String s3 = s2.substring(0, spot) + s2.substring(spot+1, s2.length());
				s2 = s3;
			}
		}
		if(common >= s1.length()/2) {
			return common;
		}
		return Math.max(common, splitAt(s, --index));
	}

	public static void main(String[] args) {
		System.out.println(maxLCS("abcdecdefg"));
		System.out.println(maxLCS("zzzxxxzzz"));
	}
}
