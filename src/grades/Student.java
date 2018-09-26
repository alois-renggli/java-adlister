package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

//    Create a Student class
//
//    Create a class named Student. It should have private properties for the
//    student's name, and grades. The grades property should be an list of integers.
//    The student class should have a constructor that sets name property, and initializes
//        the grades property as an empty list. The Student class should have the following
//        methods:
//
//    Copied to clipboard
//    // returns the student's name
//    public String getName();
//    // adds the given grade to the grades property
//    public void addGrade(int grade);
//    // returns the average of the students grades
//    public double getGradeAverage();


//    Test your Student class by adding a main method and creating Student objects.
//    Verify that you can add grades to each object, and that your getGradeAverage method
//    correctly returns the average of the student's grades.


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return this.name;
    };

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    };
    // returns the average of the students grades
    public double getGradeAverage(){
        int total = 0;
        for(int grade: grades){
            total += grade;
        }
        return total / grades.size();
    };

//    public static void main(String[] args) {

//            grades.add(90);
//            grades.add(80);
//            grades.add(70);
//
//        System.out.println(grades);
//        System.out.println(getGradeAverage());
//        Student louie = new Student("louie");
//        louie.addGrade(90);
//        louie.addGrade(90);
//        louie.addGrade(98);
//        System.out.println(louie.getGradeAverage());
//}

}
