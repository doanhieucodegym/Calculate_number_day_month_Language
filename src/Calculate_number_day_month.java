import java.util.Scanner;

public class Calculate_number_day_month {
    public static void main(String[] args) {
        System.out.println("Nhập tháng cần  tìm số  ngày :");
        Scanner sc =new Scanner(System.in);
        int month =sc.nextInt();
        String dayInmonth ;
        switch (month){
            case 2:
                dayInmonth ="28 or 29 ";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInmonth ="31 ";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInmonth ="30  ";
                break;
            default:
                dayInmonth ="";
        }
        if(dayInmonth !=" "){
            System.out.printf("The month %d has %s day!", month, dayInmonth);
        }else{
            System.out.println("Invalid input");
        }
    }
}
