package main.java;

// class - prototype for Product objects
public class Variables {

    public static void main(String[] args) {

        // data types 2 categories: non-primitive, primitive

        // variables
        // declaration
        String seller;

        // declaration + initialization
        String name = "Laptop Lenovo";
        String productDescription = "Laptop Core intel";
        int quantity = 5;
        double price = 5600.56;

        // default values for primitives:
        // int - 0
        // long - 0L
        // double - 0.00
        // float - 0.00f
        // boolean - false

        /*
        message to be displayed on console
        The details are: Laptop Lenovo, 5600.56 lei, Laptop Core intel
        and 5 quantity.
         */

        System.out.println("The details are: " + name + ", " + price
                + " lei, " + productDescription + " and " + quantity + " quantity.");

        System.out.println(displayDetails(name, price, productDescription, quantity));

    }

    // method with parameters
    public static String displayDetails(String name, double price, String productDescription, int quantity) {
        return "The details are: " + name + ", price " + price
                + " with description " + productDescription + " and " + "quantity " + quantity + ".";
    }
}
