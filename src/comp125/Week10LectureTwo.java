package comp125;

import java.util.LinkedList;

public class Week10LectureTwo {
	
	public static void merge(LinkedList<Integer> low, LinkedList<Integer> high, LinkedList<Integer> result) {
		
		int first;
		
		if (low.size() == 0) {
			result.addAll(high);
			high.clear();
			return;
		} else if (high.size() == 0) {
			result.addAll(low);
			low.clear();
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
		LinkedList<Integer> one = new LinkedList<Integer>();
		LinkedList<Integer> two = new LinkedList<Integer>();
		LinkedList<Integer> result = new LinkedList<Integer>();
		
		one.add(2); one.add(5); one.add(9); one.add(10);
		two.add(3); two.add(4); two.add(12); two.add(13); two.add(25);
		
		merge(one, two, result);
		System.out.println(result);
	}

}
