public class AList {
    private Song[] list;
    private int size;
    private int maxSize;


    public AList() { //Constructor
        maxSize = 10;
        list = new Song[maxSize];
        size = 0;
    }


    private void resize() { // if full
        maxSize *= 2;
        Song[] newList = new Song[maxSize];

        //From old to new
        for (int i = 0; i < size; i++) {
            newList[i] = list[i];
        }

        list = newList;
    }

    public void addy(Song s) {
        if (size == maxSize) {
            resize();
        }
        list[size] = s;
        size++;
    }
    public void removy(int pos) { //remove by pos
        if (pos < 0 || pos >= size){
            System.out.println("Not possible buddy");
            return;
        }
        for (int i = pos; i <size - 1; i++){
            list[i] = list[i +1];
        }
        list[size -1] = null;
        size--;
    }

    public String toString() { // Prints list
        if (size == 0) {
            return "You're dumb.";
        }

        String result = "";
        for (int i = 0; i < size; i++) {
            result = result + list[i] + "\n"; // Append each item to result
        }

        return result; // Return the final string
    }

}
