package Generic;

public class GenericSLList <T>{
    private GenericSLNode<T> head;

    public GenericSLList() { //Constructor
        head = null;
    }

    public void addy(T data) { //Add to the end
        GenericSLNode<T> newNode = new GenericSLNode<>(data);
        if (head == null) {
            head = newNode;
        } else {
            GenericSLNode<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void removy(int pos) { //Remove by position
        if (pos < 0 || head == null) {
            System.out.println("Learn your parameters");
            return;
        }
        if (pos == 0) {
            head = head.next;
            return;
        }
        GenericSLNode<T> temp = head;
        for (int i = 0; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public String toString() { //Prints list
        if (head == null) {
            return "Nothing here buddy boy";
        }

        String result = head.data.toString() + "\n";
        GenericSLNode<T> temp = head.next;
        while (temp != null) {
            result = result + temp.data + "\n";
            temp = temp.next;
        }
        return result;
    }
}