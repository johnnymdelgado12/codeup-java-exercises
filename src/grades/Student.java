package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }
    // returns the student's name
    public String getName(){
        return name;
    };
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    public ArrayList<Integer> getGrade(){
        return grades;
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for(Integer grade : grades)
        {
            sum += grade;
        }
        return sum / grades.size();
    }

    public static void main(String[] args) {
        Student johnny = new Student("johnny");
        System.out.println(johnny);
        System.out.println(johnny.getName());
        johnny.addGrade(100);
        johnny.addGrade(97);
        johnny.addGrade(85);
        johnny.addGrade(95);
        System.out.println(johnny.getGrade());
        System.out.printf("Your grade average is %f, ",johnny.getGradeAverage());
    }
}
