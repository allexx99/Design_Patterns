package concreteProducts;

import abstractProducts.Chair;

public class VictorianChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("Victorian chair (legs)");
    }

    @Override
    public void sitOn() {
        System.out.println("Victorian chair (sit)");
    }
}
