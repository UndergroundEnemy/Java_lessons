package lessons.oop.enums.task2;

public class Meal2 extends Food{
    private String name;
    private final FoodType foodType;

    Meal2(FoodType foodType){
        this.name = foodType.name();
        this.foodType = foodType;
    }


    @Override
    public FoodType getFoodType() {
        return foodType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
