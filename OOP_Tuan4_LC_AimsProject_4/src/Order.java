import java.time.LocalDate;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private MyDate dateOrdered;
    private int qtyOrdered =0;
    private static int nbOrders = 0;
    public static final int MAX_LIMITED_ORDERS = 5;

    public static int getNbOrders() {
        return nbOrders;
    }



    // Phương thức constructor của Order Class
    public Order(){
            LocalDate currentDate = LocalDate.now();
            int day = currentDate.getDayOfMonth();
            int month = currentDate.getMonthValue();
            int year = currentDate.getYear();
            dateOrdered = new MyDate(day,month,year);
            nbOrders ++;
            System.out.println("Thông báo: Order thứ "+nbOrders+" đã được tạo!!!");
        }


    // Các phương thức của Class Order

    public int getQtyOrdered() {
        return qtyOrdered;
    }


    public boolean checkDVDInOrderDVDList(DigitalVideoDisc disc, DigitalVideoDisc[] dvdList){
        boolean check = false;
        for (int i = 0; i < dvdList.length; i++) {
            if (dvdList[i] == disc) {
                check = true;
            }
        }
        return check;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("Error: Đã đầy disc trong order!!!Không thể add thêm!!!");
            DigitalVideoDisc []listOfDVDNotYetAdded = {disc};
            System.out.println("Thông tin dvd không được add là: ");
            printDigitalVideoDisc(listOfDVDNotYetAdded);
        }
        else {

            if (checkDVDInOrderDVDList(disc,itemsOrdered)) System.out.println("Error: Disc này đã được add trước đó!!!" );
            else{
                itemsOrdered[qtyOrdered] = disc;
                qtyOrdered++;
                System.out.println("Thông báo: Đã add!");

            }

        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        if(qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("Error: Đã đầy disc trong order!!!Không thể add thêm!!!");
            System.out.println("Thông tin dvd không được add là: ");
            printDigitalVideoDisc(dvdList);
        }
        else{
            if(dvdList.length > MAX_NUMBERS_ORDERED - qtyOrdered){
                int i=0;
                while(qtyOrdered < MAX_NUMBERS_ORDERED){
                    if(checkDVDInOrderDVDList(dvdList[i],itemsOrdered)) {
                        System.out.println("Error: Disc này đã được add trước đó!!!");
                        i++;
                    }
                    else{
                        itemsOrdered[qtyOrdered] = dvdList[i];
                        qtyOrdered++;
                        i++;
                    }
                }
                System.out.println("Thông báo: Đã add được "+i+" dvd trong tổng số "+dvdList.length+" dvd của list!");
                DigitalVideoDisc []listOfDVDNotYetAdded = new DigitalVideoDisc[dvdList.length-i];
                for(int j =0; j<dvdList.length -i; j++){
                    listOfDVDNotYetAdded[j] = dvdList[i];
                }
                System.out.println("Thông tin dvd không được add là: ");
                printDigitalVideoDisc(listOfDVDNotYetAdded);
            }
            else{
               int i =0;
                while(i < dvdList.length){
                    if(checkDVDInOrderDVDList(dvdList[i],itemsOrdered)) {
                        System.out.println("Error: Disc này đã được add trước đó!!!");
                        i++;
                    }
                    else{
                        itemsOrdered[qtyOrdered] = dvdList[i];
                        qtyOrdered++;
                        i++;
                    }
                }
                System.out.println("Thông báo: Đã add hết danh sách dvd này!");
            }

    }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        if(qtyOrdered == MAX_NUMBERS_ORDERED){
            System.out.println("Error: Đã đầy disc trong order!!! Không thể add thêm!!!");
            DigitalVideoDisc []listOfDVDNotYetAdded = {dvd1,dvd2};
            System.out.println("Thông tin dvd không được add là: ");
            printDigitalVideoDisc(listOfDVDNotYetAdded);
        }
        else{
            if(qtyOrdered == MAX_NUMBERS_ORDERED-1){
                if (checkDVDInOrderDVDList(dvd1,itemsOrdered)) {
                    if(checkDVDInOrderDVDList(dvd2,itemsOrdered)){
                        System.out.println("Error: Cả 2 disc này đều đã được add trước đó!!!");
                    }
                    else{
                        itemsOrdered[qtyOrdered] = dvd2;
                        qtyOrdered++;
                        System.out.println("Thông báo: Đã add cả 2 dvd!");
                    }
                     }
                else{
                itemsOrdered[qtyOrdered] = dvd1;
                qtyOrdered++;
                System.out.println("Thông báo: Đã add 1 dvd trong số 2 dvd! ");
                System.out.println("Thông tin dvd chưa được add là: ");
                DigitalVideoDisc []listOfDVDNotYetAdded = {dvd2};
                printDigitalVideoDisc(listOfDVDNotYetAdded);
            }
            }
            else{
                if(checkDVDInOrderDVDList(dvd1,itemsOrdered) && checkDVDInOrderDVDList(dvd2,itemsOrdered))
                    System.out.println("Error: Cả 2 disc này đều đã được add trước đó!!!");
                else{
                    if(!checkDVDInOrderDVDList(dvd1,itemsOrdered)){
                   itemsOrdered[qtyOrdered] = dvd1;
                   qtyOrdered++;
                    }
                    if(!checkDVDInOrderDVDList(dvd2,itemsOrdered)){
                   itemsOrdered[qtyOrdered] = dvd2;
                   qtyOrdered++;
                    }

                System.out.println("Thông báo: Đã add cả 2 dvd!");
                }

        }
    }
    }
    public void printDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        if (dvdList.length == 0) {
            System.out.println("Không tồn tại DVD nào trong list này!!!");
        } else {
            System.out.printf("%-25s %-25s %-25s %-25s %-25s\n", "Title", "Category", "Director", "Length", "Cost");
            for (DigitalVideoDisc disc: dvdList) {
                if (disc != null) {
                    System.out.printf("%-25s %-25s %-25s %-25s %-25s\n", disc.getTitle(),disc.getCategory(), disc.getDirector(), disc.getLength(),disc.getCost());
                }
            }
        }
    }

   public void printDigitalVideoListOfOrder(){
        printDigitalVideoDisc(itemsOrdered);
        }
   public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered ==0){
            System.out.println("Error: Đơn hàng trống!!!Không thể xóa!!!");
        }
        else{
            boolean check = false;
            for(int i =0; i<qtyOrdered; i++){
                if(itemsOrdered[i].equals(disc)){
                    for(int j=i;j<qtyOrdered-1;j++){
                        itemsOrdered[j] = itemsOrdered[j+1];

                    }

                    qtyOrdered --;
                    check = true;
                }
            }
                if(check){
                    System.out.println("Thông báo: Disc này đã được xóa!");
                }
                else{
                    System.out.println("Error: Disc này không tồn tại trong đơn!!!");
                }

            }
        }

    public float totalCost(){
        float sumCost =0;
        for(int i=0; i<qtyOrdered; i++){
            sumCost += itemsOrdered[i].getCost();
        }
        return sumCost;
    }
    public void printListOfOrderItems(){
        System.out.println("*******************************************************Order****************************************************");
        System.out.print("Date: "+dateOrdered.toStringDMYYYY());
        System.out.println("\nOrder items: ");
        printDigitalVideoListOfOrder();
        System.out.println("Total Cost: "+ totalCost());
        System.out.println("****************************************************************************************************************");

    }

}