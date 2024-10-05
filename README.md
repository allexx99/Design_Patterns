## Strategy

<h6>
  Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable. <br/>
  <br/> Problem
  <ul>
    <li>One day you decided to create a navigation app for casual travelers.</li>
    <li>The first version of the app could only build the routes over roads.</li>
    <li>With the next update, you added an option to build walking routes.</li>
    <li>Right after that, you added another option to let people use public transport in their routes.</li>
    <li>Later you planned to add route building for cyclists. And even later, another option for building routes through all of a city’s tourist attractions.</li>
    <li>The problem with this is that each time you added a new routing algorithm, the main class of the navigator doubled in size.</li>
    <li>Any change to one of the algorithms, whether it was a simple bug fix or a slight adjustment of the street score, affected the whole class, increasing the chance of creating an error in already-working code.</li>
  </ul>

  Solution
  <ul>
    <li>The Strategy pattern suggests that you take a class that does something specific in a lot of different ways and extract all of these algorithms into separate classes called strategies.</li>
    <li>The original class, called context, must have a field for storing a reference to one of the strategies. The context delegates the work to a linked strategy object instead of executing it on its own.</li>
    <li>The context isn’t responsible for selecting an appropriate algorithm for the job. Instead, the client passes the desired strategy to the context.</li>
    <li>This way the context becomes independent of concrete strategies, so you can add new algorithms or modify existing ones without changing the code of the context or other strategies.</li>
  </ul>

  &emsp; In this example, the Strategy pattern is used to implement the various payment methods in an e-commerce application. After selecting a product to purchase, a customer picks a payment method: either Paypal or credit card. <br/>
  &emsp; Concrete strategies not only perform the actual payment but also alter the behavior of the checkout form, providing appropriate fields to record payment details.

  <img src="https://github.com/user-attachments/assets/c8b2eac8-7853-45b5-9b1d-89d260e969db" width="700">
</h6>
