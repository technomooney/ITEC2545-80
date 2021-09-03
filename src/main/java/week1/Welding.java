package week1;

import static input.InputUtils.yesNoInput;

public class Welding {
    public static void main(String[] args) {
        boolean cottonClothes = yesNoInput("Are you wearing cotton clothes?");
        boolean woolClothes = yesNoInput("Are you wearing wool clothes?");
        boolean closedToeShoes = yesNoInput("Are you wearing closed-toe shoes?");

        if ((cottonClothes || woolClothes) && closedToeShoes) {
            System.out.println("Good! you are properly prepared for welding class!");
        } else {
            System.out.println("you must wear close-toed shoes and either Wool clothes or cotton clothes!");
        }

    }
}
