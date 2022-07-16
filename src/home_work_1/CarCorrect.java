package home_work_1;

public class CarCorrect {
    private int price;
    public String modelName;

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public String offer() {
        return modelName + " - " + price;
    }
}
