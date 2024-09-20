package factories;

import concreteProducts.Boat;
import abstractProducts.Transport;

// "factories.BoatLogistics" = concrete creator of the concrete object "boat"
public class BoatLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Boat();
    }
}
