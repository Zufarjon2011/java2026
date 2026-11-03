public class Cars {

    String model;
    String make;
    int year;
    double price;

    Cars(String make, String model, int year, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    void ShowInfo(){
        System.out.println(this.year + " " + this.make + " " + this.model + " $" + this.price);
    }
}
