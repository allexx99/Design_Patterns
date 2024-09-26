import builders.CarBuilder;
import builders.CarManualBuilder;
import cars.Car;
import cars.Manual;
import director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();

        director.constructSportsCar(builder);

        Car car = builder.getResult();

        System.out.println("Car built:\n" + car.getCarType());

        // car manual builder
        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);

        Manual carManual = manualBuilder.getResult();

        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}