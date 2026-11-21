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

class ElectricFan extends Appliance {

    ElectricFan(String brand) {
        super(brand);
    }

    @Override
    void operate() {
        System.out.println("The electric fan is rotating.");
    }
}

class AirConditioner extends Appliance {

    AirConditioner(String brand) {
        super(brand);
    }

    @Override
    void operate() {
        System.out.println("The air conditioner is cooling the room.");
    }
}


public class AbstractionDemo {

    public static void main(String[] args) {

    }
}