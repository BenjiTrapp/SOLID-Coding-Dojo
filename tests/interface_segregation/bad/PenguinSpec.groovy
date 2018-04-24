package interface_segregation.bad

import spock.lang.Specification

class PenguinSpec extends Specification {
    def "should fly in the air"() {
        given:
        def penguin = new Penguin(5)

        when:
        penguin.fly()

        then:
        thrown(UnsupportedOperationException)
    }

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