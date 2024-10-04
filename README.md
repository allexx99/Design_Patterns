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

<h6>Complete diagram</h6>

<img src="https://github.com/user-attachments/assets/f50a7c1f-1ff0-4038-9311-93bda0a41ae3" width="650">

## Singleton

<h6>
  Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.
  <ul>
    <li>Make the default constructor private, to prevent other objects from using the new operator with the Singleton class</li>
    <Li>Create a static creation method that acts as a constructor. Under the hood, this method calls the private constructor to create an object and saves it in a static field. All following calls to this method return the cached object.</Li>
    <li>If your code has access to the Singleton class, then it’s able to call the Singleton’s static method. So whenever that method is called, the same object is always returned</li>
  </ul>
  Applicability
  <ul>
    <li>Use the Singleton pattern when a class in your program should have just a single instance available to all clients; for example, a single database object shared by different parts of the program.</li>
    <li>The Singleton pattern disables all other means of creating objects of a class except for the special creation method. This method either creates a new object or returns an existing one if it has already been created.</li>
    <li>Note that you can always adjust this limitation and allow creating any number of Singleton instances. The only piece of code that needs changing is the body of the getInstance method.</li>
  </ul>
  Real world analogy<br/>
  &emsp; The government is an excellent example of the Singleton pattern. A country can have only one official government. Regardless of the personal identities of the individuals who form governments, the title, “The Government of X”, is a global point of access that identifies the group of people in charge.
</h6>

<img src="https://github.com/user-attachments/assets/bde73015-9d76-4b14-89a8-0383bf294236" width="450">

<h6>
  <ul>
    <li>The Singleton class declares the static method 'getInstance' that returns the same instance of its own class</li>
    <li>The Singleton's constructor should be hidden from the client code</li>
    <li>Calling the 'getInstance' method should be the only way of getting the Singleton object</li>
  </ul>
</h6>

## Builder

<h6>
 &emsp; The builder pattern separates the construction of a complex object from its representation, allowing for the same construction process to create different representations. It’s particularly useful when constructing objects with many optional or    varying parts.
  
  <br/>For example
  <ul>
    <li>An online pizza ordering system allows customers to create custom pizzas with various combinations of crust, sauce, cheese, and toppings</li>
    <li>The Builder pattern can be employed to construct pizza objects with different compositions, while keeping the construction process consistent</li>
  </ul>

  Implementation typically involves
  <ul>
    <li>Defining a builder interface or abstract class with methods for constructing the object’s parts</li>
    <li>Implementing concrete builder classes for each object representation</li>
    <li>Creating a director class that takes a builder object and constructs the object using the builder’s methods</li>
    <li>Clients use the director with a specific builder to create the desired object representation</li>
  </ul>

  Complete Diagram
</h6>

  <img src="https://github.com/user-attachments/assets/7d6927d7-7f8d-4342-935d-9cee50103beb" width="700">

<h6>
  <ul>
    <li>A car is a complex object that can be constructed in a hundred different ways. Instead of bloating the Car class with a huge constructor, we extracted the car assembly code into a separate car builder class. This class has a set of methods for configuring various parts of a car.</li>
    <li>If the client code needs to assemble a special, fine-tuned model of a car, it can work with the builder directly. On the other hand, the client can delegate the assembly to the director class, which knows how to use a builder to construct several of the most popular models of cars.</li>
    <li>The manual describes every feature of the car, so the details in the manuals vary across the different models. That’s why it makes sense to reuse an existing construction process for both real cars and their respective manuals</li>
    <li>Of course, building a manual isn’t the same as building a car, and that’s why we must provide another builder class that specializes in composing manuals</li>
    <li>This class implements the same building methods as its car-building sibling, but instead of crafting car parts, it describes them</li>
    <li>By passing these builders to the same director object, we can construct either a car or a manual</li>
    <li>The final part is fetching the resulting object. A metal car and a paper manual, although related, are still very different things</li>
    <li>We obtain the result of the construction from the builder which performed the job</li>
  </ul>
</h6>

## Prototype
<h6>
  Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.<br/>
  <br/> 
  Problem
  <ul>
    <li>Say you have an object, and you want to create an exact copy of it. How would you do it?</li>
    <li>First, you have to create a new object of the same class.</li>
    <li>Then you have to go through all the fields of the original object and copy their values over to the new object.</li>
    <li>Nice! But there’s a catch. Not all objects can be copied that way because some of the object’s fields may be private and not visible from outside of the object itself.</li>
    <li>There’s one more problem with the direct approach. Since you have to know the object’s class to create a duplicate, your code becomes dependent on that class</li>
    <li>there’s another catch. Sometimes you only know the interface that the object follows, but not its concrete class, when, for example, a parameter in a method accepts any objects that follow some interface.</li>
  </ul>
  Solution
  <ul>
    <li>The Prototype pattern delegates the cloning process to the actual objects that are being cloned.</li>
    <li>The pattern declares a common interface(abstract class) for all objects that support cloning.</li>
    <li>This interface(abstract class) lets you clone an object without coupling your code to the class of that object.</li>
    <li>Usually, such a class contains just a single clone method.</li>
    <li>Here’s how it works: you create a set of objects, configured in various ways. When you need an object like the one you’ve configured, you just clone a prototype instead of constructing a new object from scratch.</li>
  </ul>
</h6>

<h6>
  In this example, the Prototype pattern lets you produce exact copies of geometric objects, without coupling the code to their classes.
</h6>
<img src="https://github.com/user-attachments/assets/bda349a6-d372-46e1-9053-257b660beb0a" width="700">

<h6>
  How to implement
  <ol>
    <li>Create the prototype abstract class and declare the clone method in it. Or just add the method to all classes of an existing class hierarchy, if you have one.</li>
    <li>A prototype class must define the alternative constructor that accepts an object of that class as an argument. The constructor must copy the values of all fields defined in the class from the passed object into the newly created instance. If you’re changing a subclass, you must call the parent constructor to let the superclass handle the cloning of its private fields.</li>
    <li>The cloning method usually consists of just one line: running a new operator with the prototypical version of the constructor.</li>
    <li>Optionally, create a centralized prototype registry to store a catalog of frequently used prototypes.</li>
    <li>You can implement the registry as a new factory class or put it in the base prototype class with a static method for fetching the prototype. This method should search for a prototype based on search criteria that the client code passes to the method. </li>
  </ol>
</h6>

