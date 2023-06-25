package lessons.collections.task1collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection1 {
    public static final double FAIR_GRADE = 4.0;
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        Student student1 = new Student("Ivan", 4.5, 1);
        Student student2 = new Student("Masha", 6.3, 4);
        Student student3 = new Student("Pasha", 3.3, 2);
        Student student4 = new Student("Sasha", 9.1, 3);
        Student student5 = new Student("Dasha", 5.8, 1);
        Student student6 = new Student("Kostya", 2.6, 4);

        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);
        arrayList.add(student6);

        for(int i = 0; i<arrayList.size(); i++){
            if(arrayList.get(i).getGrade() < Collection1.FAIR_GRADE){
                arrayList.remove(i);
            }
        }

        Iterator<Student> iterator = arrayList.iterator();
        double max = 0.0;
        while(iterator.hasNext()){
            double d = iterator.next().getGrade();
            if(max < d) max = d;
        }

        System.out.println(max);

    }
}

class Student {
    private String name;
    private double grade;
    private int course;

    public Student(String name, double grade, int course) {
        this.name = name;
        this.grade = grade;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public int getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", course=" + course +
                '}';
    }
}
