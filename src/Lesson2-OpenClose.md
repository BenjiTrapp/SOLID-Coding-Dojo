# Open/Closed Principle

**Software entitites should be open for extension, but closed for modification**

I find the Strategy Pattern a great demonstration of the open/closed principle. Notice how in the bad example, any time 
we want to add a new style of greeting, we have to change the Greeter class to accept a new type of personality.
We don't want to have to modify our existing, working code to add something new.
 
 ### Your ToDos:
 
 1. Get rid of the poor class design. Is that switch really needed? 
 1. Think about a suitable way to integrate new personalities without modifying the code too much.
 
 
 ### Bonus: 
 You think Java is boring and old-fashioned? Try to solve it in scala, groovy or clojure instead :-)