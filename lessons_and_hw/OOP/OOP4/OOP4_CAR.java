public class OOP4_CAR {

    String model;
    String color;

    OOP4_CAR(String model){
        this.model = model;
        this.color = "**DEFAULT WRAPPED**";
    }

    OOP4_CAR(String model, String color){
        this.model = model;
        this.color = color;
    }


    void drive(){
        System.out.println("You are driving " + color + " " + model);
    }

}
