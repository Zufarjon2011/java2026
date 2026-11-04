public class Engine {
    String type;
    double air_pressure;
    int hp;

    Engine(String type, double air_pressure, int hp){
        this.type = type;
        this.air_pressure = air_pressure;
        this.hp = hp;
    }

    void start(){
        System.out.println("\nG-r-r Vroom");
        System.out.println(this.type + " engine is started!");
    }

    void showinfo(){
        System.out.println(this.air_pressure + "L " + this.hp + " " + this.type);
    }
}
