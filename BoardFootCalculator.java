/*
 * The board foot program
 *
 * By:      Devin Jhu
 * Version: 1.0
 * Since:   2022-10-25
 */

import java.util.Scanner;
/**
* Class BoardFootCalculator.
*/

final class BoardFootCalculator {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private BoardFootCalculator() {
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
    * Calculates the length of the board foot.
    *
    * @param height for the height of board foot
    * @param width for the width of board foot
    * @return length for the lenght of board foot
    */

    public static double calcLength(final double height, final double width) {
        // Process
        final double length = BOARD_FOOT / (height * width);
        return length;
    }
    /**
    * The Starting main() function.
    *
    * @param args Not used.
    * @throws InputMismatchException If input is invalid
    */

    public static void main(final String[] args) {
        // Input and scanner
        final Scanner myObj = new Scanner(System.in);
        try {
            System.out.println("Input height: ");
            final double inputHeight = myObj.nextDouble();
            try {
                System.out.println("Input width: ");
                final double inputWidth = myObj.nextDouble();
                final double length = calcLength(inputHeight, inputWidth);
                // Output
                System.out.println("The wood will be " + length + " inches");
            } catch (java.util.InputMismatchException error) {
                System.out.println("Width is not a number");
            }
        } catch (java.util.InputMismatchException error) {
            System.out.println("Height is not a number");
        } finally {
            System.out.println("\nDone.");
        }
    }
}
