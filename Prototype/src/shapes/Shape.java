// Base prototype
package shapes;

import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape(){}

    // The prototype constructor. A fresh object is initialized
    // with values from the existing object.
    public Shape(Shape target) {
        if(target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    // The clone operation returns one of the Shape subclasses.
    public abstract Shape clone();

    @Override
    public boolean equals(Object object2) {
        if(!(object2 instanceof Shape)) return false;
        Shape shape2 = (Shape) object2;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}
