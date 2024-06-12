import java.util.Scanner;

public class dailySpecials {
    public static void main(String[] args) {
        //declare a string specials for our switch placeholder
        String specials = "";
        //need scanner for user input
        Scanner input = new Scanner(System.in);
        boolean weekends;
        //welcome message/instructions
        System.out.println("Please enter a weekday (Monday-Friday)");


        while (true) {
            specials = input.next();
            weekends = specials.equalsIgnoreCase("Saturday") || specials.equalsIgnoreCase("Sunday"); // Change to equalsIgnoreCase

            // If user inputs a weekend, prompt them to enter a weekday
            if (weekends) {
                System.out.println("Please enter a weekday, not a weekend."); // Immediate prompt for weekends
                continue;
            }

            // If a valid weekday is entered, break out of the loop
            if (specials.equalsIgnoreCase("Monday") || specials.equalsIgnoreCase("Tuesday") ||
                    specials.equalsIgnoreCase("Wednesday") || specials.equalsIgnoreCase("Thursday") ||
                    specials.equalsIgnoreCase("Friday")) { // Change to equalsIgnoreCase
                break;
            }

            // Handle invalid inputs that are neither weekends nor valid weekdays
            System.out.println("Invalid input. Please enter a valid weekday (Monday-Friday)."); // Prompt for invalid input
        }
//need name and price for coffee
        String coffee;
        double price;
        //Declare booleans for weekend cases
        // boolean weekends = specials.equals("Saturday") || specials.equals("Sunday") ;

        //declare qty int for cost calculations/order size
        int qty;

        //if user inputs a weekend, prompt them to enter a weekend
//        if(weekends){
//            System.out.println("Please enter a weekday, not a weekend.");
//            specials = input.next();
//        }

        /*
        in our switch cases, we will print out what the coffee is for the week and also display it's price
        it will then prompt the user to input how many items they would like to order
        if user inputs 0 then a message will display encouraging customer to come back
        if one is entered an appropriate message will display for odering 1 item
        if a value larger than 1 is entered then a message will display the qty and total cost of the order.

         */

        switch (specials.toLowerCase()) {
            //cases = weekday
            case "monday" -> {
                coffee = "Latte";
                price = 4.95;
                System.out.println("Monday''s coffee of the day is a " + coffee + " and the price will be $"
                        + price + ".");
                System.out.println("How many would you like to order?");
                qty = Integer.parseInt(input.next());
                if (qty <= 0) {
                    System.out.println("Looks like you don't like " + coffee + "s. We hope you will come another time.");
                    break;
                } else if (qty == 1) {
                    System.out.println("You will only be ordering 1 " + coffee + " today.");
                    System.out.printf("You ordered %d %s for a price of: $%.2f.", qty, coffee, qty * price);
                    break;
                } else if (qty < 10 && qty >= 5) {
                    System.out.printf("You will only be ordering %d %ss today.", qty, coffee);
                    System.out.println();
                    System.out.println("You get a 10% discount for ordering 5 or more coffees!");
                    System.out.printf("You ordered %d %ss for a discounted price of: $%.2f.", qty, coffee, (qty * price * .9));
                    break;
                } else if (qty <= 10) {
                    System.out.printf("You will only be ordering %d %ss today.", qty, coffee);
                    System.out.println();
                    System.out.println("You get a 20% discount for ordering 10 or more coffees!");
                    System.out.printf("You ordered %d %ss for a discounted price of: $%.2f.", qty, coffee, (qty * price * .8));
                    break;

                }
                System.out.printf("You ordered %d %s for a price of: $%.2f.", qty, coffee, qty * price);
            }
            case "tuesday" -> {
                coffee = "Frappe";
                price = 5.95;
                System.out.println("Tuesday's coffee of the day is a " + coffee + " and the price will be $"
                        + price + ".");
                System.out.println("How many would you like to order?");
                qty = Integer.parseInt(input.next());
                if (qty <= 0) {
                    System.out.println("Looks like you don't like " + coffee + "s. We hope you will come another time.");
                    break;
                } else if (qty == 1) {
                    System.out.println("You will only be ordering 1 " + coffee + " today.");
                    System.out.printf("You ordered %d %s for a price of: $%.2f.", qty, coffee, qty * price);
                    break;
                } else if (qty < 10 && qty >= 5) {
                    System.out.printf("You will only be ordering %d %ss today.", qty, coffee);
                    System.out.println();
                    System.out.println("You get a 10% discount for ordering 5 or more coffees!");
                    System.out.printf("You ordered %d %ss for a discounted price of: $%.2f.", qty, coffee, (qty * price * .9));
                    break;
                } else if (qty <= 10) {
                    System.out.printf("You will only be ordering %d %ss today.", qty, coffee);
                    System.out.println();
                    System.out.println("You get a 20% discount for ordering 10 or more coffees!");
                    System.out.printf("You ordered %d %ss for a discounted price of: $%.2f.", qty, coffee, (qty * price * .8));
                    break;
                }
                System.out.printf("You ordered %d %s for a price of: $%.2f.", qty, coffee, qty * price);
            }
            case "wednesday" -> {
                coffee = "Cappuccino";
                price = 4.35;
                System.out.println("Wednesday's coffee of the day is a " + coffee + " and the price will be $"
                        + price + ".");
                System.out.println("How many would you like to order?");
                qty = Integer.parseInt(input.next());
                if (qty <= 0) {
                    System.out.println("Looks like you don't like " + coffee + "s. We hope you will come another time.");
                    break;
                } else if (qty == 1) {
                    System.out.println("You will only be ordering 1 " + coffee + " today.");
                    System.out.printf("You ordered %d %s for a price of: $%.2f.", qty, coffee, qty * price);
                    break;
                } else if (qty < 10 && qty >= 5) {
                    System.out.printf("You will only be ordering %d %ss today.", qty, coffee);
                    System.out.println();
                    System.out.println("You get a 10% discount for ordering 5 or more coffees!");
                    System.out.printf("You ordered %d %ss for a discounted price of: $%.2f.", qty, coffee, (qty * price * .9));
                    break;
                } else if (qty <= 10) {
                    System.out.printf("You will only be ordering %d %ss today.", qty, coffee);
                    System.out.println();
                    System.out.println("You get a 20% discount for ordering 10 or more coffees!");
                    System.out.printf("You ordered %d %ss for a discounted price of: $%.2f.", qty, coffee, (qty * price * .8));
                    break;

                }
                System.out.printf("You ordered %d %s for a price of: $%.2f.", qty, coffee, qty * price);
            }
            case "thursday" -> {
                coffee = "Regular";
                price = 2.95;
                System.out.println("Monday's coffee of the day is a " + coffee + " and the price will be $"
                        + price + ".");
                System.out.println("How many would you like to order?");
                qty = Integer.parseInt(input.next());
                if (qty <= 0) {
                    System.out.println("Looks like you don't like " + coffee + "s. We hope you will come another time.");
                    break;
                } else if (qty == 1) {
                    System.out.println("You will only be ordering 1 " + coffee + " today.");
                    System.out.printf("You ordered %d %s for a price of: $%.2f.", qty, coffee, qty * price);
                    break;
                } else if (qty < 10 && qty >= 5) {
                    System.out.printf("You will only be ordering %d %ss today.", qty, coffee);
                    System.out.println();
                    System.out.println("You get a 10% discount for ordering 5 or more coffees!");
                    System.out.printf("You ordered %d %ss for a discounted price of: $%.2f.", qty, coffee, (qty * price * .9));
                    break;
                } else if (qty <= 10) {
                    System.out.printf("You will only be ordering %d %ss today.", qty, coffee);
                    System.out.println();
                    System.out.println("You get a 20% discount for ordering 10 or more coffees!");
                    System.out.printf("You ordered %d %ss for a discounted price of: $%.2f.", qty, coffee, (qty * price * .8));
                    break;

                }
                System.out.printf("You ordered %d %s for a price of: $%.2f.", qty, coffee, qty * price);
            }
            case "friday" -> {
                coffee = "Maccha Latte";
                price = 6.95;
                System.out.println("Friday's coffee of the day is a " + coffee + " and the price will be $"
                        + price + ".");
                System.out.println("How many would you like to order?");
                qty = Integer.parseInt(input.next());

                if (qty <= 0) {
                    System.out.println("Looks like you don't like " + coffee + "s. We hope you will come another time.");
                    break;
                } else if (qty == 1) {
                    System.out.println("You will only be ordering 1 " + coffee + " today.");
                    System.out.printf("You ordered %d %s for a price of: $%.2f.", qty, coffee, qty * price);
                    break;
                } else if (qty < 10 && qty >= 5) {
                    System.out.printf("You will only be ordering %d %ss today.", qty, coffee);
                    System.out.println();
                    System.out.println("You get a 10% discount for ordering 5 or more coffees!");
                    System.out.printf("You ordered %d %ss for a discounted price of: $%.2f.", qty, coffee, (qty * price * .9));
                    break;
                } else if (qty <= 10) {
                    System.out.printf("You will only be ordering %d %ss today.", qty, coffee);
                    System.out.println();
                    System.out.println("You get a 20% discount for ordering 10 or more coffees!");
                    System.out.printf("You ordered %d %ss for a discounted price of: $%.2f.", qty, coffee, (qty * price * .8));
                    break;

                }

                System.out.printf("You ordered %d %ss for a price of: $%.2f.", qty, coffee, qty * price);
            }
            default -> System.out.println("Please enter a valid day or check your spelling.");
        }


    }
}