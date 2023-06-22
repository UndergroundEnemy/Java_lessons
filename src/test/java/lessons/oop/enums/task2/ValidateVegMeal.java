package lessons.oop.enums.task2;

public class ValidateVegMeal {
    public static boolean isVegeterian(Food[] foods){
        boolean result = true;
        for(int i = 0; i<foods.length-1; i++){
            if(!foods[i].getFoodType().isVegan()){
                result = false;
                break;
            };
        }
        return result;
    }

    public static void main(String[] args) {
        Food[] foods = {new Meal1(FoodType.MEAT), new Meal2(FoodType.BREAD)};
        System.out.println(isVegeterian(foods));
    }
}
