package home_work_1;

public class FifthTask {

    public static void main(String[] args) {

        boolean result = sleepIn(true, false);
        if (result) {
            System.out.println("Можем спать дальше");
        } else {
            System.out.println("Нам пора вставать");
            System.out.println("Включаю чайник");
            System.out.println("Открываю шторы");
        }
    }

    /**
     * Отвечает на вопрос можно ли спать
     *
     * @param weekday  - сейчас рабочий день?
     * @param vacation - сейчас отпуск?
     * @return true - да можно спать, false - нет спать нельзя
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
}
