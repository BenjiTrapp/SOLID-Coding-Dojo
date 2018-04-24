# Solution:
Instead, make interfaces more abstract. It helps adhere to both the SRP (the interface is only responsible for one 
particular behavior) and this Interface Segregation Principle because specific objects (like eagles and penguins) only 
implement the functionality they need.