package comp125;

public class Week5LectureTwo {

	/**
	 * @param args
	 */
	
	public static boolean binarySearch(int[] a, int target) {
		int start = 0;
		int end = a.length - 1;
		while (start <= end) {
			int mid = (start + end)/2;
			if (a[mid] == target)
				return true;
			else if (a[mid] < target)
				start = mid + 1;
			else
				end = mid - 1;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		
	}

}
