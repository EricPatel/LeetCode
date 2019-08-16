package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
	public static int lengthOfLongestSubstring(String s) {
		HashSet<Character> found = new HashSet<Character>();
		int maxLen = 0;
		int currLen = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.length() - i < maxLen) {
				break;
			}
			for (int j = i; j < s.length(); j++) {
				char curr = s.charAt(j);
				if (!found.contains(curr)) {
					found.add(curr);
					currLen++;
				} else {
					break;
				}
			}
			if (currLen > maxLen) {
				maxLen = currLen;
			}
			currLen = 0;
			found = new HashSet<Character>();
		}
		return maxLen;
	}

	public static void main(String[] args) {
		String test1 = "abcabcbb";
		test1.length()
		String test2 = "bbbbb";
		String test3 = "pwwkew";
		String test4 = "jbpnbwwd";
		System.out.println(lengthOfLongestSubstring(test1));
		System.out.println(lengthOfLongestSubstring(test2));
		System.out.println(lengthOfLongestSubstring(test3));
		System.out.println("-----------------------");
		System.out.println(lengthOfLongestSubstring(test4));
	}
}
