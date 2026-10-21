public class Student {
    String name;
    int age;
    double gpa;

    /*
    To create a constructor, we need to call the file name
    Student(){Script}
     */
    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    void study(){
        System.out.println(this.name + " is Studying");
    }
}
