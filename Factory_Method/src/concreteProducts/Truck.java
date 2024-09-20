package concreteProducts;

import abstractProducts.Transport;

// concrete object "truck"
public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivery by truck");
    }
}
