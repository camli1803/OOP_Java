public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered =0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered >= MAX_NUMBERS_ORDERED) {
            System.out.println("Error: Đã đầy disc trong order!!!");

        }
        else {
            boolean check = false;
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemsOrdered[i] == disc) {
                    check = true;
                }
            }
            if (check == true) System.out.println("Error: Disc này đã được add trước đó!!!" );
            else{
                itemsOrdered[qtyOrdered] = disc;
                qtyOrdered++;
                System.out.println("Thông báo: Đã add!");

            }

        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered ==0){
            System.out.println("Error: Đơn hàng trống!!!Không thể xóa!!!");
        }
        else{
            for(int i =0; i<qtyOrdered; i++){
                if(itemsOrdered[i].equals(disc)){
                    for(int j=i;j<qtyOrdered-1;j++){
                        itemsOrdered[j] = itemsOrdered[j+1];

                    }

                    qtyOrdered --;
                    System.out.println("Disc này đã được xóa!!!");
                }
                else{
                    System.out.println("Error: Disc này không tồn tại trong đơn!!!");
                }
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
}