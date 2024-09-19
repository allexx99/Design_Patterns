## Factory Method
This pattern provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

- For example, you want to implement a logistic management application and the first version of the app can only handle transportation by trucks, so the bulk of the code lives inside the Truck class.
- After a while, when the app becomes very popular, you receive multiple requests from sea transportation companies to incorporate sea logistics into the app.
- The problem is that the code is coupled to the Truck class and adding Ships into the application would require making changes to the entire codebase.
- Moreover, if later you deide to add another type of transportation to the app, you will probably need to make all of these changes again.

Solution:
- The Factory Method sugests that you replace direct objects construction calls (using the new operator) with calls to a special "factory method".
- The objects are still created using the "new" operator, but it's being called from within the factory method.
