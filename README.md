## Factory Method
<h6>
  This pattern provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
  
  - For example, you want to implement a logistic management application and the first version of the app can only handle transportation by trucks, so the bulk of the code lives inside the Truck class.
  - After a while, when the app becomes very popular, you receive multiple requests from sea transportation companies to incorporate sea logistics into the app.
  - The problem is that the code is coupled to the Truck class and adding Ships into the application would require making changes to the entire codebase.
  - Moreover, if later you decide to add another type of transportation to the app, you will probably need to make all of these changes again.
  
  Solution:
  - The Factory Method suggests that you replace direct objects construction calls (using the new operator) with calls to a special "factory method".
  - The objects are still created using the "new" operator, but it's being called from within the factory method.
</h6>

<img src="https://github.com/user-attachments/assets/67a0eec6-1923-4f8b-bb58-54e39354845e" width="650">

<h6>
  <ol> 
    <li> The "Transport" declares the interface, which is common to all objects that can be produced by the creator and its subclasses. </li>
    <li> Concrete Transports (truck and boat), are different implementations of the Transport interface. </li>
    <li> The creator class (Logistics) declares the factory method (createTransport()) that return new Transport objects. It's important that the return type of this method matches the Transport interface. You can declare the factory method as "abstract" to force all subclasses to implement their own versions of the method. Note, despite its name, Transport creation is not the primary responsibility of the creator (Logistics). Usually, the creator class already has some core business logic related to Transport. The factory method helps to decouple this logic from the concrete Transport classes. Another example could be: a large software development company can have a training department for programmers. However, the primary function of the company as a whole is still writing code, not producing programmers. </li>
    <li> Concrete Creators (RoadLogistics and BoatLogistics) override the base factory method so it return a different type of Transport. Note that the factory method doesn’t have to create new instances all the time. It can also return existing objects from a cache, an object pool, or another source. </li>
  </ol>
</h6>

## Abstract Factory

<h6>
  Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.

  - Imagine that you’re creating a furniture shop simulator. Your code consists of classes that represent: a family o related products like Chair, Sofa and CoffeeTable and several variants of this family. For example, products Chair, Sofa and CoffeeTable are available in these variants: Modern, Victorian and ArtDeco
  - You need a way to create individual furniture objects so that they match other objects of the same family.
  - Also, you don’t want to change existing code when adding new products or families of products to the program. Furniture vendors update their catalogs very often, and you wouldn’t want to change the core code each time it happens.

Solution:
- The first thing the Abstract Factory pattern suggests is to explicitly declare interfaces for each distinct product of the product family (e.g., chair, sofa or coffee table).
- Then you can make all variants of products follow those interfaces. For example, all chair variants can implement the Chair interface; all coffee table variants can implement the CoffeeTable interface, and so on.
</h6>

<img src="https://github.com/user-attachments/assets/da4e6ed8-7e6b-47f2-af16-a358993f1e93" width="450">

<h6>
  <ul>
    <li>The next move is to declare the Abstract Factory—an interface with a list of creation methods for all products that are part of the product family (for example, createChair, createSofa and createCoffeeTable), and for each variant of a product family, we create a separate factory class based on the AbstractFactory interface. A factory is a class that returns products of a particular kind.</li>
  </ul>
</h6>

<img src="https://github.com/user-attachments/assets/3b113e2d-3b59-4548-8bc5-b316eeb8196a" width="450">

<h6>
  <ul>
    <li>Complete Diagram</li>
  </ul>
</h6>

<img src="https://github.com/user-attachments/assets/c029e96c-a6d0-40d8-9921-37a78a24e594" width="650">

