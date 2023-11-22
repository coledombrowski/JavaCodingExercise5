/* JCE on Exception Handling
   Fall 2023
   Student: Cole Dombrowski
   Date: 11/7/2023
 */

package dombrowski.cole.jce5;

public class Contact
{
    // For brievity we have only one instance variable. A more realistic Contact 
    // class will include name, company, phone number, etc.
    private String email;

    // Constructor
    public Contact(String newEmail) throws InvalidEmailException
    {
        // Performs validation of email before initializing the instance variable
        if ( newEmail.indexOf('@') > 0)
        {
            email = newEmail;
        }   
        else 
        {
            throw new InvalidEmailException(
            "Invalid email address: \nDoes not contain the @ sign or the @ sign is " +
                    "the first character in the email address entered.\n" +
                    "This exception was thrown by the Contact class constructor.");
        }    
        
    }

    // Getter for email. For brievity we only creates the getter. If we create
    // the setter, we should perform the same validation as done in the 
    // constructor
    public String getEmail()
    {
        return email;
    }
}
