package webd4201.sturchflintn;

import java.util.Date;
import java.util.Vector;

/**
 * Student class extends the user class and acts as the Student user type
 * @author Nick Sturch-Flint - 100303769
 * @version 1.0 (Janaury 8th, 2021)
 * @since January 8th, 2021
 */
public class Student extends User
{
    //CONSTANTS
    public static final String DEFAULT_PROGRAM_CODE = "UNDC";
    public static final String DEFAULT_PROGRAM_DESCRIPTION = "Undeclared";
    public static final int DEFAULT_YEAR = 1;

    //VARIABLES
    private String programCode;
    private String programDescription;
    private int year;
    private Vector<Mark> marks;


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
     * @param programCode
     * @param programDescription
     * @param year
     * @param marks
     */
    public Student(long id, String password, String firstName, String lastName, String emailAddress, Date lastAccess, Date enrolDate, boolean enabled, char type, String programCode, String programDescription, int year, Vector<Mark> marks) throws InvalidNameException, InvalidIdException, InvalidPasswordException, InvalidUserDataException {
        super(id, password, firstName, lastName, emailAddress, lastAccess, enrolDate, enabled, type);
        setProgramCode(programCode);
        setProgramDescription(programDescription);
        setYear(year);
        setMarks(marks);
    }

    /**
     * @param id
     * @param password
     * @param firstName
     * @param lastName
     * @param emailAddress
     * @param lastAccess
     * @param enrolDate
     * @param enabled
     * @param type
     * @param programCode
     * @param programDescription
     * @param year
     */
    public Student(long id, String password, String firstName, String lastName, String emailAddress,
                   Date lastAccess, Date enrolDate, boolean enabled, char type, String programCode,
                   String programDescription, int year) throws InvalidNameException, InvalidIdException, InvalidPasswordException, InvalidUserDataException {
        this(id, password, firstName, lastName, emailAddress, lastAccess, enrolDate,
                enabled, type, programCode, programDescription, year, new Vector<>());
    }

    /**
     * Default Constructor
     */
    public Student() throws InvalidNameException, InvalidIdException, InvalidPasswordException, InvalidUserDataException {
        this(DEFAULT_ID, DEFAULT_PASSWORD, DEFAULT_FIRST_NAME, DEFAULT_LAST_NAME, DEFAULT_EMAIL_ADDRESS,
                new Date(), new Date(), DEFAULT_ENABLED_STATUS, DEFAULT_TYPE,  DEFAULT_PROGRAM_CODE,
                DEFAULT_PROGRAM_DESCRIPTION, DEFAULT_YEAR, new Vector<>());
    }

    //ACCESSORS
    //Getters
    /**
     *
     * @return
     */
    public String getProgramCode()
    {
        return programCode;
    }

    /**
     *
     * @return
     */
    public String getProgramDescription()
    {
        return programDescription;
    }

    /**
     *
     * @return
     */
    public int getYear()
    {
        return year;
    }

    /**
     *
     * @return
     */
    public Vector<Mark> getMarks()
    {
        return marks;
    }

    //Setters
    /**
     *
     * @param programCode
     */
    public void setProgramCode(String programCode)
    {
        this.programCode = programCode;
    }

    /**
     *
     * @param programDescription Sets the Students program description
     */
    public void setProgramDescription(String programDescription)
    {
        this.programDescription = programDescription;
    }

    /**
     *
     * @param year Sets the Students start year
     */
    public void setYear(int year)
    {
        this.year = year;
    }

    /**
     *
     * @param marks Sets the Students Mark
     */
    public void setMarks(Vector<Mark> marks)
    {
        this.marks = marks;
    }

    //METHODS
    /**
     *
     * @return String
     */
    @Override
    public String getTypeForDisplay()
    {
        return "Student";
    }

    /**
     *
     * @return String
     */
    @Override
    public String toString()
    {
        return  getTypeForDisplay() + "\n{" +
                getFirstName() + " " + getLastName() + "(" + getId() + ")" + "\n" +
                "Currently in " + getYear() + " year of " + getProgramDescription() + " " + getProgramCode() + "\n" +
                "Enrolled: " + getEnrolDate() +
                '}';
    }
}
