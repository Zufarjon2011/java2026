public class OOP10_abstract {
    public static void main(String[] args){

        /*
        abstract = Used to define abstract classes and methods.
                   Abstraction is the process of hiding implementation details
                   and showing only the essential features;
                   Abstract classes CAN'T be instantiated directly
                   Can contain 'abstract' methods (which must be implemented)
                   Can contain 'concrete' methods (which are inherited)

         */

        Rectangle rectangle = new Rectangle(6, 7);
        Triangle triangle = new Triangle(6,7);
        Circle circle = new Circle(6);

        System.out.println(rectangle.area());
        System.out.println(circle.area());
        System.out.println(triangle.area());
    }
}
