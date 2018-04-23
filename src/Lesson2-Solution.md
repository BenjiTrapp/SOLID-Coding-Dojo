# Solution:
Instead, as demonstrated in the good example, we have a high-level Greeter class that is instantiated 
with some Personality. We don't know which yet, just that it will be some object that implements the Personality
interface. Now we can add new objects ike FormalPersonality, CasualPersonality, and IntimatePersonality, and just make 
sure they correctly implement the Personality interface (in this case that means they must have a `greet()` method). 

==> The Greeter class is now open for future extension, while remaining closed for modification.
