package week1;

import static input.InputUtils.*;

public class Prices {
    public static void main(String[] args) {
        String productName = stringInput("What is the name of the product?");
        double price = positiveDoubleInput("What does one unit of "+ productName + " cost?");
        int quantity = positiveIntInput("How many " + productName + " purchased?");
        String unitName = "units";
        if (quantity == 1){
            unitName = "unit";
        }

        double totalPrice = price * quantity;
        System.out.printf("%d %s of %s at $%.2f each costs $%.2f in total", quantity, unitName, productName, price, totalPrice);
    }
}
