package webd4201.sturchflintn;

/**
 * College Interface will act as a 'super parent' to all extended classes in this program
 * @author Nick Sturch-Flint - 100303769
 * @version 1.0 (Janaury 8th, 2021)
 * @since January 8th, 2021
 */
public interface CollegeInterface {


    //CONSTANTS
    /**
     * College Interface for school named Durham College
     */
    public static final String college_name = "Durham College";
    /**
     * The phone number that reaches Durham College
     */
    public static final String phone_number = "(905) 721-2000";
    /**
     * The Minimum Allowed ID Number
     */
    public static final long MINIMUM_ID_NUMBER = 100000000L;
    /**
     * The Maximum allowed ID Number
     */
    public static final long MAXIMUM_ID_NUMBER = 999999999L;

    /**
     * Returns the user type depending on the child class it is called.
     * @return String User type
     */
    public abstract String getTypeForDisplay();

}
