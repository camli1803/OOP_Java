package hust.soict.hedspi.aims.media;

public class Disc extends Media {
    public int length;
    public String director;

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

    public Disc(String title) {
        super(title);
    }

    public Disc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public Disc(String title, int length, String director) {
        super(title);
        this.length = length;
        this.director = director;
    }

    public Disc(String title, String category, float cost, int length, String director) {
        super(title, category, cost);
        this.length = length;
        this.director = director;
    }

    public Disc(String title, String category, int length, String director) {
        super(title, category);
        this.length = length;
        this.director = director;
    }
}
