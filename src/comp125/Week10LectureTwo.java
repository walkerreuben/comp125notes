package comp125;

import java.util.LinkedList;

public class Week10LectureTwo {

	public static void merge(LinkedList<Integer> low, LinkedList<Integer> high,
			LinkedList<Integer> result) {

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

    public static void mergeSort(LinkedList<Integer> list) {
        System.out.println("Sorting" + list);

        if (list.size() <= 1)
            return;

        int halfSize = list.size() / 2;

        LinkedList<Integer> low = new LinkedList<Integer>();
        LinkedList<Integer> high = new LinkedList<Integer>();

        while(low.size() < halfSize) {
            low.add(list.removeFirst());
        }
        high.addAll(list);
        list.clear();

        //Sort each half
        mergeSort(low);
        mergeSort(high);

        //Merge the results
        merge(low, high, list);

        System.out.println("Sorted");
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Divide and conquer Another class of algorithm Split the array up into
		 * smaller parts Sort the smaller parts Combine the sorted parts
		 * together
		 * 
		 * This isn't left to right like the other sort methods, but it's
		 * generally faster.
		 * 
		 * The merge operation combines two sorted lists into one If one or
		 * other list is empty Add all of the non-empty list to the result
		 * Remove the smallest element from the front of either array - call it
		 * X Merger the two lists (one is now shorter) Add X to the start of the
		 * result
		 * 
		 * Requires more storage, not in place.
		 *
		 *
		 *
		 * There's a difference between pass by reference and pass by value. It's important to know which one you're working with.
		 */
		LinkedList<Integer> one = new LinkedList<Integer>();
		LinkedList<Integer> two = new LinkedList<Integer>();
		LinkedList<Integer> result = new LinkedList<Integer>();

		one.add(2);
		one.add(5);
		one.add(9);
		one.add(10);
		two.add(3);
		two.add(4);
		two.add(12);
		two.add(13);
		two.add(25);

		merge(one, two, result);
		System.out.println(result);
	}

}
