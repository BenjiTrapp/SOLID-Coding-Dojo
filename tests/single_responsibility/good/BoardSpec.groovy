package single_responsibility.good

import spock.lang.Specification
import spock.lang.Unroll

class BoardSpec extends Specification {

    def "testBoardHasASize"() {
        given:
        def board = new Board(size)

        expect:
        board.size == size

        where:
        size || _
        1    || _
        3    || _
        7    || _
    }

    @Unroll
    def "The Board spot count should be the square of the size"() {
        given:
        def board = new Board(size)

        expect:
        board.spots.size() == expectation

        where:
        size || expectation
        1    || 1
        2    || 4
        3    || 9
        4    || 16
        5    || 25
        6    || 36
    }

    def "size below zero should trigger an AssertionError"() {
        when:
        new Board(-1)

        then:
        thrown(AssertionError)
    }

    def "Board returns the values at list of Spots"() {
        given:
        def values = ['0','4','7']
        def indices = [0,4,7]

        expect:
        values == new Board(3).valuesAt(indices)
    }

    def "null for valueAt should trigger an NPE"() {
        when:
        new Board(3).valuesAt(null)

        then:
        thrown(NullPointerException)
    }
}

