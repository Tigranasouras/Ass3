package Generic;

public class GenericDLList <T>{
    private GenericDLNode<T> head;

    public GenericDLList() { // Constructor
        head = null;
    }

    public void addy(T data) { // Add to the end
        GenericDLNode<T> newNode = new GenericDLNode<>(data);
        if (head == null) {
            head = newNode;
        } else {
            GenericDLNode<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void removy(int pos) { // Remove by position
        if (pos < 0 || head == null) {
            System.out.println("Learn your parameters");
            return;
        }
        if (pos == 0) {
            head = head.next;
            if (head != null) head.prev = null;
            return;
        }
        GenericDLNode<T> temp = head;
        for (int i = 0; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
            if (temp.next != null) {
                temp.next.prev = temp;
            }
        }
    }

    public String toString() { //Prints list
        if (head == null) {
            return "Nothing here buddy boy";
        }

        String result = head.data.toString() + "\n";
        GenericDLNode<T> temp = head.next;
        while (temp != null) {
            result = result + temp.data + "\n";
            temp = temp.next;
        }
        return result;
    }
}
