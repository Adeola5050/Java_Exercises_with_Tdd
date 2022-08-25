package chapterTwo;

public class PyramidOfGiza {
    int numberOfStone;
    int weightOfStone;
    int numbersOfYears;
    public void setNumbersOfStones(int stone) {
        this.numberOfStone= stone;
    }

    public void setWeightOfStEachStone(int weightOfStone) {
        this.weightOfStone= weightOfStone;
    }

    public void setNumbersOfYears(int numberOfYears) {
        this.numbersOfYears= numberOfYears;
    }

    public int pyramidBuilt() {
        return 0;
    }

    public int calculatePyramidBuilt() {
        return numberOfStone * numbersOfYears *weightOfStone;
    }

    public int calculateAveragePyramidBuilt() {
        return numberOfStone * numbersOfYears *weightOfStone /(3);

    }
}
