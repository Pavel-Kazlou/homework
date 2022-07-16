package home_work_1.FourthTask;

import java.util.Scanner;

public class LetterOrSymbol {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input text:\n");
        String inputLine = in.nextLine();
        char symbol = inputLine.charAt(0);
        System.out.println("Наш символ: " + symbol);

        if ((symbol >= 'a') && (symbol <= 'z') || (symbol >= 'A') && (symbol <= 'Z')) {
            System.out.println("Letter");
        } else if ((symbol >= ' ') && (symbol <= '/') || (symbol >= ':') && (symbol <= '@') || (symbol >= '[') && (symbol <= '`')
                || (symbol >= '{') && (symbol <= '~')) {
            System.out.println("Symbol");
        }
    }
}
