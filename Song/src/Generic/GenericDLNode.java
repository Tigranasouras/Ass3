package Generic;

public class GenericDLNode <T> {
    T data;
    GenericDLNode<T> next;
    GenericDLNode<T> prev;

    public GenericDLNode(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

