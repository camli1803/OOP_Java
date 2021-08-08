package MyDay;

public class CheckAndConvert {

    public static int ConvertMonth(String strMonth){
        switch (strMonth){
            case "1":
            case "Jan.":
            case "January":
            case "Jan":
                return 1;

            case "2":
            case "Feb.":
            case "February":
            case "Feb":
                return 2;

            case "3":
            case "Mar.":
            case "March":
            case "Mar":
                return 3;

            case "4":
            case "Apr.":
            case "April":
            case "Apr":
                return 4;

            case "5":
            case "May":
                return 5;

            case "6":
            case "June":
            case "Jun.":
            case "Jun":
                return 6;

            case "7":
            case "July":
            case "Jul.":
            case "Jul":
                return 7;

            case "8":
            case "August":
            case "Aug.":
            case "Aug":
                return 8;

            case "9":
            case "September":
            case "Sep":
            case "Sep.":
                return 9;

            case "10":
            case "October":
            case "Oct.":
            case "Oct":
                return 10;

            case "11":
            case "November":
            case "Nov.":
            case "Nov":
                return 11;

            case "12":
            case "December":
            case "Dec.":
            case "Dec":
                return 12;

            default:
                return -1;


        }
    }
}
