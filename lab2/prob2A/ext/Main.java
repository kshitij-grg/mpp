package prob2A.ext;

import prob2A.GradeReport;
import prob2A.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kshitij");
        GradeReport gradeReport = student.getGradeReport();

        System.out.println("The grade report of " +student.getName()+ " is " + gradeReport);
    }
}
