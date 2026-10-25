package tostore;

public class Car{
    String make;
    String model;
    String color;
    int year;

    Car(String make, String model,int year, String color){
        this.model = model;
        this.make = make;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString(){
        return this.color + " " + this.year + " " + this.make + " " + "" + this.model;
    }
}