package hust.soict.hedspi.aims.disc;
import java.util.StringTokenizer;
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        if (cost < 0) {
            return;
        }
        this.cost = cost;
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public boolean equals(DigitalVideoDisc disc) {
        return this.title.equals(disc.title) && this.category.equals(disc.category);

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