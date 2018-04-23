package open_closed.good

import open_closed.good.personalities.*
import spock.lang.Specification
import spock.lang.Unroll

class GreeterSpec extends Specification {

    @Unroll
    def "The greeter should greet based on it's Personality"(){
        given:
        Greeter greeter = new Greeter(greetingType)

        when:
        def result = greeter.greet()

        then:
        result == expectation

        where:
        greetingType              || expectation
        new CasualPersonality()   || "Sup bro?"
        new FormalPersonality()   || "Good evening, sir."
        new IntimatePersonality() || "Hello Darling!"
        new DefaultPersonality()  || "Hello."
        null                      || "Hello."
    }

    def "The personality of the greeter should be changeable"(){
        given:
        def greeter = new Greeter(new CasualPersonality())
        greeter.greet() == "Sup bro?"

        when:
        greeter.changePersonality(new IntimatePersonality())
        def result = greeter.greet()

        then:
        result == "Hello Darling!"
    }
}
