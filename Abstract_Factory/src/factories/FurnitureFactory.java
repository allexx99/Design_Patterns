package factories;

import abstractProducts.Chair;
import abstractProducts.CoffeeTable;
import abstractProducts.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    CoffeeTable createCoffeeTable();
    Sofa createSofa();
}
