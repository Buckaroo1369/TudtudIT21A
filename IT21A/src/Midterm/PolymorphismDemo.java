class DeliveryVehicle {
    public void deliver() {
        System.out.println("The vehicle is delivering a package");
    }
}

class Motorcycle extends DeliveryVehicle {
    @override
    public class deliver() {
        System.out.println("Motorcycle delivers a small package through narrow streets.");
    }
}

class DeliveryVan extends DeliveryVehicle {
    @Override
    public class deliver() {
        System.out.println("Delivery van carries multiple packages to their destinations");
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {

        DeliveryVehicle vehicle1 = new Motorcycle();
        DeliveryVehicle vehicle2 = new DeliveryVan();

        vehicle1.deliver();
        vehicle2.deliver();

    }
}