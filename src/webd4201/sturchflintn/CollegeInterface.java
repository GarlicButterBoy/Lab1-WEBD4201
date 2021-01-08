package webd4201.sturchflintn;

/**
 * @author Nick Sturch-Flint - 100303769
 * @author Nick Sturch-Flint
 * @version 1.0 (Janaury 8th, 2021)
 */
public interface CollegeInterface {


    //CONSTANTS
    public static final String college_name = "Durham College";
    public static final String phone_number = "(905) 721-2000";
    public static final long MINIMUM_ID_NUMBER = 100000000L;
    public static final long MAXIMUM_ID_NUMBER = 999999999L;

    /**
     *
     * @return String
     */
    public abstract String getTypeForDisplay();

}
