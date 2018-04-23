package liskov_substitution.good

import spock.lang.Specification

class StudioSpec extends Specification {
    def "should be initialized with four bedrooms"() {
        given:
        def studio = new Studio()

        expect:
        studio.numberOfRooms == 0
    }

    def "should set square footage"() {
        given:
        def studio = new Studio()

        when:
        studio.setSquareFootage(550)

        then:
        studio.squareFootage == 550
    }
}
