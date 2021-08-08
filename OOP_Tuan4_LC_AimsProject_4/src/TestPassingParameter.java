public class TestPassingParameter {
    public static void main(String[] args){
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle DVD title: "+ jungleDVD.getTitle());
        System.out.println("cinderella DVD title: "+ cinderellaDVD.getTitle());
        newSwap(jungleDVD,cinderellaDVD);
        System.out.println("jungle DVD title: "+ jungleDVD.getTitle());
        System.out.println("cinderella DVD title: "+ cinderellaDVD.getTitle());
        changeTitle(jungleDVD,cinderellaDVD.getTitle());
        System.out.println("jungle DVD title: "+ jungleDVD.getTitle());
        System.out.println("cinderella DVD title: "+ cinderellaDVD.getTitle());
    }
    public static void swap(Object o1, Object o2){
        Object tmp =o1;
        o1 = o2;
        o2 = tmp;
    }
    public static void newSwap(DigitalVideoDisc disc1, DigitalVideoDisc disc2){
        String oldTitle1 = disc1.getTitle();
        String oldTitle2 = disc2.getTitle();
        disc1.setTitle(oldTitle2);
        disc2.setTitle(oldTitle1);
    }
    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}

