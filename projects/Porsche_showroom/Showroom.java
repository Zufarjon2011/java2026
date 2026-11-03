public class Showroom {
    Cars[] cars;
    String title;
    int year;
    int cars_num;

    Showroom(String title, int year, Cars[] cars){
        this.title = title;
        this.year = year;
        this.cars = cars;

        cars_num = this.cars.length;
    }

    void ShowInfo(){
        System.out.println(this.title + " founded in " + this.year);
        System.out.println("Available Cars Number: " + cars_num);
        for(Cars car : cars){
            car.ShowInfo();
        }
    }
}
