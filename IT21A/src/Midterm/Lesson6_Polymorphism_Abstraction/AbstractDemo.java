abstract class Appliance {

    private String brand;

    Appliance(String brand) {
        this.brand = brand;
    }

    abstract void operate();

    void showBrand() {
        System.out.println("Appliance Brand: " + brand);
    }
}


public class AbstractionDemo {

    public static void main(String[] args) {

    }
}