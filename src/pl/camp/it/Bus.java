package pl.camp.it;

public class Bus extends Vehicle {
    private boolean lowRider;

    public Bus(String brand, String model, boolean lowRider) {
        super(brand, model);
        this.lowRider = lowRider;
    }

    public boolean isLowRider() {
        return lowRider;
    }

    public void setLowRider(boolean lowRider) {
        this.lowRider = lowRider;
    }
}
