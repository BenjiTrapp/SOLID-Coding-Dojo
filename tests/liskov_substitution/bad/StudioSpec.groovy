package liskov_substitution.bad

import spock.lang.Specification

class StudioSpec extends Specification {
    def "should be initialized with zero Bedrooms"() {
        expect:
        new Studio().numberOfBedrooms == 0
    }

    def "should set SquareFootage"() {
        given:
        def studio = new Studio()

        when:
        studio.setSquareFootage(600)

        then:
        studio.squareFootage == 600
    }

    def "should be instance of Apartment"(){
        expect:
        new Studio() instanceof  Apartment
    }
}
