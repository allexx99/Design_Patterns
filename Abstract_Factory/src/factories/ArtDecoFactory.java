package factories;

import abstractProducts.Chair;
import abstractProducts.CoffeeTable;
import abstractProducts.Sofa;
import concreteProducts.ArtDecoChair;
import concreteProducts.ArtDecoCoffeeTable;
import concreteProducts.ArtDecoSofa;

public class ArtDecoFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
}
