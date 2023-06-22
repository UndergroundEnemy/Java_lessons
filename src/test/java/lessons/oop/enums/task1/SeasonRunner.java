package lessons.oop.enums.task1;

public class SeasonRunner {
    public static void main(String[] args) {
        SeasonsOfYear seasonsOfYear = SeasonsOfYear.FALL;
        System.out.println(seasonsOfYear.getNextSeason(seasonsOfYear));
    }
}
