package Generic;

public class GenericAList <T>{
    private T[] list;
    private int size;
    private int maxSize;


    public void AList() { //Constructor
        maxSize = 10;
        list = (T[]) new Object[maxSize];
        size = 0;
    }


    private void resize() { // if full
        maxSize *= 2;
        T[] newList = (T[]) new Object[maxSize];

        //From old to new
        for (int i = 0; i < size; i++) {
            list = newList;
        }

        list = newList;
    }

    public void addy(T item) {
        if (size == maxSize) {
            resize();
        }
        list[size] = item;
        size++;
    }
    public void removy(int pos) { //remove by pos
        if (pos < 0 || pos >= size){
            System.out.println("Wow, nope.");
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
            return "Couldn't be a worse attempt.";
        }

        String result = "";
        for (int i = 0; i < size; i++) {
            result = result + list[i] + "\n"; // Append each item to result
        }

        return result; // Return the final string
    }

}
