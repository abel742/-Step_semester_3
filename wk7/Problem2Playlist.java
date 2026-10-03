import java.util.ArrayList;

class Playlist {

    private ArrayList<String> songs;

    Playlist() {
        songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public void removeSong(String song) {
        songs.remove(song);
    }

    public void showSongs() {
        for (String song : songs) {
            System.out.println(song);
        }
    }

    public int getSongCount() {
        return songs.size();
    }
}

public class Problem2Playlist {

    public static void main(String[] args) {

        Playlist playlist = new Playlist();

        playlist.addSong("Shape of You");
        playlist.addSong("Perfect");
        playlist.addSong("Believer");

        System.out.println("Songs:");
        playlist.showSongs();

        playlist.removeSong("Perfect");

        System.out.println("After removing:");
        playlist.showSongs();

        System.out.println("Total songs: " + playlist.getSongCount());
    }
}
