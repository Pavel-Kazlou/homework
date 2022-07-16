package home_work_1.FourthTask;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int year = in.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0) && ((year % 100 != 0))) {
            System.out.println("Leap year");
        } else {
            System.out.println("Non-leap year");
            in.close();
        }
    }
}
