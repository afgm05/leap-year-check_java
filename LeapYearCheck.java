import java.util.Scanner;

public class LeapYearCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input year to be checked if a leap year.");
        int year = sc.nextInt();

        double modulo4 = year % 4;
        double modulo100 = year % 100;
        double modulo400 = year % 400;

        if ((modulo4 == 0 && modulo100 != 0) || (modulo100 == 0 && modulo400 == 0) )
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is NOT a leap year");

    }
}
