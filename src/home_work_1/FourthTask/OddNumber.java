package home_work_1.FourthTask;

//4.1

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = in.nextInt();

        if (a % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd Number");
            in.close();
        }
    }
}
