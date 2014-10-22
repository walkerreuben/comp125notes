package comp125;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Week10LectureOne {

	/*
	 * So far he's been talking about the third assignment.
	 * 
	 * This assignment is going to be a lot more complicated than the last one.
	 * Good.
	 * 
	 * Using the slides from last year.
	 * 
	 * We first look at a linked list in an abstract way.
	 * 
	 * At this stage, we are not interested in how a link list is implemented.
	 * We're only looking at the operations that can be performed on it.
	 * 
	 * The representation on the slides is useful from this point of view.
	 * 
	 * The due date for the next assignment isn't set yet, and the specification
	 * might drop a task or two.
	 * 
	 * A Person class contains more person objects. In this way, a family tree
	 * is a recursive data type.
	 * 
	 * In a linked list, each object points to the next one.
	 */

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(4);
		list.add(9);
		list.add(6);
		list.add(3, 8);
		System.out.println(list);

		/*
		 * If you're constantly updating a list, an arraylist can be
		 * inefficient.
		 * 
		 * Using a linked list, we can easily move things around by simply
		 * moving the pointers.
		 * 
		 * To insert an element in a linked list, we do not have to physically
		 * move data. The same thing applies for removing an element.
		 * 
		 * To access an element, the complexity is L.
		 * 
		 * Linear search is order n for both arraylists and linked lists.
		 */

		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(2);
		list2.add(5);
		list2.add(7);
		list2.add(4);
		list2.add(9);
		list2.add(6);
		list2.add(3, 8);
		list2.addFirst(1);
		System.out.println(list2);

		/*
		 * A normal linked list can't go backwards. A doubly linked list has
		 * links going both ways and allows us to go backwards.
		 * 
		 * The LinkedList class included with Java is doubly linked and works
		 * with generics.
		 */

		list2.add(1, 23);
		System.out.println(list2);
		System.out.println(list2.getFirst());

		for (int i = 0; i < list.size(); i++)
			System.out.println(i + " " + list.get(i));

		/*
		 * There's a better way than these, since it's a lot like the fibonacci
		 * method from yesterday.
		 * 
		 * An iterator is an abject that allows us to go through a linked list.
		 * It is similar to the cursor in a word processor that is between two
		 * characters.
		 */

		ListIterator<Integer> iter = list2.listIterator();

		int count = 0;
		while (iter.hasNext()) {
			System.out.println(count + " " + iter.next());
			count++;
		}

		/*
		 * A linked list can be seen as a collection of nodes.
		 */

		/*
		 * What happens to a node that has been deleted? It stays there until
		 * the automatic garbage collection comes along and cleans it up.
		 * 
		 * Because no variable has a reference to it, the garbage collection
		 * deletes it.
		 */

	}

	public class Node {
		private int info;
		private Node link;

		// link is a reference to the next node.

		public Node(int newInfo, Node newLink) {
			info = newInfo;
			link = newLink;
		}

		/*
		 * The first item in the list is the head of the list and contains a
		 * single node. The next node contains info and a link to the next node.
		 * The final node contains a link to null, which represents the end of
		 * the list.
		 */

		public int getInfo() {
			return info;
		}
	}
}