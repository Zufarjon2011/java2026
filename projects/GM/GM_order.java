import java.io.IOException;

public class GM_order {
    public static void main(String[] args) throws IOException {

        order order2 = new order("BMW", "Metallic Yellow", "Gas", "AWD");
        order zafaraka = new order("Malibu 2 XL", "Star Black", "Petroleum", "FWD");

        zafaraka.showallparams();

    }
}
