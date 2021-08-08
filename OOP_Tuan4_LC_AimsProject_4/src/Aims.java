/*public class Aims{

    public static void main(String[] args) {
          Order TestOrder1 = new Order();
          Order TestOrder2 = new Order();
          DigitalVideoDisc disc1 = new DigitalVideoDisc("Cẩm Li","Ngôn tình",14f);
          DigitalVideoDisc disc2 = new DigitalVideoDisc("Việt Nhật","Hài",12f);
          DigitalVideoDisc disc3 = new DigitalVideoDisc("Nhật Bản","Viễn tưởng",11f);
          DigitalVideoDisc[] dvdList = {disc1,disc2,disc3};
          DigitalVideoDisc[] newList = new DigitalVideoDisc[2];
          newList[0] = new DigitalVideoDisc("Hello");
          newList[1] = new DigitalVideoDisc("Hiii");
          System.out.println("Add list video số 1");
         // System.out.println("Add 1 DVD: ");
        //  TestOrder1.addDigitalVideoDisc(disc1);
         // System.out.println(TestOrder1.getQtyOrdered());
          TestOrder1.addDigitalVideoDisc(dvdList);
         // System.out.println(TestOrder1.getQtyOrdered());
         // TestOrder1.addDigitalVideoDisc(disc1,disc2);
         // System.out.println("Add list video số 2");
       //   TestOrder1.addDigitalVideoDisc(newList);
        //  System.out.println(TestOrder1.getQtyOrdered());
         // TestOrder1.printDigitalVideoListOfOrder();
         // TestOrder1.addDigitalVideoDisc(disc1);
       /*   System.out.println("Add list video số 2 vào Order2:");
          TestOrder2.addDigitalVideoDisc(newList);
          TestOrder2.printDigitalVideoListOfOrder();
          System.out.println("Print cost: ");
          System.out.println(TestOrder1.totalCost());
          System.out.println("Xóa 1 video đi:");
          TestOrder1.removeDigitalVideoDisc(disc3);
          System.out.println("Print cost: ");
          System.out.println(TestOrder1.totalCost());
          System.out.println("Danh sách dvd hiện tại: ");
          TestOrder1.printDigitalVideoListOfOrder();
          TestOrder1.addDigitalVideoDisc(disc1,disc2);
          TestOrder1.removeDigitalVideoDisc(disc1);
          TestOrder1.printDigitalVideoListOfOrder();

          TestOrder1.printListOfOrderItems();






    }
} */
public class Aims {

      public static void main(String[] args) {

            Order anOrder;
            if(Order.getNbOrders()+1 <= Order.MAX_LIMITED_ORDERS) {
                  anOrder = new Order();
            }
            else {
                  anOrder = null;
                  System.out.println("Max number of orders reached! Can not create!");
            }

            DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Aller", 87, 19.95f);
            anOrder.addDigitalVideoDisc(dvd1);

            DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas", 87, 24.95f);
            anOrder.addDigitalVideoDisc(dvd2);

            DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin","Animation","George Lucas", 18.99f);
            anOrder.addDigitalVideoDisc(dvd3);

            System.out.println("Total Cost is: ");
            System.out.println(anOrder.totalCost());

            anOrder.removeDigitalVideoDisc(dvd2);
            System.out.println("Total Cost is: ");
            System.out.println(anOrder.totalCost());

            anOrder.removeDigitalVideoDisc(dvd1);
            anOrder.removeDigitalVideoDisc(dvd3);
            System.out.println("Total Cost is: ");
            System.out.println(anOrder.totalCost());
            anOrder.removeDigitalVideoDisc(dvd2);

            DigitalVideoDisc dvdList[] = {dvd1,dvd2,dvd3};
            anOrder.addDigitalVideoDisc(dvdList);
            System.out.println("Total Cost is: ");
            System.out.println(anOrder.totalCost());


            Order Order2;
            if(Order.getNbOrders()+1 <= Order.MAX_LIMITED_ORDERS) {
                  Order2 = new Order();
            }
            else {
                  Order2 = null;
                  System.out.println("Max number of orders reached! Can not create!");
            }

            Order Order3;
            if(Order.getNbOrders()+1 <= Order.MAX_LIMITED_ORDERS) {
                  Order3 = new Order();
            }
            else {
                  Order3 = null;
                  System.out.println("Max number of orders reached! Can not create!");
            }

            Order Order4;
            if(Order.getNbOrders()+1 <= Order.MAX_LIMITED_ORDERS) {
                  Order4 = new Order();
            }
            else {
                  Order4 = null;
                  System.out.println("Max number of orders reached! Can not create!");
            }

            Order Order5;
            if(Order.getNbOrders()+1 <= Order.MAX_LIMITED_ORDERS) {
                  Order5 = new Order();
            }
            else {
                  Order5 = null;
                  System.out.println("Max number of orders reached! Can not create!");
            }

            Order Order6;
            if(Order.getNbOrders()+1 <= Order.MAX_LIMITED_ORDERS) {
                  Order6 = new Order();
            }
            else {
                  Order6 = null;
                  System.out.println("Max number of orders reached! Can not create!");
            }

            Order2.addDigitalVideoDisc(dvd3);
            Order3.addDigitalVideoDisc(dvd2);
            Order4.addDigitalVideoDisc(dvd1);
            Order5.addDigitalVideoDisc(dvd2,dvd3);

            anOrder.printListOfOrderItems();
            Order5.printListOfOrderItems();
      }
}