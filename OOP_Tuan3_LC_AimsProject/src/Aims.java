public class Aims{

    public static void main(String[] args) {
          Order TestOrder1 = new Order();
          DigitalVideoDisc disc1 = new DigitalVideoDisc("Cẩm Li","Ngôn tình",14f);
          DigitalVideoDisc disc2 = new DigitalVideoDisc("Việt Nhật","Hài",12f);
          DigitalVideoDisc disc3 = new DigitalVideoDisc("Nhật Bản","Viễn tưởng",11f);
          TestOrder1.addDigitalVideoDisc(disc1);
          TestOrder1.addDigitalVideoDisc(disc2);
          TestOrder1.addDigitalVideoDisc(disc3);
          System.out.println(TestOrder1.totalCost());
          TestOrder1.removeDigitalVideoDisc(disc3);
          System.out.println(TestOrder1.totalCost());



    }
}
