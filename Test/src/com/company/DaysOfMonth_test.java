package com.company;
import java.util.Scanner;
public class DaysOfMonth_test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String month, year;
        int numOfDays =-1;
        int yearInt =-1;


        System.out.println("Nhap ngay va thang: ");


        do {
            System.out.print("Nhap thang: ");
            month = scanner.nextLine();
            // check the validity of the input
            numOfDays = checkValidMonthAndGetDay(month);
            if (numOfDays == -1) {
                System.out.println("Khong ton tai thang nay");
            }
        } while (numOfDays == -1);


        do {
            System.out.print("Nhap nam: ");
            year = scanner.nextLine();
            yearInt = Integer.parseInt(year);

            if (yearInt < 0) {
                System.out.println("Khong ton tai nam nay");
            }
        } while (yearInt < 0);


        if (numOfDays == 2) {
            if (((yearInt % 400) == 0) ||
                    ((yearInt % 100) != 0 && (yearInt % 4) == 0)) {
                numOfDays = 29;
            } else {
                numOfDays = 28;
            }
        }


        System.out.println("thang " +
                month + "/" + year + " co " + numOfDays + " ngay.");

        scanner.close();
        System.exit(0);

    }

    public static int checkValidMonthAndGetDay(String month) {
        switch(month) {
            case "January":	case "Jan.": case "Jan": case "1":
            case "March": case "Mar.": case "Mar": case "3":
            case "May": case "May.": case "5":
            case "July": case "Jul.": case "Jul": case "7":
            case "August": case "Aug.": case "Aug": case "8":
            case "October": case "Oct.": case "Oct": case "10":
            case "December": case "Dec.": case "Dec": case "12":
                return 31;
            case "April": case "Apr.": case "Apr": case "4":
            case "June": case "Jun.": case "Jun": case "6":
            case "September": case "Sep.": case "Sep": case "9":
            case "November": case "Nov.": case "Nov": case "11":
                return 30;
            case "February": case "Feb.": case "Feb": case "2":
                return 2;
            default:
                return -1;
        }
    }
}
