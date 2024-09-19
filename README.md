## Factory Method
<h6>
  This pattern provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
  
  - For example, you want to implement a logistic management application and the first version of the app can only handle transportation by trucks, so the bulk of the code lives inside the Truck class.
  - After a while, when the app becomes very popular, you receive multiple requests from sea transportation companies to incorporate sea logistics into the app.
  - The problem is that the code is coupled to the Truck class and adding Ships into the application would require making changes to the entire codebase.
  - Moreover, if later you deide to add another type of transportation to the app, you will probably need to make all of these changes again.
  
  Solution:
  - The Factory Method sugests that you replace direct objects construction calls (using the new operator) with calls to a special "factory method".
  - The objects are still created using the "new" operator, but it's being called from within the factory method.
</h6>

<img src="https://github.com/user-attachments/assets/a4e5821f-8b84-4175-99fb-54d65043d1f7" width="500">
<h6>
  <ol> 
    <li> The "Product" declares the interface, which is common to all objects that can be produced by the creator and its subclasses. </li>
    <li> Concrete Products are different implementations of the product interface. </li>
    <li> The creator class declares the factory method that return new product objects. It's important that the return type of this method matches the product interface. You can declare the factory method as "abstract" to force all subclasses to implement their own versions of the method. Note, despite its name, product creation is not the primary responsibility of the creator. Usually, the creator class already has some core business logic related to products. The factory method helps to decouple this logic from the concrete product classes. Here is an analogy: a large software development company can have a training department for programmers. However, the primary function of the company as a whole is still writing code, not producing programmers. </li>
    <li> Concrete Creators override the base factory method so it return a different type of product. Note that the factory method doesn’t have to create new instances all the time. It can also return existing objects from a cache, an object pool, or another source. </li>
  </ol>
</h6>
