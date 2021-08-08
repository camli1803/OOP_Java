package hust.soict.hedspi.aims;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.order.Order;

public class Aims {
      private static ArrayList<Order> Orders = new ArrayList<>();
      private static ArrayList<CompactDisc> CDs = new ArrayList<>();
      public static void createOrder() {
            if(Orders.size() < Order.MAX_LIMITED_ORDERS ) {
                  Order newOrder = new Order();
                  System.out.println("Order created. Id : " + Orders.size());
                  Orders.add(newOrder);
            }
            else
                  System.out.println("Max number of orders reached! Can not create!");
      }

      public static void createCDList(){    // Vì mỗi Cd có thể có nhiều track nên
            // ta tạo list Cd để người dùng có thể add thêm track vào khi muốn
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter title of CD: ");
            String title = keyboard.nextLine();
            System.out.println("Please enter category of CD: ");
            String category = keyboard.nextLine();
            System.out.println("Please enter director of CD: ");
            String director = keyboard.nextLine();
            System.out.println("Please enter artist of CD: ");
            String artist = keyboard.nextLine();
            System.out.println("Please enter length of CD: ");
            int length = keyboard.nextInt();
            keyboard.nextLine();
            CompactDisc CD = new CompactDisc(title,category,length,director,artist);
            System.out.println("CD created. Id : " + CDs.size());
            CDs.add(CD);
      }
      public static int OrderId(){
            Scanner keyboard = new Scanner(System.in);
            int orderId;
            do{
                  System.out.println("Please enter order id: ");
                  orderId = Integer.parseInt(keyboard.nextLine());
                  if (orderId < 0 || orderId >= Orders.size()) {
                        System.out.println("Invalid order id!");
                  }
            } while (orderId < 0 || orderId >= Orders.size());
            return orderId;

      }

      public static void addItem(int orderId) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter 1 to add a DVD, 2 to add a Book, 3 to add a CD : ");
            int type = Integer.parseInt(keyboard.nextLine());
            if (type == 1) {
                  System.out.println("Please enter title: ");
                  String title = keyboard.nextLine();
                  System.out.println("Please enter category: ");
                  String category = keyboard.nextLine();
                  System.out.println("Please enter director: ");
                  String director = keyboard.nextLine();
                  System.out.println("Please enter length: ");
                  int length = keyboard.nextInt();
                  keyboard.nextLine();
                  System.out.println("Please enter cost: ");
                  float cost = keyboard.nextFloat();
                  keyboard.nextLine();
                  DigitalVideoDisc item = new DigitalVideoDisc(title,category,director,length,cost);
                  Orders.get(orderId).addMedia(item);
                  System.out.println("Bạn có muốn chạy thử DVD này?");
                  System.out.println("Bấm 1: Đồng ý!");
                  System.out.println("Bấm 0: Không chạy thử!");
                  int check = keyboard.nextInt();
                  keyboard.nextLine();
                  if(check == 1){
                      item.play();
                  }
                  }
            else if (type == 2){
                  System.out.println("Please enter title: ");
                  String title = keyboard.nextLine();
                  System.out.println("Please enter category: ");
                  String category = keyboard.nextLine();
                  System.out.println("Please enter author: ");
                  String author = keyboard.nextLine();
                  List<String> authors = new ArrayList<String>();
                  authors.add(author);
                  System.out.println("Please enter cost: ");
                  float cost = Float.parseFloat(keyboard.nextLine());
                  Book item = new Book(title,category,cost,authors);
                  Orders.get(orderId).addMedia(item);
            }
            else if(type ==3) {
                  int CDId;
                  if (CDs.size() == 0) {
                        createCDList();
                        CDId =0;
                        System.out.println("Đã khởi tạo CD đầu tiên!");
                        System.out.println("Mã id: 0");
                  } else {
                        // Kiểm tra xem người dùng có muốn tạo 1 Cd mới không.

                        System.out.println("Bạn có muốn tạo track mới trong CD mới không?");
                        System.out.println("Bấm 1: Đồng ý!");
                        System.out.println("Bấm 0: Thêm track vào CD đã được khởi tạo sẵn!");
                        int checkCreateCDNumber = keyboard.nextInt();
                        keyboard.nextLine();
                        // Khởi tạo thêm CD nếu người dùng muốn tạo
                        if (checkCreateCDNumber == 1) {
                              createCDList();
                              CDId = CDs.size()-1;
                              System.out.println("Đã khởi tạo CD mới!");
                              System.out.println("Mã id:" + (CDs.size()-1));
                        }
                        // Người dùng không muốn khởi tạo thì kiểm tra xem id người dùng nhập có nằm trong
                        // các CD đã được khởi tạo trước đó hay không
                        else {
                             do {
                                    System.out.println("Please enter CD id: ");
                                    CDId = keyboard.nextInt();
                                    keyboard.nextLine();
                                    if (CDId < 0 || CDId >= CDs.size()) {
                                          System.out.println("Invalid CD id!");
                                    }
                              } while (CDId < 0 || CDId >= CDs.size());

                        }
                  }
                  System.out.println("Please enter the title of Track: ");
                  String titleTrack = keyboard.nextLine();
                  System.out.println("Please enter length of Track: ");
                  int lengthTrack = keyboard.nextInt();
                  keyboard.nextLine();
                  Track track = new Track(titleTrack ,lengthTrack);
                  CDs.get(CDId).addTrack(track);
                  Orders.get(orderId).addMedia(CDs.get(CDId));
                  System.out.println("Bạn có muốn chạy thử CD này?");
                  System.out.println("Bấm 1: Đồng ý!");
                  System.out.println("Bấm 0: Không chạy thử!");
                  int check = keyboard.nextInt();
                  keyboard.nextLine();
                  if(check == 1){
                        CDs.get(CDId).play();
                  }
            }
            else
                  System.out.println("Invalid number!");

      }
      public static void deleteItem(int orderId) {
            Scanner keyboard = new Scanner(System.in);
            if (orderId < 0 || orderId >= Orders.size())
                  System.out.println("Invalid order id!");
            else {
                  if(Orders.get(orderId).getItemsOrdered().size()==0){
                        System.out.println("Oder này chưa có media item!!!");
                  }
                  else{
                        int itemId;
                        do{
                        System.out.println("Please enter item id : ");
                        itemId = Integer.parseInt(keyboard.nextLine());
                        if(itemId<0 || itemId > (Orders.get(orderId).getItemsOrdered().size()-1)){
                        System.out.println("Invalid media item id!");
                         }
                        } while( itemId<0 || itemId > (Orders.get(orderId).getItemsOrdered().size()-1));
                        Orders.get(orderId).removeMedia(itemId);
                        System.out.println("Đã xóa media Item này!!!");

      }
      }
      }
      public static void displayOrder(int orderId) {
              Orders.get(orderId).printMediaItemsListOfOrder();

      }
      public static void showMenu() {
            Scanner keyboard = new Scanner(System.in);
            int n, check = 0;
            do {
                  System.out.println("\nOrder Management Application: ");
                  System.out.println("--------------------------------");
                  System.out.println("1. Create new order");
                  System.out.println("2. Add item to the order");
                  System.out.println("3. Delete item by id");
                  System.out.println("4. Display the item list of order");
                  System.out.println("0. Exit");
                  System.out.println("--------------------------------");
                  System.out.println("Please choose a number: 0-1-2-3-4");
                  System.out.print("Enter the choose: ");

                  n = keyboard.nextInt();
                  keyboard.nextLine();
                  switch(n) {
                        case 0:
                              System.out.println("Goodbye!");
                              break;
                        case 1:
                              if (check == 0 ) check = 1;
                              createOrder();
                              break;
                        case 2:
                              if (check == 0) {
                                    System.out.println("Create an order first!");
                                    break;
                              }
                              int orderID = OrderId();
                              addItem(orderID);
                              break;
                        case 3:
                              if (check == 0) {
                                    System.out.println("Create an order first!");
                                    break;
                              }
                              int orderID1 = OrderId();
                              deleteItem(orderID1);
                              break;
                        case 4:
                              if (check == 0) {
                                    System.out.println("Create an order first!");
                                    break;
                              }
                              int orderID2 = OrderId();
                              displayOrder(orderID2);
                              break;
                        default:
                              System.out.println("Invalid number!");
                  }
            } while (n!=0);
            keyboard.close();
      }
      public static void showAdminMenu() {
            Scanner keyboard = new Scanner(System.in);
            createOrder();
            int n;
            do {  System.out.println("Product Management Application: ");
                  System.out.println("--------------------------------");
                  System.out.println("1. Create new item");
                  System.out.println("2. Delete item by id");
                  System.out.println("3. Display the items list");
                  System.out.println("0. Exit");
                  System.out.println("--------------------------------");
                  System.out.println("Please choose a number: 0-1-2-3");

                  n = keyboard.nextInt();
                  keyboard.nextLine();
                  switch(n) {
                        case 0:
                              System.out.println("Goodbye!");
                              break;
                        case 1:
                              System.out.println("Create a new item!!!");
                              addItem(0);
                              break;
                        case 2:
                              deleteItem(0);
                              break;
                        case 3:
                              displayOrder(0);
                              break;
                        default:
                              System.out.println("Invalid number!");
                  }
            } while (n!=0);
            keyboard.close();
      }

      public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Chọn tư cách đăng nhập của bạn: ");
            System.out.println("1. Admin");
            System.out.println("2. Khách hàng");
            System.out.print("Bạn chọn: ");
            int choose = keyboard.nextInt();
            keyboard.nextLine();
            if(choose == 1) showAdminMenu();
            else showMenu();
      }
}




