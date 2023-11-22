/* JCE on Exception Handling
   Fall 2023
   Student: Cole Dombrowski
   Date: 11/7/2023
 */

package dombrowski.cole.jce5;

import javax.swing.JOptionPane;

/* 
Integer to control the icon in JOptionPane dialog boxes
0 - ERROR_MESSAGE
1 - INFORMATION_MESSAGE
2 - WARNING_MESSAGE
3 - QUESTION_MESSAGE
*/

public class TryConversion
{
    public static void main( String [] args )
    {
        int n = 0;
        String exInfo; 
     
        // Prompt for input
        String s = JOptionPane.showInputDialog( null,
                             "Enter an integer", "Conversion", 3);
        try
        {
           // Convert the String to an int
           n = Integer.parseInt(s);
           JOptionPane.showMessageDialog(null,
                        "Conversion was successful.\nInteger is: " + n + ".",
                        "Conversion Success", 1);
        }
        catch ( NumberFormatException nfe )
        {
           exInfo = "User input: " + s;
           
           // Get exception info
           // getMessage()
           exInfo += "\n\nOutput from getMessage(): \n" + nfe.getMessage();

           // toString()
           exInfo += "\n\nOutput from toString(): \n" + nfe.toString();
           
           // Display conversion result
           JOptionPane.showMessageDialog(null, 
                   "Invalid user input. Program will terminate.\n" +
                   "Below is info on the exception.\n\n" + exInfo,
                   "Conversion Exception", 0);
        }
        finally
        {
            // Display a message that will appear whether exception ocurred or not
            JOptionPane.showMessageDialog(null,
                    "Restart the program if program terminated prematurely\n " +
                    "due to invalid user input; Otherwise have a good day!",
                    "Conversion:", 1);
        }
    }
}
