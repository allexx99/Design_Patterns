package concreteProducts;

import abstractProducts.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void hasLegs() {
        System.out.println("Modern sofa (legs)");
    }

    @Override
    public void sitOn() {
        System.out.println("Modern sofa (sit)");
    }
}
