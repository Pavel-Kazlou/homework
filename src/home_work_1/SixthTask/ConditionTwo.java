package home_work_1.SixthTask;

import java.util.Scanner;

public class ConditionTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        String name1 = "Вася";
        String name2 = "Анастасия";
        String greetings = "Привет!";
        String sentence = "Я тебя так долго ждал";
        String question = "Добрый день, а вы кто?";

        if (name.equals(name1)) {
            System.out.println(greetings);
            System.out.println(sentence);
        } else if (name.equals(name2)) {
            System.out.println(sentence);
        } else {
            System.out.println(question);
        }
    }
}
