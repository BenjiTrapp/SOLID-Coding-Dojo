package single_responsibility.good;

import java.util.ArrayList;
import java.util.List;

public class BoardShaper {
    private int size;

    public BoardShaper(int size) {
        this.size = size;
    }

    public List<List<Integer>> rowIndices() {
        List<List<Integer>> rowIndexes = new ArrayList<>();

        for (int i = 0; i < this.size; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < this.size; j++) {
                row.add((i*size)+(j));
            }
            rowIndexes.add(row);
        }

        return rowIndexes;
    }
}
