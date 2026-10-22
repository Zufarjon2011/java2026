public class OOP7_super {
    public static void main(String[] args){
        /*
        super - refers to a parent class (subclass <- superclass)
                Used in constructors and methods overriding
                Calls the parent class to initialize attributes
         */
        Person person = new Person("Zufarjon", "Xojiakbarov");
        Students student = new Students("Zufarjon", "Xojiakbarov", 3.20);

        person.Showname();
        student.Showname();
        System.out.println(student.gpa);
    }
}
