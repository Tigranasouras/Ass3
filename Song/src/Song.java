public class Song {
    String title; //Ex: El Pibe De Mi Barrio
    String artist; //Ex: Dr. Krapula
    double length; //Ex: 2.47

    //Constructor
    public Song(String title, String artist, double length){
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    public String toString(){
        return "songName: " + title + ", artist: " + artist + ", price: " + length;
    }

}
