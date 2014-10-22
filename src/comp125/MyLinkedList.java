package comp125;

/**
 * Created by Reuben on 22/10/2014.
 */
public class MyLinkedList {

    Node head;

    public MyLinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToStart(int newInfo) {
        head = new Node(newInfo, head);
    }

    public void removeAtStart() {
        
    }

}
