package hust.soict.hedspi.aims.media;

// là 1 bản nhạc trong đĩa nhạc CD
public class Track implements Playable {
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
    public boolean equals(Track track) {
        if(this.title.equals(track.title) && this.length == track.getLength())
            return true;
        else return false;
    }
    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength()); }
}
