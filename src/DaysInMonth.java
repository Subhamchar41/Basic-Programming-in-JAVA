public class DaysInMonth {
    public static void main(String args[]) {
        int noofdays=800,years,month,days;
         years=noofdays/365;
         month=(noofdays%365)/30;
         days=(noofdays%365)%30;
         System.out.println(years);
        System.out.println(month);
        System.out.println(days);
    }
}
