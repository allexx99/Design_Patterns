// "RoadLogistics" = concrete creator of the concrete object "truck"
public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}



