import abstractProducts.Transport;
import factories.BoatLogistics;
import factories.Logistics;
import factories.RoadLogistics;

public class Main {
    public static void main(String[] args) {
        Logistics roadLogistics = new RoadLogistics();
        Transport truck = roadLogistics.createTransport();
        truck.deliver();

        Logistics boatLogistics = new BoatLogistics();
        Transport boat = boatLogistics.createTransport();
        boat.deliver();
    }
}