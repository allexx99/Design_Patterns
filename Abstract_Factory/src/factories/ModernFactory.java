package factories;

import abstractProducts.Chair;
import abstractProducts.CoffeeTable;
import abstractProducts.Sofa;
import concreteProducts.ModernChair;
import concreteProducts.ModernCoffeeTable;
import concreteProducts.ModernSofa;

public class ModernFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
