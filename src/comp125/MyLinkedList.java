package comp125;

/**
 * Created by Reuben on 22/10/2014.
 */
public class MyLinkedList {

    private Node head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToStart(int newInfo) {
        head = new Node(newInfo, head);
        size++;
    }

    public void removeAtStart() {
        head = head.link;
        size--;
    }

    //O(n)
    public int size() {
        return size;
    }

    public void display() {
        Node iter = head;
        while (iter != null) {
            System.out.print(iter.info + " ");
            iter = iter.link;
        }
    }

    public Node getHead() {
        return head;
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addToStart(19);
        list.addToStart(97);
        list.addToStart(45);
        list.display();

        list.addToStart(88);
        System.out.println(list.size());

        list.display();
        list.removeAtStart();
        list.display();
    }
}