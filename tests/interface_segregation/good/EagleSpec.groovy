package interface_segregation.good

import spock.lang.Specification

class EagleSpec extends Specification {
    def "should fly in the air"() {
        given:
        def eagle = new Eagle(5)

        when:
        eagle.fly()

        then:
        eagle.currentLocation == "in the air"
    }

    def "should loses feathers"() {
        given:
        def eagle = new Eagle(5)

        when:
        eagle.molt()

        then:
        eagle.numberOfFeathers == 4
    }
}
