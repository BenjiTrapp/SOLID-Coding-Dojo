package liskov_substitution.bad

import spock.lang.Specification

class PenthouseSuiteSpec extends Specification {
    def "should be intialized with four Bedrooms"() {
        expect:
        new PenthouseSuite().numberOfBedrooms == 4
    }

    def "should sets squareFootage"() {
        given:
        def penthouse = new PenthouseSuite()

        when:
        penthouse.setSquareFootage(1500)

        then:
        penthouse.squareFootage == 1500
    }

    def "should be instance of Apartment"(){
        expect:
        new PenthouseSuite() instanceof  Apartment
    }
}
