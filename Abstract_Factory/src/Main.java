import abstractProducts.Chair;
import abstractProducts.CoffeeTable;
import abstractProducts.Sofa;
import factories.ArtDecoFactory;
import factories.FurnitureFactory;
import factories.ModernFactory;
import factories.VictorianFactory;

public class Main {
    public static void main(String[] args) {
        // ---------------- Art Deco ---------------- //
        FurnitureFactory artDecoFactory = new ArtDecoFactory();
        Chair artDecoChair = artDecoFactory.createChair();
        artDecoChair.hasLegs();
        artDecoChair.sitOn();

        CoffeeTable artDecoCoffeeTable = artDecoFactory.createCoffeeTable();
        artDecoCoffeeTable.hasLegs();
        artDecoCoffeeTable.sitOn();

        Sofa artDecoSofa = artDecoFactory.createSofa();
        artDecoSofa.hasLegs();
        artDecoSofa.sitOn();

        // ---------------- Modern ---------------- //
        System.out.println();
        FurnitureFactory modernFactory = new ModernFactory();
        Chair modernChair = modernFactory.createChair();
        modernChair.hasLegs();
        modernChair.sitOn();

        CoffeeTable modernCoffeeTable = modernFactory.createCoffeeTable();
        modernCoffeeTable.hasLegs();
        modernCoffeeTable.sitOn();

        Sofa modernSofa = modernFactory.createSofa();
        modernSofa.hasLegs();
        modernSofa.sitOn();

        // ---------------- Victorian ---------------- //
        System.out.println();
        FurnitureFactory victorianFactory = new VictorianFactory();
        Chair victorianChair = victorianFactory.createChair();
        victorianChair.hasLegs();
        victorianChair.sitOn();

        CoffeeTable victorianCoffeeTable = victorianFactory.createCoffeeTable();
        victorianCoffeeTable.hasLegs();
        victorianCoffeeTable.sitOn();

        Sofa victorianSofa = victorianFactory.createSofa();
        victorianSofa.hasLegs();
        victorianSofa.sitOn();
    }
}