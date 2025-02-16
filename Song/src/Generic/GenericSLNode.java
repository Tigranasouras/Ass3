package Generic;

class GenericSLNode<T> {
    T data;
    GenericSLNode<T> next;

    public GenericSLNode(T data) {
        this.data = data;
        this.next = null;
    }
}