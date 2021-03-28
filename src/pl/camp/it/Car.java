package pl.camp.it;

public class Car extends Vehicle {
    private String color;

    public Car(String color, String brand, String model) {
        super(brand, model);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
