package comp125;

import java.util.Arrays;

public class Week6LectureThree {

	/**
	 * @author Reuben Walker
	 */
	public static void main(String[] args) {
		/*
		 * I seem to have lost my notes. Oops.
		 * 
		 * Yay, they fixed the projector cutting off the edge of the screen. That helps.
		 * 
		 * Selection sort
		 * 
		 * A different idea: we do the following steps for i = 0 to n - 2:
		 * We find the index min of the smallest element in the array [i ... n-1]
		 * We swap array[i] amd array [min]
		 */

		int[] myArray = { 3, 1, 5, 12, 9, 12, 6 };

		for (int i = 0; i < myArray.length; i++) {
			int min = myArray[i];
			for (int k = i + 1; k < myArray.length; k++)
				if (myArray[k] < min) {
					int temp = min;
					min = myArray[k];
					myArray[k] = temp;
				}
			myArray[i] = min;
		}
		System.out.println(Arrays.toString(myArray));

	}

}
