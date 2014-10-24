package comp125;

import java.util.LinkedList;

public class Week10LectureTwo {
	
	public static void merge(LinkedList<Integer> low, LinkedList<Integer> high, LinkedList<Integer> result) {
		
		int first;
		
		if (low.size() == 0) {
			result.addAll(high);
			return;
		} else if (high.size() == 0) {
			result.addAll(low);
			return;
		} else if (low.getFirst() < high.getFirst()) {
			first = low.removeFirst();
		} else {
			first = high.removeFirst();
		}
		
		merge(low, high, result);
		result.addFirst(first);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}

}
