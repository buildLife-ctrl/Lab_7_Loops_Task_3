import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // variable
        double celsiusInput;
        double fahrenheit;
        boolean checks = false;
        String askContinue;
        boolean contin = true;

        //checks for validation and loops until valid
        while (contin) {
            //asks the user
            do {
                System.out.println("Enter the degrees in celsius to be converted to degrees fahrenheit:");
                if (scan.hasNextDouble()) {
                    //checks = true;
                    celsiusInput = scan.nextDouble();
                    //calculates here
                    fahrenheit = (celsiusInput * 9 / 5) + 32;
                    System.out.printf("%-12s %6.2f", "Celsius: ", celsiusInput);
                    System.out.printf("\n%-12s %6.2f", "Fahrenheit:", fahrenheit);
                    scan.nextLine();
                    do {
                        System.out.println("\nWould you like to continue? Enter \"N\" for no, or \"Y\" for yes:");
                        askContinue = scan.nextLine();
                        if (askContinue.equalsIgnoreCase("n") || askContinue.equalsIgnoreCase("y")) {
                            checks = true; //when the user entered the right letter for question of continue
                            if (askContinue.equalsIgnoreCase("n")) {
                                contin = false; //user does not want to continue, system exit
                            }
                        } else {
                            System.out.println("Looks like you have entered the wrong value, please try again.");
                        }
                    } while (!checks);
                } else { //when they input an invalid, tells try again
                    System.out.println("Looks like you have entered the wrong data type, please try again.");
                    scan.nextLine();
                }
            } while (!checks);
        }
    }
}