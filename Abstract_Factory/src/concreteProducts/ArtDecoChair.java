package concreteProducts;

import abstractProducts.Chair;

public class ArtDecoChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("ArtDeco chair has 4 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Sit on ArtDeco chair");
    }
}
