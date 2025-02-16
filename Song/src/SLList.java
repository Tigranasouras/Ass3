
public class SLList {
    private SLNode head;

    // Constructor
    public SLList() {
        head = null;
    }

    // Add a Song
    public void addy(Song s) {
        SLNode newNode = new SLNode(s);
        if (head == null) {
            head = newNode;
        } else {
            SLNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Remove a Song by position
    public void removy(int pos) {
        if (pos < 0 || head == null) {
            System.out.println("Parameters are unlearnt");
            return;
        }
        if (pos == 0) {
            head = head.next;
            return;
        }
        SLNode temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp != null && temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Print list
    public String toString() {
        if (head == null) {
            return "Is the list with us?";
        }

        String result = head.song.toString() + "\n";
        SLNode temp = head.next;
        while (temp != null) {
            result = result + temp.song + "\n";
            temp = temp.next;
        }
        return result;
    }
}