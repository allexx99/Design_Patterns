package concreteProducts;

import abstractProducts.Sofa;

public class ArtDecoSofa implements Sofa {
    @Override
    public void hasLegs() {
        System.out.println("ArtDeco sofa has 4 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("You can sit on the ArtDeco sofa");
    }
}
