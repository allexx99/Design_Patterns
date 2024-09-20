package concreteProducts;

import abstractProducts.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void hasLegs() {
        System.out.println("Modern coffee table (legs)");
    }

    @Override
    public void sitOn() {
        System.out.println("Modern coffee table (sit)");
    }
}
