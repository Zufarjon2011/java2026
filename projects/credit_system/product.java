import java.sql.Time;

public class product {
    String name;
    int year;
    double price;
    String color;



    product(String name, double price){
        this.name = name;
        this.price = price;
        this.year = 2026;
        this.color = "Natural Gradient";
    }
    product(String name, double price, int year){
        this.name = name;
        this.price = price;
        this.year = year;
        this.color = "Natural Gradient";

        this.price += 100;
    }
    product(String name, double price, int year, String color){
        this.name = name;
        this.price = price;
        this.year = year;
        this.color = color;

        this.price += 150;
    }
}
