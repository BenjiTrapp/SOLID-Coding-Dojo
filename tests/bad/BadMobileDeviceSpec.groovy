package bad

import spock.lang.Specification

class BadMobileDeviceSpec extends Specification {

    def "should return the passed value to a iphone correctly prefixed"(String value, String expected){
        given: "a mobile device"
        def iPhone = new BadMobileDevice()

        when: "a value is passed to generate a weather alert"
        def result = iPhone.generateWeatherAlert(value)

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