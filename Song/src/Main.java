
public class Main {
    public static void main(String[] args) {
        // Create a few songs
        Song song1 = new Song("Coral Crown", "Darren Korb", 4.07);
        Song song2 = new Song("CASANOVE POSSE", "ALI", 4.00);
        Song song3 = new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);

        //AList
        AList songsList = new AList();
        System.out.println(songsList); //Nothing in there
        songsList.addy(song1);
        songsList.addy(song3);
        songsList.addy(song2);
        songsList.addy(song1);
        System.out.println(songsList);

        songsList.removy(1); //Remove at index 1
        System.out.println(songsList);

        //DLList
        DLList dlSongsList = new DLList();
        dlSongsList.addy(song1);
        dlSongsList.addy(song3);
        dlSongsList.addy(song2);
        dlSongsList.addy(song1);
        System.out.println(dlSongsList);

        dlSongsList.removy(1);
        System.out.println(dlSongsList);

        //SLList
        SLList slSongsList = new SLList();
        slSongsList.addy(song1);
        slSongsList.addy(song3);
        slSongsList.addy(song2);
        slSongsList.addy(song1);
        System.out.println(slSongsList);

        slSongsList.removy(1);
        System.out.println(slSongsList);
        }
    }