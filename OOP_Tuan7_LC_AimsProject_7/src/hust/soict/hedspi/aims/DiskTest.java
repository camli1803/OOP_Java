package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class DiskTest {
    public static void main(String[] args ){
        Order anOrder = new Order();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Aller", 87, 19.95f);
        anOrder.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas", 87, 24.95f);
        anOrder.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin","Animation","George Lucas", 18.99f);
        anOrder.addMedia(dvd3);

        if(dvd1.search("The King")) System.out.println("Có từ này!");
        else{
            System.out.println("Không có từ này");
        }
        System.out.println("Total cost: "+anOrder.totalCost());
        anOrder.getALuckyItem();
        System.out.println("Total cost: "+anOrder.totalCost());
    }
}
