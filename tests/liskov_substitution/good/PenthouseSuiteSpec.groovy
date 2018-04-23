package liskov_substitution.good

import spock.lang.Specification

class PenthouseSuiteSpec extends Specification {
    def "should be initialized with four bedrooms"() {
        given:
        def penthouse = new PenthouseSuite()

        expect:
        penthouse.numberOfBedrooms == 4
    }

    def "should set square footage"() {
        given:
        def penthouse = new PenthouseSuite()

        when:
        penthouse.setSquareFootage(1600)

        then:
        penthouse.squareFootage == 1600
    }
}
