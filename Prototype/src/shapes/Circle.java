// Concrete prototype. The cloning method creates a new object
// by calling the constructor of the current class and
// passing the current object as the constructor's argument.
// Performing all the actual copying in the constructor helps to
// keep the result consistent: the constructor will not return a
// result until the new object is fully built; thus, no object
// can have a reference to a partially-built clone.
package shapes;

public class Circle extends Shape{

    public int radius;

    public Circle(){}

    public Circle(Circle target) {
        // A parent constructor call is needed to copy private
        // fields defined in the parent class.
        super(target);
        if(target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if(!(object2 instanceof Circle) || !super.equals(object2)) return false;
        Circle shape2 = (Circle) object2;
        return shape2.radius == radius;
    }
}
