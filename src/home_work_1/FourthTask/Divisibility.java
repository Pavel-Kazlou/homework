package home_work_1.FourthTask;

import java.util.Scanner;

// 4.3

public class Divisibility {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a first number: ");
        int a = in.nextInt();
        System.out.print("Input a second number: ");
        int b = in.nextInt();

        if (a % b == 0) {
            System.out.println("первое делится на второе");
        } else {
            System.out.println("первое не делится второе");
        }
        if (b % a == 0) {
            System.out.println("второе делится на первое");
        } else {
            System.out.println("второе не делится на первое");
            in.close();
        }

    }
}
