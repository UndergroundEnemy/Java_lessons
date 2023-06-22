package lessons.oop.enums.task2;

public enum FoodType {
    PORRIDGE(true),
    BREAD(true),
    SOUP(true),
//    VEGETABLE("vegan"),
//    NUT("vegan"),
//    FRUIT("vegan"),
//    DAIRY("not sure if vegan"),
//    FISH("meat"),
//    GREENS("vegan"),
    MEAT(false);
//    UNKNOWN("not sure if vegan");

    private boolean isVegan;

    FoodType(boolean isVegan){
        this.isVegan=isVegan;
    }

    public boolean isVegan() {
        return isVegan;
    }
}
