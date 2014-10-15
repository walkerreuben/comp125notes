package comp125;

import java.util.Arrays;

public class Week6LectureTwo {

	/**
	 * @author Reuben Walker
	 */
	public static void main(String[] args) {
		/*
		 * Using several classes in Eclipse.
		 * 
		 * Project Explorer
		 * StudentArrayClient
		 * Student.java
		 * StudentArray.java
		 * StudentArrayClient.java
		 * 
		 * Conclude binary search
		 * 
		 * Best case time complexity of binary search is O(1). What is worst case?
		 * 
		 * Each pass around the loop reduces the region of interest by half.
		 * Length of region of interest is no more than n/1, n/2, n/4, n/8, ....
		 * As soon as length of region becomes 0, we terminate
		 * In worst case, 1=1, 2=2, 4=3, 8=4, 16=5, etc.
		 * In general we make log2n + 1 passes
		 * 
		 * So we say that W(n) is O(log2 n)
		 * 
		 * This is much better than for linear seach because log2n grows more slowly than n so binary search is more efficient.
		 * 
		 * Sorting Algorithms
		 * 
		 * Searching for things is faster in sorted lists.
		 * Often we want to display records in order
		 * By the way, the ordering can be based on different criteria (sort keys)
		 * 
		 * Most programming languages include libraries with search and sort algorithms. In Hava the class Arraus contains many useful
		 * such methods.
		 */

		int[] myArray = { 3, 1, 5, 12, 9, 12, 6 };
		Arrays.sort(myArray);
		System.out.println(Arrays.toString(myArray));
		int pos = Arrays.binarySearch(myArray, 6);
		System.out.println(6 + " is stored at position " + pos);

		/*
		 * If these algorithms are available, why should we learn about them?
		 * 
		 * Sorting is important, ubiquitous, and part of computing "culture".
		 * Studying sorting definitely helps strengthen algorithmic skills.
		 * Sorting is a problem that has multiple solutions (algorithms) We can apply (and so practise) computing time analysis in
		 * order to compare different sorting algorithms.
		 * In short, sorting is part of what COMP125 is all about.
		 * 
		 * We are given a list of n objects (records). Each object has a key, which governs the sorting process. The objective is to
		 * rearrange the onkects so that after rearrangement they are in ascending order.
		 * When the objects are stored in memory (such as an array) the problem is known as internal sorting. When the objects are
		 * stored in secondary memory the problem is known as external sorting.
		 * 
		 * We shall study internal sorting.
		 * 
		 * Simplified problem statement. We are given an array which stores n integer values. We want to rearrange the values so that
		 * they are in ascending order.
		 * 
		 * We will maintain a sorted region (at left) and an unsorted region (at right)
		 * for i = 1 to n-1 do the following:
		 * Insert element array[i] into its proper place in the sorted region array[o...i-1].
		 * When we insert this element we may need to shift some elements to the right.
		 * 
		 * This could take quite some time.
		 */
		
		int[] myArray2 = { 3, 1, 5, 12, 9, 12, 6 };
		SortArray.insertionSort(myArray2);
		System.out.println(Arrays.toString(myArray2));
	}

}