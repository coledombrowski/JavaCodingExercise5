/* JCE on Exception Handling
   Fall 2023
   Student: Cole Dombrowski
   Date: 11/7/2023
 */

package dombrowski.cole.jce5;

public class InvalidEmailException extends IllegalArgumentException
{
    // Constructor
    public InvalidEmailException (String message)
    {
        super(message);
    }

}
