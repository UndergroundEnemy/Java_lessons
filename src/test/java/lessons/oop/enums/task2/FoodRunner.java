package lessons.oop.enums.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class FoodRunner {
    public static void main(String[] args) {
        Food food1 = new Meal1(FoodType.BREAD);
        Food food2 = new Meal2(FoodType.MEAT);

        Food[] foods = {food1, food2};


        System.out.println(food2.getFoodType());
        System.out.println(ValidateVegMeal.isVegeterian(foods));
    }
}
