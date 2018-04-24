package bad
import spock.lang.Specification

class BadMessengerClientSpec extends Specification {
    def "should return the passed value to a messenger client correctly prefixed"(String value, String expected){
        given: "a messenger client"
        def whatsApp = new BadMessengerClient()

        when: "a value is passed to generate a weather alert"
        def result = whatsApp.generateWeatherAlert(value)

        then: "then the result should be equal to the expectation"
        result == expected

        where:
        value     || expected
        "sunny"   || "It is sunny"
        "cloudy"  || "It is cloudy"
        "raining" || "It is raining"
        null      || "It is " + null
    }
}