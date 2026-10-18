import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Student student = new Student("Zufar");
        Student student2 = new Student("Bosd");
        Student student3 = new Student("Qaxramon");

        student.addGrade();
        student.calculate_gpa();


        student2.addGrade();
        student2.calculate_gpa();


        student3.addGrade();
        student3.calculate_gpa();

        ArrayList<Student> classroster = new ArrayList<>();

        classroster.add(student);
        classroster.add(student2);
        classroster.add(student3);


        student.printnames();
        student2.printnames();
        student3.printnames();

    }
}
