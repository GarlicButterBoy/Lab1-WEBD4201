package webd4201.sturchflintn;

import java.util.Date;

/**
 * Faculty class extends the user class and acts as the Faculty user type
 * @author Nick Sturch-Flint - 100303769
 * @version 1.0 (Janaury 8th, 2021)
 * @since January 8th, 2021
 */
public class Faculty extends User
{

    //CONSTANTS
    public static final String DEFAULT_SCHOOL_CODE = "SET";
    public static final String DEFAULT_SCHOOL_DESCRIPTION = "School of Engineering & Technology";
    public static final String DEFULAT_OFFICE = "H-140";
    public static final int DEFAULT_PHONE_EXTENSION = 1234;

    //VARIABLES
    private String schoolCode;
    private String schoolDescription;
    private String office;
    private int extension;

    //CONSTRUCTORS

    /**
     *
     * @param id
     * @param password
     * @param firstName
     * @param lastName
     * @param emailAddress
     * @param lastAccess
     * @param enrolDate
     * @param enabled
     * @param type
     * @param schoolCode
     * @param schoolDescription
     * @param office
     * @param extension
     */
    public Faculty(long id, String password, String firstName, String lastName, String emailAddress, Date lastAccess, Date enrolDate, boolean enabled, char type, String schoolCode, String schoolDescription, String office, int extension) throws InvalidNameException, InvalidIdException, InvalidPasswordException, InvalidUserDataException {
        super(id, password, firstName, lastName, emailAddress, lastAccess, enrolDate, enabled, type);
        setSchoolCode(schoolCode);
        setSchoolDescription(schoolDescription);
        setOffice(office);
        setExtension(extension);
    }


    /**
     * DEFAULT CONSTRUCTOR
     */
    public Faculty()
    {
        super();
        setSchoolCode(DEFAULT_SCHOOL_CODE);
        setSchoolDescription(DEFAULT_SCHOOL_DESCRIPTION);
        setOffice(DEFULAT_OFFICE);
        setExtension(DEFAULT_PHONE_EXTENSION);
    }

    //ACCESSORS
    //Getters
    /**
     *
     * @return
     */
    public String getSchoolCode()
    {
        return schoolCode;
    }

    /**
     *
     * @return
     */
    public String getSchoolDescription()
    {
        return schoolDescription;
    }

    /**
     *
     * @return
     */
    public String getOffice()
    {
        return office;
    }

    /**
     *
     * @return
     */
    public int getExtension()
    {
        return extension;
    }

    //Setters

    /**
     *
     * @param schoolCode
     */
    public void setSchoolCode(String schoolCode)
    {
        this.schoolCode = schoolCode;
    }

    /**
     *
     * @param schoolDescription
     */
    public void setSchoolDescription(String schoolDescription)
    {
        this.schoolDescription = schoolDescription;
    }

    /**
     *
     * @param office
     */
    public void setOffice(String office)
    {
        this.office = office;
    }

    /**
     *
     * @param extension
     */
    public void setExtension(int extension)
    {
        this.extension = extension;
    }


    //METHODS
    /**
     *
     * @return String
     */
    @Override
    public String getTypeForDisplay()
    {
        return "Faculty";
    }

    /**
     *
     * @return String
     */
    @Override
    public String toString()
    {
        return  getTypeForDisplay() + "\n{" +
                "Faculty ID    = " + getId() + "\n" +
                "Name          = " + getFirstName() + ' ' + getLastName() + "\n" +
                "Email Address = " + getEmailAddress() + '\n' +
                "Created On    = " + getEnrolDate() + "\n" +
                "Last Access   = " + getLastAccess() + "\n" +
                getSchoolDescription() + "\n" +
                "Office        = " + getOffice() + "\n" +
                phone_number + " " + getExtension() + "\n" +
                '}';
    }
}
