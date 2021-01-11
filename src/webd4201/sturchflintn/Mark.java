package webd4201.sturchflintn;

import java.text.DecimalFormat;

/**
 * @author Nick Sturch-Flint - 100303769
 * @author Nick Sturch-Flint
 * @version 1.0 (Janaury 11th, 2021)
 */
public class Mark
{
    //CONSTANTS
    public static final float MINIMUM_GPA = 0.0f;
    public static final float MAXIMUM_GPA = 5.0f;
    String pattern = "0#.##"; //sets the format for Decimals
    DecimalFormat GPA = new DecimalFormat(pattern);

    //VARIABLES
    private String courseCode;
    private String courseName;
    private int result;
    private float gpaWeighting;

    //CONSTRUCTORS
    /**
     *
     * @param courseCode
     * @param courseName
     * @param result
     * @param gpaWeighting
     */
    public Mark(String courseCode, String courseName, int result, float gpaWeighting)
    {
        setCourseCode(courseCode);
        setCourseName(courseName);
        setResult(result);
        setGpaWeighting(gpaWeighting);
    }

    /**
     * DEFAULT CONSTRUCTOR
     */
    public Mark()
    {
        this.courseCode = "00000";
        this.courseName = "DEFAULT";
        this.result = 0;
        this.gpaWeighting = 0.0f;
    }

    //ACCESSORS
    //Getters

    /**
     *
     * @return
     */
    public String getCourseCode()
    {
        return courseCode;
    }

    /**
     *
     * @return
     */
    public String getCourseName()
    {
        return courseName;
    }

    /**
     *
     * @return
     */
    public int getResult()
    {
        return result;
    }

    /**
     *
     * @return
     */
    public float getGpaWeighting()
    {
        return gpaWeighting;
    }

    //Setters

    /**
     *
     * @param courseCode
     */
    public void setCourseCode(String courseCode)
    {
        this.courseCode = courseCode;
    }

    /**
     *
     * @param courseName
     */
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    /**
     *
     * @param result
     */
    public void setResult(int result)
    {
        this.result = result;
    }

    /**
     *
     * @param gpaWeighting
     */
    public void setGpaWeighting(float gpaWeighting)
    {
        this.gpaWeighting = gpaWeighting;
    }

    //METHODS

    @Override
    public String toString() {
        return  String.format("%-20", getCourseCode()) +
                String.format("%-50", getCourseName()) +
                String.format("%-15", getResult()) +
                String.format("%-15", getGpaWeighting());
    }
}
