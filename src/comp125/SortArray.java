package comp125;

public class SortArray {

	public static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++)
			insertIntoSortedRegion(array, i);
	}

	public static void insertIntoSortedRegion(int[] array, int i) {
		
		boolean posFound = false;
		int j = i - 1;
		int currentElt = array[i];
		while(j >= 0 && !posFound) {
			if (array[j] <= currentElt)
				posFound = true;
			else {
				array[j+1] = array[j];
				j--;
			}
		}
		array[j+1] = currentElt;
	}
}