package week1;

import static input.InputUtils.doubleInput;
import static input.InputUtils.positiveIntInput;

public class BloodDonator {
    public static void main(String[] args) {
        System.out.println("What is your weight in lbs?");
        double weight = doubleInput();

        System.out.println("How old are you?");
        int age=positiveIntInput();

        if (weight >= 110 && age >= 17) {
            System.out.println("You are able to donate blood!");
        } else {
            System.out.println("Sorry, but you are not eligible to donate blood...");
        }
    }
}
