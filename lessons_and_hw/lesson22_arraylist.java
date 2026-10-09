import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class lesson22_arraylist {
    public static void main(String[] args){
        /*
        Arraylists - dynamic lists in java that are not required to set a limit,
        a bit slower than regular lists but this is easier
         */

        //diamond operator
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter element to remove: ");
        String element = scanner.nextLine();

        list.add("Zufar");
        list.add("Ruxsora");
        //deleted
        list.add("Nodir");
        list.add("req2");
        list.add("dsfg");
        list.add("sdfsdf");

        System.out.println(list);

        list.remove("Nodir");

        System.out.println(list);
        System.out.println(list.get(1));

        //Finding element
        for(int i = 0; i <= list.size(); i++){
            if(list.get(i).equals(element)){
                System.out.println("Done " + i);
                list.remove(i);
                break;
            }
        }
        System.out.print("Enter element to add: ");
        String element2 = scanner.nextLine();

        list.add(element2);


        System.out.println(list);

        for(String li : list){
            System.out.println(li);
        }
        System.out.println(list);
    }
}
