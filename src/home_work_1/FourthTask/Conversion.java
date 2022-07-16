package home_work_1.FourthTask;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = in.nextInt();
        double b = 1024;

        if (a <= b){
            double result1 = a / b;
            System.out.print(a + "b - ");
            System.out.println(result1 + ",Kb");
        } else if (a > b) {
            double result2 = a / b;
            System.out.print(a + "b - ");
            System.out.println(result2 + ",Kb");
            in.close();
        }

    }
}
