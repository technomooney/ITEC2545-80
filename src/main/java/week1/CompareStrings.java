package week1;

import static input.InputUtils.stringInput;

public class CompareStrings {
    public static void main(String[] args) {
        String college = stringInput("Which college do you go to?");
        if (college.equalsIgnoreCase("MC")) {
            System.out.println("yay! MC!");
        } else {
            System.out.println("To bad, you should check out MC!");
        }
    }
}
