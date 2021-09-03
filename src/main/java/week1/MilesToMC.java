package week1;


import static input.InputUtils.positiveDoubleInput;

public class MilesToMC {
    public static void main(String[] args) {
        System.out.println("What is the distance, in miles, from your house to MC? ");
        double userInputInMiles = positiveDoubleInput();

        if (userInputInMiles > 10) {
            System.out.println("Whoa! You live more then 10 miles away!");
        } else if (userInputInMiles == 10){
            System.out.println("Nice! You live exactly 10 miles away from MC! That's not bad is it!");
        } else {
            System.out.println("You live less then 10 miles away from MC, that's bike-able!");
        }
        double userInputInKilometers = userInputInMiles * 1.6;
        System.out.printf("You live is %.2f Kilometers from school.",userInputInKilometers);
        }

    }

