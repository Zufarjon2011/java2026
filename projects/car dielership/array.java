public class array {
    public static void main(String[] args){

        Car car1 = new Car("porsche");
        Car car2 = new Car("porsche", 2026);

        Car[] cars = {new Car("tAyCan"),
                      new Car("panamere", 2023),
                      new Car("GT 911 RS", 2026),
                      new Car("cayenne", 2025),
                      new Car("mAcAn", 2026)};

        for(Car car : cars){
            car.show_info();
        }
    }
}
