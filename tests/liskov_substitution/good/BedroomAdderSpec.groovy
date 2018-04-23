package liskov_substitution.good

import spock.lang.Specification

class BedroomAdderSpec extends Specification {

    def "should add Bedroom to Penthouse"() {
        given:
        def penthouse = new PenthouseSuite()
        BedroomAdder adder = new BedroomAdder()

        when:
        adder.addBedroom(penthouse)

        then:
        penthouse.numberOfBedrooms == 5
    }
}
