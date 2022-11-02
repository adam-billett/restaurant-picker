import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


import static java.lang.System.exit;

public class app {
    public static void main(String[] args) {
        run();
    }
    public static void run (){
        List<String> restList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option !=4) {
            printMenu(options);
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1: addRest(restList); break;
                    case 2: pickRest(restList); break;
                    case 3: exit(0);
                }
            }catch(Exception ex){
                System.out.println("enter ant integer value between 1 and " + options.length);
                scanner.next();
            }
        }
    }
    //printing the menu for options
    public static void printMenu(String[] options) {
        for(String option: options) {
            System.out.println(option);
        }
        System.out.print            ("Choose your option: ");
    }
    private static String[] options = {"1- Enter restaurant", "2- Pick random restaurant","3- Exit"};

    /*OPTIONS*/
    //add a restaurant
    public static void addRest(List<String> restList) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("What is the name of the restaurant: ");
        String restaurant = userInput.nextLine();
        //add the user input to a list
        restList.add(restaurant);
        System.out.println(restList);
    }
    //randomly picking a restaurant
    public static void pickRest (List<String> restList){
        Random rand = new Random();
        int upper = restList.size();
        int choice = rand.nextInt(upper);
        //random number gen to decide which restraunt to go to
        System.out.println(restList.get(choice));
    }
}
