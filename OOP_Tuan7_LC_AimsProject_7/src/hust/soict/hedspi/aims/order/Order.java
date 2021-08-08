package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.utils.MyDate;
import java.time.LocalDate;
import java.util.Random;
import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;

public class Order {
   // public static final int MAX_NUMBERS_ORDERED = 10;
   // private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    private MyDate dateOrdered;
   // private int qtyOrdered = 0;
    private static int nbOrders = 0;
    public static final int MAX_LIMITED_ORDERS = 5;

    public static int getNbOrders() {
        return nbOrders;
    }

    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    // Phương thức constructor của Order Class
    public Order() {
        LocalDate currentDate = LocalDate.now();
        int day = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();
        int year = currentDate.getYear();
        dateOrdered = new MyDate(day, month, year);
        nbOrders++;
        System.out.println("Thông báo: Order thứ " + nbOrders + " đã được tạo!!!");
    }


    // Các phương thức của Class Order

       public boolean checkMediaInOrderMediaList(Media mediaItem, ArrayList<Media> MediaList) {
        boolean check = false;
        for (Media mediaListItem: MediaList) {
            if (mediaListItem.equals(mediaItem)) {
                check = true;
            }
        }
        return check;
    }


    public void printMediaItemsList ( ArrayList<Media> MediaList) {
        if (MediaList.size() == 0) {
            System.out.println("Không tồn tại MediaItem nào trong list này!!!");
        } else {
            System.out.printf("%-25s %-25s %-25s\n", "Title", "Category", "Cost");
            for (Media mediaListItem : MediaList) {
                if (mediaListItem != null) {
                    System.out.printf("%-25s %-25s %-25s\n", mediaListItem.getTitle(), mediaListItem.getCategory(), mediaListItem.getCost());
                }
            }
        }
    }

    public void printMediaItemsListOfOrder() {
        printMediaItemsList(itemsOrdered);
    }



 public void addMedia(Media mediaItem) {
        if (checkMediaInOrderMediaList(mediaItem, itemsOrdered))
             System.out.println("MediaItem này đã tồn tại trước đó!!!");
         else {
             itemsOrdered.add(mediaItem);
             System.out.println("Thông báo: Đã add media này!");

         }

     }

    public void removeMedia(Media mediaItem) {
        if (itemsOrdered.size() == 0) {
            System.out.println("Error: Đơn hàng trống!!!Không thể xóa!!!");
        } else {
            boolean check = false;
            for (int i = 0; i < itemsOrdered.size(); i++) {
                if (itemsOrdered.get(i).equals(mediaItem)) {
                    for (int j = i; j < itemsOrdered.size() - 1; j++) {
                     //   itemsOrdered[j] = itemsOrdered[j + 1];
                          itemsOrdered.set(j,itemsOrdered.get(j+1));
                    }

                    check = true;
                }
            }
            if (check) {
                System.out.println("Thông báo: Media Items này đã được xóa!");
            } else {
                System.out.println("Error: Media Item này không tồn tại trong đơn!!!");
            }

        }
    }
    public void removeMedia(int id){
        if (itemsOrdered.size() == 0) {
            System.out.println("Error: Đơn hàng trống!!!Không thể xóa!!!");
        } else {
           itemsOrdered.remove(id);
        }
    }

    public float totalCost() {
        float sumCost = 0;
        for (Media mediaListItem: itemsOrdered) {
            sumCost += mediaListItem.getCost();
        }
        return sumCost;
    }

    public void printListOfOrderItems() {
        System.out.println("*******************************************************Order****************************************************");
        System.out.print("Date: " + dateOrdered.toStringDMYYYY());
        System.out.println("\nOrder items: ");
        printMediaItemsListOfOrder();
        System.out.println("Total Cost: " + totalCost());
        System.out.println("****************************************************************************************************************");

    }

    public Media getALuckyItem() {
        Random rn = new Random();
        int luckyNumber = rn.nextInt(itemsOrdered.size()) ;
        ArrayList<Media> luckyItem = new ArrayList<Media>(1);
        luckyItem.add(itemsOrdered.get(luckyNumber));
        System.out.println("Thông tin DVD may mắn được free: ");
        printMediaItemsList(luckyItem);
      //  itemsOrdered.get(luckyNumber).setCost(0);
        return itemsOrdered.get(luckyNumber);
    }
}