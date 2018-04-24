package interface_segregation.good

import spock.lang.Specification

class PenguinSpec extends Specification {
    def "should be able to swim"() {
        given:
        def penguin = new Penguin(5)

        when:
        penguin.swim()

        then:
        penguin.currentLocation == "in the water"
    }


    def "should loses feathers"() {
        given:
        def penguin = new Penguin(5)

        when:
        penguin.molt()

        then:
        penguin.numberOfFeathers == 4
    }
}