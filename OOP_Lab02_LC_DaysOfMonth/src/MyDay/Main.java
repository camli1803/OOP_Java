package MyDay;

import static MyDay.CheckAndConvert.ConvertMonth;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Input month: ");
        String strMonth = kb.nextLine();
        System.out.println("Input year: ");
        int iyear = kb.nextInt();
        DaysOfMonth Test1 = new DaysOfMonth();
        int imonth = ConvertMonth(strMonth);
        Test1.setMonth(imonth);
        Test1.setYear(iyear);
        Test1.Days();
    }
}
