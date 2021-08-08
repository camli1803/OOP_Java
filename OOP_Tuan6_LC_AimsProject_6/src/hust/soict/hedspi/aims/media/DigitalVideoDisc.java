package hust.soict.hedspi.aims.media;
import java.util.StringTokenizer;
public class DigitalVideoDisc extends Media {
    private String director;
    private int length;

    public String getDirector() {return director;}

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public DigitalVideoDisc(String title) {
        super(title);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title,category,cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title,category,cost);
        this.director = director;

    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title,category,cost);
        this.director = director;
        this.length = length;

    }

    public boolean search(String title) {
        StringTokenizer tuNguoidungNhap = new StringTokenizer(title.toLowerCase()); //string là title đã viết thường được tách ra thành token
        String titleCuaDVD = this.title.toLowerCase(); // viết thường title của DVD
        while (tuNguoidungNhap.hasMoreTokens()) {   // So sánh từng token của người dùng nhập với token của title
            if (titleCuaDVD.indexOf(tuNguoidungNhap.nextToken()) == -1)
                return false;
        }
        return true;

    }
}