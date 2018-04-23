package open_closed.bad

import spock.lang.Specification

class BadGreeterSpec extends Specification {

    def "the greeter should answer in an adequate way"(String formality, String expectation){
        given:
        def greeter = new BadGreeter()
        greeter.setFormality(formality)

        when:
        def result = greeter.greet()

        then:
        result == expectation

        where:
        formality  || expectation
        "formal"   || "Good evening, sir."
        "casual"   || "Sup bro?"
        "intimate" || "Hello Darling!"
        "d3f@ult"  || "Hello."
    }
}
