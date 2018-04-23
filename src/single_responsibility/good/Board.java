package single_responsibility.good;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.lang.String.valueOf;
import static java.util.stream.IntStream.*;

public class Board {
    private List<String> spots = new ArrayList<>();
    private final int size;

    public Board(int size) {
        assert size > 0;

        this.size = size;

        if (size == 1)
            this.spots.add(valueOf(0));
        else
            range(0,this.size).forEachOrdered(i -> range(0,this.size).forEach(j -> this.spots.add(valueOf(3*i + j))));
    }

    public int getSize(){ return this.size; }

    public List<String> getSpots() { return spots; }

    public List<String> valuesAt(List<Integer> indices) {
        Objects.requireNonNull(indices);

        return indices.stream().map(index -> this.spots.get(index))
                               .collect(Collectors.toList());
    }
}
