package bad

import spock.lang.Specification
import spock.lang.Title
import spock.lang.Unroll

@Title("Tests for the BadWeatherTracker to verify if all expectations are met")
class BadWeatherTrackerSpec extends Specification {
    private final def outContent = new ByteArrayOutputStream()

    @Unroll
    def "The current condition should be set as assumed"(String condition, String expected) {
        given: "a weather tracker"
        def tracker = new BadWeatherTracker()

        and: "the printed output of the PrintStream"
        System.setOut(new PrintStream(outContent))

        when: "a weather condition is set to the tracker"
        tracker.setCurrentConditions(condition)

        then: "the output should be equals to the expectation"
        outContent.toString() == expected
        print(outContent.toString())

        where:
        condition   || expected
        "rainy"     || "It is rainy"
        "sunny"     || "It is sunny"
        "kartoffel" || ""
    }

    @Unroll
    def "A set weather condition should be able to get returned"(String condition, String expected) {
        given: "a weather tracker"
        def tracker = new BadWeatherTracker()

        and: "a weather condition"
        tracker.setCurrentConditions(condition)

        when: "the weather condition is returned from the tracker"
        def result = tracker.getCurrentCondition()

        then: "the result should be equal to the expectation"
        result == expected

        where:
        condition   || expected
        "rainy"     || "rainy"
        "sunny"     || "sunny"
    }
}