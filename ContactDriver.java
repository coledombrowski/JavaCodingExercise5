/* JCE on Exception Handling
   Fall 2023
   Student: Cole Dombrowski
   Date: 11/7/2023
 */

package dombrowski.cole.jce5;

import javax.swing.*;

public class ContactDriver
{
    public static void main(String[] args)
    {
        // Get email input from user
        String emailAddressInput;
        emailAddressInput = JOptionPane.showInputDialog(null,
                "Please enter the new contact's email address:",
                "New Contact", 3);
        try
        {
            // Create a new contact object
            Contact c = new Contact(emailAddressInput);
            
            // Display new contact's email address
            JOptionPane.showMessageDialog(null,
                    "New contact created. \nEmail address: " + c.getEmail(),
                    "New contact Created", 1);

        }
        catch ( InvalidEmailException iee )
        {
            // Display exception information
            JOptionPane.showInputDialog(null,
                    iee.getMessage(), "Contact Exception", 0);
            JOptionPane.showInputDialog(null,
                    iee.getStackTrace(), "Contact Exception", 0);
        }
    }
}
