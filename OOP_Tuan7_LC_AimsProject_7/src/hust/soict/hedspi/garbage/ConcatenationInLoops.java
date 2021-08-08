package hust.soict.hedspi.garbage;
import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        Random r = new Random(123);  // khởi tạo đối tượng r của Random
        long start = System.currentTimeMillis(); // trả về số mili giây từ ngày 1/1/1970 cho đến nay
        String s = "";
        for (int i=0; i< 65536; i++)
            s += r.nextInt(2); // cộng s với số ngẫu nhiên từ 0 đến 2
        System.out.println(System.currentTimeMillis() - start); // tính được thời gian chạy vòng lặp

        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i< 65536; i++)
            sb.append(r.nextInt(2));
        s = sb.toString();
        System.out.println(System.currentTimeMillis() - start);

        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i=0; i< 65536; i++)
            sbf.append(r.nextInt(2));
        s = sbf.toString();
        System.out.println(System.currentTimeMillis() - start);
    }
}
// đo thời gian của 3 phương pháp