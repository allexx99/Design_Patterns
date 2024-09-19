// concrete object "boat"
public class Boat implements Transport{

    @Override
    public void deliver() {
        System.out.println("Delivery by boat");
    }
}
