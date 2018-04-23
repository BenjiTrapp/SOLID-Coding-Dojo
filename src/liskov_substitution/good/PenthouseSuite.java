package liskov_substitution.good;

public class PenthouseSuite extends liskov_substitution.bad.PenthouseSuite {
    int squareFootage;
    int numberOfBedrooms;

    public PenthouseSuite() {
        this.numberOfBedrooms = 4;
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }
}
