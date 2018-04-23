package single_responsibility.good

import spock.lang.Specification

class BoardShaperSpec extends Specification{
    def "should return the correct row indices"() {
        given:
        def shaper = new BoardShaper(2)
        def rowIndexes = []
        def rowOne = [0,1]
        def rowTwo = [2,3]

        when:
        rowIndexes << rowOne << rowTwo

        then:
        rowIndexes == shaper.rowIndices()
    }
}
