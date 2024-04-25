public class GallonsLiters {
    //program that displays a list of liter values converted to gallons

    public static void main(String[] args) {

        // Constants for gallon to liter conversion
        double liter = 3.78541;
        double gallon = 1;

        //convert gallon to liter
        double converter = 3.78541;

        //start counter at 2 so our first set of lines doesn't exceed 5
        int counter = 2;

        //print first line since we start at 1 gallon not gallons. format it so liters has 2 placeholders and gallon has one
        System.out.println(String.format("%.2f Liters = %.1f Gallon", liter, gallon));

        //start for loop at 2 gallons since we already took care of 1 gallon
        for (gallon = 2; gallon <= 100; gallon++) {

            //do our conversion
            liter = gallon * converter;

            //print to console with proper formatting
            System.out.println(String.format("%.2f Liters = %.1f Gallons", liter, gallon));

            //if statement that checks if our counter == 5 and skips a line if so
            if (counter == 5) {
                System.out.println();
                counter = 0;
            }
            //increment counter value by one
            counter ++;

        }
    //end main
        }
}
