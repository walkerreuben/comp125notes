package comp125;

/**
 * Created by Reuben on 22/10/2014.
 */
public class Node {
	int info;
	Node link;

	public Node(int newInfo, Node newLink) {
		info = newInfo;
		link = newLink;
	}

	public int getInfo() {
		return info;
	}

	public Node getLink() {
		return link;
	}

	public void removeNext() {
		// Sets the link to link to the 2nd next link, instead of linking to the
		// next one.
		link = link.link;
	}

	public static void main(String[] args) {
		Node head = null;
		head = new Node(21, head);
		head = new Node(14, head);
		head = new Node(91, head);

		Node temp = head;
		while (temp != null) {
			System.out.println(temp.info);
			temp = temp.getLink();
		}

		// System.out.println(head.link.info); // second element, in this case
		// 14.

		head.removeNext();

		temp = head;
		while (temp != null) {
			System.out.println(temp.info);
			temp = temp.getLink();
		}
	}
}
