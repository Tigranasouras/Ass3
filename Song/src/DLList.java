public class DLList {
    private DLNode head;

    // Constructor
    public DLList() {
        head = null;
    }

    // Add a Song
    public void addy(Song s) {
        DLNode newNode = new DLNode(s);
        if (head == null) {
            head = newNode;
        } else {
            DLNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    // Remove a Song by position
    public void removy(int pos) {
        if (pos < 0 || head == null) {
            System.out.println("Learn to read an or statement");
            return;
        }
        if (pos == 0) {
            head = head.next;
            if (head != null) head.prev = null;
            return;
        }
        DLNode temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp != null && temp.next != null) {
            temp.next = temp.next.next;
            if (temp.next != null) {
                temp.next.prev = temp;
            }
        }
    }

    // Print list
    public String toString() {
        if (head == null) {
            return "Imagine thinking you have something.";
        }

        String result = "";
        DLNode temp = head;
        while (temp != null) {
            result += temp.song  + "\n";
            temp = temp.next;
        }
        return result;
    }
}