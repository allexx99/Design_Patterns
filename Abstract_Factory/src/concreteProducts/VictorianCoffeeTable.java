package concreteProducts;

import abstractProducts.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void hasLegs() {
        System.out.println("Victorian coffee table (legs)");
    }

    @Override
    public void sitOn() {
        System.out.println("Victorian coffee table (sit)");
    }
}
