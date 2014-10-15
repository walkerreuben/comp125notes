package comp125;

public class Week9LectureOne {

	public static int sumOfIntRec(int n) {
		// If it didn't have this, the loop would never end. It's <= so it
		// covers negative numbers.
		if (n <= 0)
			return 0;
		else
			return n + sumOfIntRec(n - 1);
	}

	/**
	 * Counts the amount of spaces in a given string.
	 * 
	 * @param text
	 *            The string you wish to count the spaces in.
	 * @return int: the amount of spaces.
	 */
	public static int countSpaces(String text) {
		if (text.length() == 0)
			return 0;
		else {
			int restCount = countSpaces(text.substring(1));
			if (text.charAt(0) == ' ')
				return 1 + restCount;
			else
				return restCount;
		}
	}

	public static boolean linearSearch(String[] ss, String t, int start) {
		// We can't easily make the array smaller as we go. One possible option
		// is to keep a counter.

		if (start == ss.length)
			return false;
		else if (ss[start].compareTo(t) == 0)
			return true;
		return linearSearch(ss, t, start + 1);
	}

	public static boolean binarySearchRec(int[] ii, int t, int start, int end) {
		if (end >= ii.length)
			end = ii.length - 1;

		// Calculate the mid point.
		int mid = start + (end - start) / 2;

		// Ensure mid point is inside array.
		if (mid < 0)
			mid = 0;
		else if (mid >= ii.length)
			mid = ii.length - 1;

		// Check the mid point.
		if (ii[mid] == t)
			return true;

		// Check if we've checked everything
		else if (start == end)
			return false;

		// Figure out where it would be, and run on that segment.
		else if (t < ii[mid])
			return binarySearchRec(ii, t, start, mid - 1);
		else
			return binarySearchRec(ii, t, mid + 1, end);
	}

	public static void main(String[] args) {
		/*
		 * I think we're starting by finishing off container types, or at least
		 * doing a basic recap on last weeks topic.
		 * 
		 * He just updated the slides. They seem to be done using tex.
		 * Interesting. This week is something to do with recursion.
		 * 
		 * Induction is a powerful approach in DMTH to prove a result. It relies
		 * on two steps.
		 * 
		 * The base step: show the result is true for some initial value,
		 * usually n = 0 or 1.
		 * 
		 * The inductive step: Show that if the result is true for n-1, then it
		 * is true for n.
		 * 
		 * I'm going to have to go over the notes for this, and maybe catch up
		 * in DMTH.
		 * 
		 * Recursion is a computer science analog of Induction.
		 * 
		 * Break a problem down into smaller versions of the same problem.
		 * 
		 * A recursive method is one that contains a call to itself.
		 * 
		 * A recursive method must contain: a base or stopping case
		 * 
		 * a recursive call
		 * 
		 * A recursive binary search is very much how you would explain the
		 * process of binary search to someone.
		 * 
		 * 
		 * Recursive data types
		 * 
		 * We can find recursion in data structures too
		 * 
		 * Objects that contain references to other objects of the same type.
		 * 
		 * What happens if you are your own parent? Infinite loop.
		 * 
		 * How can you guard against this? We can check against this for your
		 * own parents, but it's more difficult for your grandparents and
		 * further back.
		 */

		System.out.println(sumOfIntRec(5));
		System.out.println(countSpaces("test test test test"));

		String[] ss = { "test", "false", "true", "hide", "train" };

		System.out.println(linearSearch(ss, "true", 0));

		System.out.println(linearSearch(ss, "not", 0));

		int[] ii = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println(binarySearchRec(ii, 10, 0, ii.length - 1));
		System.out.println(binarySearchRec(ii, 9, 0, 500000));

		Person me = new Person("Reuben", "Walker");
		Person mum = new Person("Deborah", "Partridge");
		Person dad = new Person("Timothy", "Walker");

		me.setFather(dad);
		me.setMother(mum);

		dad.setFather(new Person("David", "Walker"));
		dad.setMother(new Person("Ivy", "Shaw"));

		mum.setFather(new Person("Ian", "Partridge"));
		mum.setMother(new Person("Beverly", "Newcombe"));

		me.printTree("");
	}
}