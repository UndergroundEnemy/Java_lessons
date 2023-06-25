package lessons.collections.comparators.task1comp;

public class Student {
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
