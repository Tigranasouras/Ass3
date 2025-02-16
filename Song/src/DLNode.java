class DLNode {
    Song song;
    DLNode next;
    DLNode prev;

    public DLNode(Song song) {
        this.song = song;
        this.next = null;
        this.prev = null;
    }
}