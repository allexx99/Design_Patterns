package concreteProducts;

import abstractProducts.Chair;

public class ModernChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("Modern chair (legs)");
    }

    @Override
    public void sitOn() {
        System.out.println("Modern chair (sit)");
    }
}
