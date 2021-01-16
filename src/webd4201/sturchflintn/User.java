package webd4201.sturchflintn;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

import static java.lang.Double.*;

/**
 * @author Nick Sturch-Flint - 100303769
 * @author Nick Sturch-Flint
 * @version 1.0 (Janaury 8th, 2021)
 */
public class User implements CollegeInterface {

    //Constants
    protected static long DEFAULT_ID = 100123456;
    protected static String DEFAULT_PASSWORD = "password";
    public static final byte MINIMUM_PASSWORD_LENGTH = 8;
    public static final byte MAXIMUM_PASSWORD_LENGTH = 20;
    protected static String DEFAULT_FIRST_NAME = "John";
    protected static String DEFAULT_LAST_NAME = "Doe";
    protected static String DEFAULT_EMAIL_ADDRESS = "john.doe@dcmail.com";
    protected static boolean DEFAULT_ENABLED_STATUS = true;
    protected static char DEFAULT_TYPE = 's';
    protected static byte ID_NUMBER_LENGTH = 9;
    protected final static DateFormat DF = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CANADA);

    /**
     *
     */
    private long id;

    /**
     *
     */
    private String password;

    /**
     *
     */
    private String firstName;

    /**
     *
     */
    private String lastName;

    /**
     *
     */
    private String emailAddress;

    /**
     *
     */
    private Date lastAccess;

    /**
     *
     */
    private Date enrolDate;

    /**
     *
     */
    private boolean enabled;

    /**
     *
     */
    private char type;

    //Accessors
    //Getters
    /**
     *
     * @return
     */
    public long getId()
    {
        return id;
    }

    /**
     *
     * @return
     */
    public String getPassword()
    {
        return password;
    }

    /**
     *
     * @return
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     *
     * @return
     */
    public String getEmailAddress()
    {
        return emailAddress;
    }

    /**
     *
     * @return
     */
    public Date getLastAccess()
    {
        return lastAccess;
    }

    /**
     *
     * @return
     */
    public Date getEnrolDate()
    {
        return enrolDate;
    }

    /**
     *
     * @return
     */
    public boolean isEnabled()
    {
        return enabled;
    }

    /**
     *
     * @return
     */
    public char getType()
    {
        return type;
    }



    //Setters
    /**
     *
     * @param id
     * @exception InvalidIdException
     */
    public void setId(long id) throws InvalidIdException
    {
        if (id >= MINIMUM_ID_NUMBER && id <= MAXIMUM_ID_NUMBER)
        {
            this.id = id;
        }
        else
        {
            throw new InvalidIdException(id + " is not a valid ID number.");
        }

    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) throws InvalidPasswordException
    {
        if (password.length() >= MINIMUM_PASSWORD_LENGTH && password.length() <= MAXIMUM_PASSWORD_LENGTH)
        {
            this.password = password;
        }
        else
        {
            throw new InvalidPasswordException("The length of the password must be between " + MINIMUM_PASSWORD_LENGTH + " and " + MAXIMUM_PASSWORD_LENGTH + " characters long.");
        }

    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) throws InvalidNameException
    {
        boolean flag = false;
        try
        {
            double test = Double.parseDouble(firstName);
        }
        catch (NumberFormatException ex)
        {
         flag = true;
        }

        if (!(firstName.isEmpty()) && flag)
        {
            this.firstName = firstName;
        }
        else
        {
            throw new InvalidNameException(firstName + " is not a valid name. Make sure there are no numbers or special characters.");
        }
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) throws InvalidNameException
    {
        boolean flag = false;
        try
        {
            double test = Double.parseDouble(lastName);
        }
        catch (NumberFormatException ex)
        {
            flag = true;
        }

        if (!(lastName.isEmpty()) && flag)
        {
            this.lastName = lastName;
        }
        else
        {
            throw new InvalidNameException(lastName + " is not a valid name. Make sure there are no numbers or special characters.");
        }
    }

    /**
     *
     * @param emailAddress
     */
    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    /**
     *
     * @param lastAccess
     */
    public void setLastAccess(Date lastAccess)
    {
        this.lastAccess = lastAccess;
    }

    /**
     *
     * @param enrolDate
     */
    public void setEnrolDate(Date enrolDate)
    {
        this.enrolDate = enrolDate;
    }

    /**
     *
     * @param enabled
     */
    public void setEnabled(boolean enabled)
    {
        this.enabled = enabled;
    }

    /**
     *
     * @param type
     */
    public void setType(char type)
    {
        this.type = type;
    }

    //Constructors
    /**
     * Parameterized Constructor
     * @param id User ID
     * @param password Users Password
     * @param firstName User's First Name
     * @param lastName User's Last Name
     * @param emailAddress User's Email Address
     * @param lastAccess User's Last Access Date
     * @param enrolDate User's Enrolment Date
     * @param enabled If User is Enabled
     * @param type User's Account Type
     */
    public User(long id, String password, String firstName, String lastName, String emailAddress, Date lastAccess, Date enrolDate, boolean enabled, char type) throws InvalidUserDataException
    {
        try
        {
            setId(id);
            setPassword(password);
            setFirstName(firstName);
            setLastName(lastName);
            setEmailAddress(emailAddress);
            setLastAccess(lastAccess);
            setEnrolDate(enrolDate);
            setEnabled(enabled);
            setType(type);
        }
        catch (Exception e)
        {
            throw new InvalidUserDataException(e.getMessage());
        }

    }

    /**
     * Default Constructor
     */
    public User()
    {
       this.id = DEFAULT_ID;
       this.password = DEFAULT_PASSWORD;
       this.firstName = DEFAULT_FIRST_NAME;
       this.lastName = DEFAULT_LAST_NAME;
       this.emailAddress = DEFAULT_EMAIL_ADDRESS;
       this.lastAccess = new Date();
       this.enrolDate = new Date();
       this.enabled = true;
       this.type = DEFAULT_TYPE;
    }

    //Methods
    /**
     * Returns the user type depending on the child class it is called.
     * @return String User
     */
    public String getTypeForDisplay()
    {
        return "User";
    }

    /**
     * Overrides the toString method to print out the class to a string.
     * @return String
     */
    @Override
    public String toString()
    {
        return  getTypeForDisplay() + "\n{" +
                "Student ID    = " + id + "\n" +
                "Name          = " + firstName + ' ' + lastName + "\n" +
                "Email Address = " + emailAddress + '\n' +
                "Created On    = " + enrolDate + "\n" +
                "Last Access   = " + lastAccess + "\n" +
                '}';
    }

    /**
     * Prints the object.
     * @return Object as a String
     */
    public void dump()
    {
       System.out.println(toString());
    }

    /**
     * Returns a boolean depending on the id number after being compared to the min and max id numbers allowed.
     * @param id
     * @return boolean
     */
    public static boolean verifyId(long id)
    {
        boolean flag = true;

        if (id > MAXIMUM_ID_NUMBER || id < MINIMUM_ID_NUMBER)
        {
            flag = false;
        }

        return flag;
    }


}
