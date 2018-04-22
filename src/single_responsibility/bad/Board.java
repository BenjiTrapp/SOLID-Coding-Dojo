package single_responsibility.bad;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Board {
    private List<String> spots;

    public Board() {
        spots = IntStream.range(0,9).boxed().collect(Collectors.toList())
                         .stream().map(Object::toString).collect(Collectors.toList());
    }

    public List<String> getSpots(){
        return this.spots;
    }

    public List<String> firstRow() {
        List<String> firstRow = new ArrayList<>();
        firstRow.add(this.spots.get(0));
        firstRow.add(this.spots.get(1));
        firstRow.add(this.spots.get(2));
        return firstRow;
    }

    public List<String> secondRow() {
        List<String> secondRow = new ArrayList<>();
        secondRow.add(this.spots.get(3));
        secondRow.add(this.spots.get(4));
        secondRow.add(this.spots.get(5));
        return secondRow;
    }

    public List<String> thirdRow() {
        List<String> thirdRow = new ArrayList<>();
        thirdRow.add(this.spots.get(6));
        thirdRow.add(this.spots.get(7));
        thirdRow.add(this.spots.get(8));
        return thirdRow;
    }

    public void display() {
        System.out.print(this.spots.get(0) + " | " + this.spots.get(1)
                                           + " | " + this.spots.get(2) + "\n" + this.spots.get(3)
                                           + " | " + this.spots.get(4)
                                           + " | " + this.spots.get(5) + "\n" + this.spots.get(6)
                                           + " | " + this.spots.get(7)
                                           + " | " + this.spots.get(8));
    }
}
