package webd4201.sturchflintn;

import java.util.Date;
import java.util.Vector;

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
     * @param id
     * @param password
     * @param firstName
     * @param lastName
     * @param emailAddress
     * @param lastAccess
     * @param enrolDate
     * @param enabled
     * @param type
     */
    public Student(long id, String password, String firstName, String lastName, String emailAddress, Date lastAccess, Date enrolDate, boolean enabled, char type, String programCode, String programDescription, int year, Vector<Mark> marks)
    {
        super(id, password, firstName, lastName, emailAddress, lastAccess, enrolDate, enabled, type);
        this.programCode = programCode;
        this.programDescription = programDescription;
        this.year = year;
        this.marks = marks;
    }

    /**
     * Default Constructor
     */
    public Student(String programCode, String programDescription, int year, Vector<Mark> marks)
    {
        super();
        this.programCode = programCode;
        this.programDescription = programDescription;
        this.year = year;
        this.marks = marks;
    }

    //ACCESSORS
    //Getters

    public String getProgramCode()
    {
        return programCode;
    }

    public String getProgramDescription()
    {
        return programDescription;
    }

    public int getYear()
    {
        return year;
    }

    public Vector<Mark> getMarks()
    {
        return marks;
    }

    //Setters

    public void setProgramCode(String programCode)
    {
        this.programCode = programCode;
    }

    public void setProgramDescription(String programDescription)
    {
        this.programDescription = programDescription;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setMarks(Vector<Mark> marks)
    {
        this.marks = marks;
    }

    //METHODS

}
