package MyDay;

public class DaysOfMonth {
    int month, year;

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void Days() {
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Days of Month: ");
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Days of Month: ");
                System.out.println("30 days");
                break;
            case 2:
                if(year % 100 ==0 && year % 400 != 0){
                    System.out.println("Days of Month: ");
                    System.out.println("28 days");
                }
                else if(year % 4 ==0){
                    System.out.println("Days of Month: ");
                    System.out.println("29 days");
                }
                else {
                    System.out.println("Days of Month: ");
                    System.out.println("28 days");
                }
                break;
            default:
                System.out.println("This month is not valid!!!");
                break;
        }
    }

}
