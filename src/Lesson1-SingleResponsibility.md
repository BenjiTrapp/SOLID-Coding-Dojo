# Single Responsibility Principle

``Every class should have a single responsibility. There should never be more than one reason for a class to change.``

Lesson 1: Tic Tac Toe Board

The present version tries to provides a generic Board class that does all the required board-related stuff:
- it stores the values of spots on the board,
- returns the board's rows
- prints the board 

This bad approach often occur in multiple MVC related programs. On the  GUI everything seems legitimately related to a 
real-world object, but the Single Responsibility Principle tells us that this class is actually handling far
too many responsibilities.

### Your ToDos:

1. Sharpen the responsibilities of the board
1. Think about the way the spots are manipulated via the rules of Tic Tac Toe 
1. Are all the attributes necessary? Which is the most atomar and crucial attribute?

### Bonus: 
You think Java is boring and old-fashioned? Try to solve it in scala, groovy or clojure instead :-)