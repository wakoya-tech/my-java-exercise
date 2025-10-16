public class switchstatementexample {
    public static void main(String[] args) {
        int monthnumber = 3;
        String monthname;
        switch (monthnumber) {
            case 1:
                monthname = "january";
                break;
            case 2:
                monthname = "february";
                break;
            case 3:
                monthname = "march";
                break;
            case 4:
                monthname = "april";
                break;
            case 5:
                monthname = "may";
                break;
            case 6:
                monthname = "june";
                break;
            case 7:
                monthname = "july";
                break;
            case 8:
                monthname = "august";
                break;
            case 9:
                monthname = "september";
                break;
            case 10:
                monthname = "october";
                break;
            case 11:
                monthname = "november";
                break;
            case 12:
                monthname = "december";
                break;
            default:
                monthname = "invalid month";
                break;
        }
        System.out.println("the month of the year is " + monthname);
    }
}
