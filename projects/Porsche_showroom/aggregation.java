public class aggregation {
    public static void main(String[] args){

        Cars car1 = new Cars("Porsche", "Cayenne", 2026, 75000);
        Cars car2 = new Cars("Porsche", "Taycan", 2026, 120000);
        Cars car3 = new Cars("Porsche", "Macan", 2026, 71000);
        Cars car5 = new Cars("Porsche", "Panamera", 2026, 100000);
        Cars car4 = new Cars("Porsche", "GT3 RS Turbo 911", 2026, 230000);


        Cars[] cars = {car1, car2, car3, car4, car5};

        Showroom showroom1 = new Showroom("Porsche Studio Tashkent", 2025, cars);

        showroom1.ShowInfo();

    }
}
