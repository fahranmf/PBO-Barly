public class Song extends Media {
    private String titleAlbum;
    private String genre;
    private int duration;

    public Song(String song, String artist, String releaseDate, String lyrics, String titleAlbum, String genre, int duration) {
        super(song, artist, releaseDate, lyrics);
        this.titleAlbum = titleAlbum;
        this.genre = genre;
        this.duration = duration;
    }

    @Override
    public void play() {
        System.out.println("Playing song: " + getSong());
    }

    @Override
    public void stop() {
        System.out.println("Stopping song: " + getSong());
    }

    @Override
    public void addToPlaylist() {
        System.out.println("Adding song to playlist: " + getSong());
    }

    public void next() {
        System.out.println("Skipping to the next song.");
    }

    public void prev() {
        System.out.println("Going back to the previous song.");
    }
}
