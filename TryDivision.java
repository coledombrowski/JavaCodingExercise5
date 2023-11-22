/* JCE on Exception Handling
   Fall 2023
   Student: Cole Dombrowski
   Date: 11/7/2023
 */

package dombrowski.cole.jce5;

import javax.swing.JOptionPane;

public class TryDivision
{
    public static void main(String[] args)
    {
        // Declare and initialize variables
        int dividend = 100;
        int divisor = 0;
        int quotient = 0;
        int remainder = 0;

        // Initialize flag variable to control the loop
        boolean goodInput = false;

        // Prompt for input
        String s = JOptionPane.showInputDialog(null,
                "Enter an integer divisor to be divided into 100:",
                "Division", 3);
        
        // Unlike the conversion example, this example doesn't terminate the 
        // program upon bad input. Instead, it allows user to try new input
        // until it's correct.
        do
        {
            try
            {
                // Convert the String to an int
                // Possible to cause NumberFormatException
                divisor = Integer.parseInt(s);

                // Perform division
                // Possible to cause ArithmeticException
                quotient = dividend / divisor;
                remainder = dividend % divisor;

                // Flag won't be set unless no exceptions are thrown
                goodInput = true;
            }

            catch ( NumberFormatException nfe )
            {
                 s = JOptionPane.showInputDialog(null,
                         s + "is not an integer. Enter an integer divisor " +
                         "to be divided into 100: ", "NumberFormatException", 0);
            }
            catch ( IllegalArgumentException iae )
            {
                 s = JOptionPane.showInputDialog(null,
                         "Illegal argument. Integer expected.",
                         "IllegalIntegerException", 0);
            }
            catch ( ArithmeticException ae )
            {
                 s = JOptionPane.showInputDialog(null,
                         "Divisor cannot be 0. Enter a NON-ZERO integer divisor: "
                         + "to be divided into 100: ", "ArithmeticExcemption", 0);
            }
        }
        // Get out of the loop when no exception occurs
        while ( !goodInput );

        // Display division result
        JOptionPane.showMessageDialog(null,
                "Division Result\nQuotient: " + quotient + "\nRemainder: " + remainder, 
                "Integer Division", 1);
    }
}
