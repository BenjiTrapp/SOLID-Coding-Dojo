import single_responsibility.bad.Board
import spock.lang.Specification
import static org.hamcrest.Matchers.contains
import static org.hamcrest.Matchers.hasSize
import static spock.util.matcher.HamcrestSupport.that

class BoardSpec extends Specification {
    private def board = new Board()

    def "The board should have nine spots"(){
        expect:
        that board.getSpots() , hasSize(9)
    }

    def "The first row should be build as assumed"(){
        expect:
        that this.board.firstRow(), contains("0", "1", "2")

        where:
        secondRow << ["0", "1", "2"]
    }

    def "The second row should be build as assumed"(){
        expect:
        that this.board.secondRow(), contains("3", "4", "5")

        where:
        secondRow << ["3", "4", "5"]
    }

    def "The third row should be build as assumed"(){
        expect:
        that this.board.thirdRow(), contains("6", "7", "8")

        where:
        secondRow << ["6", "7", "8"]
    }

    def " The board should be displayed correctly"(){
        given:
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent))

        when:
        this.board.display()

        then:
        outContent.toString() == "0 | 1 | 2\n3 | 4 | 5\n6 | 7 | 8"
    }
}