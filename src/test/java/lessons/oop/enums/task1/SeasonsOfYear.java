package lessons.oop.enums.task1;

public enum SeasonsOfYear {
    WINTER("cold", 89),
    SPRING("warm weather coming", 91),
    SUMMER("hot weather and swimming in pools", 94),
    FALL("melancholic mood", 90);

    private String description;
    private int countOfDays;

    SeasonsOfYear(String description, int countOfDays){
        this.description=description;
        this.countOfDays=countOfDays;
    }

    public void seasonInfo(){
        System.out.println("This season can be describes as " + description + " and has " + countOfDays + " days!");
    }

    public SeasonsOfYear getNextSeason(SeasonsOfYear currentSeason){
        SeasonsOfYear[] arrSeason = SeasonsOfYear.values();
        return arrSeason[(currentSeason.ordinal()+1)%SeasonsOfYear.values().length];
    }
}
