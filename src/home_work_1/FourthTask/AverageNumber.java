package home_work_1.FourthTask;

import java.util.Scanner;

// 4.2

public class AverageNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a first number: ");
        int a = in.nextInt();
        System.out.print("Input a second number: ");
        int b = in.nextInt();
        System.out.print("Input a third number: ");
        int c = in.nextInt();

        if (a >= b && a <= c || a <= b && a >= c) {
            System.out.println("Average number: " + a);
        } else if (b >= a && b <= c || b <= a && b >= a) {
            System.out.println("Average number: " + b);
        } else {
            System.out.println("Average number: " + c);
            in.close();
        }
    }
}
