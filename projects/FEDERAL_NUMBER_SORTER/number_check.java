import java.util.*;

public class number_check {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        configs configs = new configs();
        String quit;




        System.out.print("Enter Federal Number: ");
        String input = scanner.nextLine().toUpperCase();

        if (input.length() != 8) {
            System.out.println("Number Plate has To be 8 characters");
        }



        for(String[] find : configs.licenses){
            for (int i = 0; i < configs.licenses.length; i++){
                if(find[i].equals(input)){

                    System.out.println("You Asked " + find[i]);


                    if(Arrays.asList(configs.opers).contains(input)){
                        System.out.println(configs.opers_info[i]);
                        System.out.println("OPERS!");
                    }
                    else if(Arrays.asList(configs.fined).contains(input)){
                        System.out.println(configs.fined_info[i]);
                        System.out.println("FINED!");
                    }
                    else if(Arrays.asList(configs.republic).contains(input)){
                        System.out.println(configs.rebublic_info[i]);
                        System.out.println("REPUBLICAN!");
                    }
                }

            }
        }



        //System.out.println(licenses[random.nextInt(3)][random.nextInt(3)]);
    }

    static void showall(String[][] licenses){


        for(String[] all : licenses){
            for(String each : all){
                System.out.println(each);

            }
        }
    }
}