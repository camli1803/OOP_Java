package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> authors = new ArrayList<String>();

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

   public Book(String title, String category) {
        super(title, category);
           }


    public Book(String title) {
        super(title);
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }

    public Book(String title, String category, float cost, List<String> authors) {
        super(title, category, cost);
        this.authors = authors;
    }

    public void addAuthor(String authorName){
        int check =1;
        for(String nameOfList: authors){
            if(nameOfList.equalsIgnoreCase(authorName)){
                System.out.println("Error: Đã tồn tại tên tác giả "+ authorName+ " trong danh sách!!!");
                check =0;
            }
        }
        if(check ==1 ){
            authors.add(authorName);
            System.out.println("Thông báo: Đã add tác giả "+authorName+" vào danh sách tác giả!");
        }
    }
    public void removeAuthor(String authorName){
        int check =1;
        for(String nameOfList: authors){
            if(nameOfList.equalsIgnoreCase(authorName)){
                authors.remove(authorName);
                System.out.println("Thông báo: Đã xóa tên tác giả "+ authorName+ " khỏi danh sách!");
                check =0;
            }
        }
        if(check ==1 ){
            System.out.println("Error: Không tồn tại tên tác giả" + authorName+ " trong danh sách!!!");
        }
    }
    }

