package factories;

import abstractProducts.Chair;
import abstractProducts.CoffeeTable;
import abstractProducts.Sofa;
import concreteProducts.VictorianChair;
import concreteProducts.VictorianCoffeeTable;
import concreteProducts.VictorianSofa;

public class VictorianFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
