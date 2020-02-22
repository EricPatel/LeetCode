
public class MedianofTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int pA = 0;
		int pB = 0;
		int last = nums1[0];
		int secondLast = last;
		int mid = (nums1.length + nums2.length)/2;
		while(pA+pB < mid) {
			if(pA == nums1.length-1) {
				secondLast = last;
				last = nums2[pB++];
				System.out.println(last);
				System.out.println(secondLast);
			}
			else if(pB == nums2.length-1) {
				secondLast = last;
				last = nums1[pA++];
			}
			if(nums1[pA] < nums2[pB]) {
				secondLast = last;
				last = nums1[pA++];
			}
			else {
				secondLast = last;
				last = nums2[pB++];
			}
		}
		if(nums1.length + nums2.length % 2 == 0) {
			return (last + secondLast)/2;
		}
		return last;
	}
}
