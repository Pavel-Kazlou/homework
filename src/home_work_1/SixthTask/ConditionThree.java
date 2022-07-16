package home_work_1.SixthTask;

import java.util.Scanner;

public class ConditionThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        String greetings = "Привет!";
        String sentence = "Я тебя так долго ждал";
        String question = "Добрый день, а вы кто?";

        switch (name) {
            case "Вася":
                System.out.println(greetings);
                System.out.println(sentence);
                break;
            case "Анастасия":
                System.out.println(sentence);
                break;
            default:
                System.out.println(question);
                break;
        }
    }
}

