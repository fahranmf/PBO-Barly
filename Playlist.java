import java.util.ArrayList;

public class Playlist {
    private String titlePlaylist;
    private ArrayList<Song> songs;

    public Playlist(String titlePlaylist) {
        this.titlePlaylist = titlePlaylist;
        this.songs = new ArrayList<>();
    }

    public void play() {
        if (!songs.isEmpty()) {
            System.out.println("Playing playlist: " + titlePlaylist);
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    public void pause() {
        System.out.println("Pausing playlist: " + titlePlaylist);
    }

    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Added song: " + song.getSong() + " to playlist: " + titlePlaylist);
    }

    public void next() {
        System.out.println("Skipping to the next song in the playlist.");
    }

    public void prev() {
        System.out.println("Going back to the previous song in the playlist.");
    }

    public void viewPlaylist() {
        System.out.println("Playlist: " + titlePlaylist);
        for (Song song : songs) {
            System.out.println("- " + song.getSong());
        }
    }

    // Getter and Setter
    public String getTitlePlaylist() {
        return titlePlaylist;
    }

    public void setTitlePlaylist(String titlePlaylist) {
        this.titlePlaylist = titlePlaylist;
    }
}
