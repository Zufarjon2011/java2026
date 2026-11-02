public class Car_14 {
    private final String model;
    private String color;
    private int price;

    Car_14(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    void setColor(String color){
        this.color = color;
    }
    void setPrice(int price){
        if(price < 0){
            System.out.println("Price can't be negative");
        }
        else{
            this.price = price;
        }
    }
    String getColor(){
        return this.color = color;
    }
    String getModel(){
        return this.model;
    }
    String getPrice(){
        return "$" + this.price;
    }
}
