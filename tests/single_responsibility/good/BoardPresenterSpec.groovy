package single_responsibility.good

import spock.lang.Specification

class BoardPresenterSpec extends Specification {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream()

    def "should present the board correctly when it's displayed into console"() {
        given:
        def presenter = new BoardPresenter(new Board(3))
        System.setOut(new PrintStream(outContent))

        when:
        presenter.displayBoard()

        then:
        outContent.toString() == "0|1|2\n3|4|5\n6|7|8\n"
    }
}
