package home_work_1;

public class Main1 {
    public static void main(String[] args) {
        CarCorrect car1 = new CarCorrect();

        car1.setModelName("Gallant");
        car1.setPrice(800);

        System.out.println(car1.getPrice());
        System.out.println(car1.getModelName());
        System.out.println(car1.offer());
    }
}
