package lessons.collections.comparators.task1comp;

import java.util.ArrayList;
import java.util.Comparator;

/*
* Создать класс Student, содержащий следующие характеристики – имя, группа, средняя оценка.

Создать коллекцию, содержащую объекты класса Student.

Написать метод, который удаляет студентов со средним баллом <3.

Написать методы, возвращающие коллекцию студентов отсортированных по:

- имени

- группе

- средней оценке

- сначала по группе, затем в рамках одной группы по средней оценке*/
public class CompRunner {
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
        System.out.println(arrayList);
        System.out.println("----------------------");

        NameComaparator nameComaparator = new NameComaparator();
        arrayList.sort(nameComaparator.thenComparing(Student::getGrade));

        System.out.println(arrayList);


    }

}

class NameComaparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getName().compareToIgnoreCase(o2.getName()));
    }
}

class GradeComaparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getGrade() > o2.getGrade()){
            return 1;
        } else if(o1.getGrade() < o2.getGrade()){
            return -1;
        } else {
            return 0;
        }
    }
}

class CourseComaparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getCourse() - o2.getCourse();
    }
}
