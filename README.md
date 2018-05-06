![](https://team-coder.com/wp-content/uploads/SOLID.png)

This repository contains examples of the five SOLID design principles of object-oriented programming. The examples are 
written in Java/Groovy. Each example has a "good" and a "bad" example to demonstrate adherence to and violation of the 
principle, respectively. To not spoiler yourself please start with the bad example and improve it on your own. 
At the end you still can compare your solution with the good example :-) 

### What is SOLID? 
* **S**ingle responsibility principle: A class should have only a single responsibility (i.e. changes to only one part 
                                       of the software's specification should be able to affect the specification of 
                                       the class)
* **O**pen/closed principle:``software entities … should be open for extension, but closed for modification.``
* **L**iskov substitution principle: ``objects in a program should be replaceable with instances of their subtypes 
                                       without altering the correctness of that program.`` 
                                       ==> Also known as design by contract.
* **I**nterface segregation principle: ``many client-specific interfaces are better than one general-purpose interface.``
* **D**ependency inversion principle:

### How can I start learning SOLID?

1. Clone this repository and check out the master branch
1. Run ``./gradlew startLesson`` or click on the Task when you use an IDE like Intellij
1. Read the .md-file in the directory src/ carefully and start implementing.
1. Curious about a "good" solution? Run the task ``./gradlew getSolution`` 

### Best practice

Each lesson and example comes with at least one Spock-test. Feel free to implement your own tests in what ever language or framework you feel well with. To have a better experience and learning effect, try to implement your solution by using (A)TDD and stick to `implement the test first`. 


![](http://lesseverything.com/images/blog/easybaby.jpg)
