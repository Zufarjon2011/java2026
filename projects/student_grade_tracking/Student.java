import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);
    String name;
    ArrayList<Integer> grades = new ArrayList<>();
    ArrayList<String> subjects = new ArrayList<>();
    ArrayList<Double> great_point_average = new ArrayList<>();

    Student(String name){

        this.name = name;
        this.grades = new ArrayList<>();
        this.subjects = new ArrayList<>();
        this.great_point_average = new ArrayList<>();
    }


    void addGrade(){

        String qit;

        do {

            System.out.print("Start?: ");
            qit = scanner.nextLine().toLowerCase();

            if (qit.equals("no")) {
                break;
            }



            //grade logic
            Boolean isValid = true;

            do {

                System.out.print("Enter Subject name: ");
                String subject = scanner.nextLine().toUpperCase();
                if (subjects.contains(subject)) {
                    System.out.println("Subject already exists!");
                    continue;
                }
                else {
                    subjects.add(subject);
                }





                System.out.print("Enter Grade: ");
                int grade = scanner.nextInt();
                scanner.nextLine();

                if(grade > 10){
                    System.out.println("MAX SCORE IS 10");
                    isValid = false;
                    continue;
                }
                else if(grade < 0){
                    System.out.println("GRADE CAN NOT BE NEGATIVE");
                    isValid = false;
                    continue;
                }
                else {
                    grades.add(grade);
                    isValid = true;
                }
            }while (!isValid);
        }while (true);







    }
    void calculate_gpa() {

        double total = 0;

        for(int each : grades){
            total += each;
        }

        double gpa = total/grades.size();
        System.out.println("GPA: " + gpa);
        great_point_average.add(gpa);


    }

    void printnames(){

        int limit = Math.min(subjects.size(), grades.size());
        System.out.println("\n" + name);
        for (int i = 0; i < limit; i++) {
            System.out.println(subjects.get(i) + " : " + grades.get(i));
        }
        System.out.println("GPA ----> " + great_point_average + "\n");




    }
}
