public class OOP2_constructor {
    public static void main(String[] args){

        Student student1 = new Student("Zufar", 15, 4.0);
        Student student2 = new Student("Bosd", 16, 5.0);
        Student student3 = new Student("Qaxa", 17, 3.0);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);

        student1.study();
        student2.study();
        student3.study();
    }
}
