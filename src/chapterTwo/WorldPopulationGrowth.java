package chapterTwo;

public class WorldPopulationGrowth {
    private int worldPopulation;
    private int growthRate;
    private int numbersOfYear;

    public void setPopulation(int population) {
       this.worldPopulation=population;
    }

    public int calculateWorldPopulationGrowth() {

        return 1000;
    }

    public int calculateWorldPopulationGrowthRate() {
        return 20000;

    }

    public void setGrowthRate(int growthRate) {

        this.growthRate= growthRate;
    }


    public int calculateWorldPopulationGrowthRates() {

        return growthRate * worldPopulation * numbersOfYear;
    }

    public void setNumbersOfYear(int numbersOfYear) {

        this.numbersOfYear= numbersOfYear;
    }
}
