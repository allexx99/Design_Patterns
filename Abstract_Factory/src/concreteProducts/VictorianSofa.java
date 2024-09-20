package concreteProducts;

import abstractProducts.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void hasLegs() {
        System.out.println("Victorian sofa (legs)");
    }

    @Override
    public void sitOn() {
        System.out.println("Victorian sofa (sit)");
    }
}
