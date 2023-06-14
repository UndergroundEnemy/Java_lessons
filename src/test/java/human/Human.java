package human;

public class Human {
    private String name;
    private int age;
    public Human(String s){
        this("Hey", 1);
        System.out.println("DVA");
    }

    public Human(String s, int i){
        name = s;
        age = i;
        System.out.println("RAZ");
    }
}

class Student extends Human {
    Student(){
        super("Hello");
        System.out.println("TRI");
    }

    public static void main(String[] args) {
        Student s = new Student();
    }
}
