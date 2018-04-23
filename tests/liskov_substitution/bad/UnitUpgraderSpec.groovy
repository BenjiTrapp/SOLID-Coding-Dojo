package liskov_substitution.bad

import spock.lang.Specification

class UnitUpgraderSpec extends Specification {
    def "Upgrader should increase square footage of Penthouse"() {
        given:
        def penthouse = new PenthouseSuite()
        penthouse.setSquareFootage(1500)

        when:
        new UnitUpgrader().upgrade(penthouse)

        then:
        penthouse.squareFootage == 1540
    }

    def "Upgrader should add Bedroom to Apartment"() {
        given:
        def penthouse = new PenthouseSuite()

        when:
        new UnitUpgrader().upgrade(penthouse)

        then:
        penthouse.numberOfBedrooms == 5
    }

    def "Upgrader should increases square footage of Studio"() {
        given:
        def studio = new Studio()
        studio.setSquareFootage(550)

        when:
        new UnitUpgrader().upgrade(studio)

        then:
       studio.squareFootage == 590
    }

    def "Upgrader doesn't add Bedroom to Studios"() {
        given:
        def studio = new Studio()

        when:
        new UnitUpgrader().upgrade(studio)

        then:
        studio.numberOfBedrooms == 0
    }
}
