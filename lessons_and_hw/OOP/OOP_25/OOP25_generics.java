public class OOP25_generics {
    public static void main(String[] args){

        /*
        Generics - A concept where you can write a class, interface, or a method
                   that is compatible with different data types.
                   <T> "type" parameter (placeholder that gets replaced with a real type)
                   <String> type "argument" (specifies the type)
         */
        Box<String> box = new Box<>();
        Product<String, Double> product = new Product<>("Shelf", 5.99);

        box.setItem("Book");
        System.out.println(box.getItem());

        System.out.println(product.getItem());
        System.out.println(product.getPrice());
    }
}
