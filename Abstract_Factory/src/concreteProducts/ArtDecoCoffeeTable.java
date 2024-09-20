package concreteProducts;

import abstractProducts.CoffeeTable;

public class ArtDecoCoffeeTable implements CoffeeTable {

    @Override
    public void hasLegs() {
        System.out.println("ArtDeco coffee table has 4 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("You cannot sit on the ArtDeco coffee table");
    }
}
