public class Student
{
    public String name;
    public String birthdate;
    public String mathCourse;
    public String englishCourse;
    public String socialCourse;
    public String scienceCourse;

    Student(String name, String birthdate, String mathCourse, String englishCourse, String socialCourse, String scienceCourse)
    {
        this.name = name;
        this.birthdate = birthdate;
        this.mathCourse = mathCourse;
        this.englishCourse = englishCourse;
        this.scienceCourse = scienceCourse;
        this.socialCourse = socialCourse;
    }


    // Getters
    public String getName()
    {
        return this.name;
    }

    public String getBirthdate()
    {
        return this.birthdate;
    }

    public String getMathCourse()
    {
        return this.mathCourse;
    }

    public String getEnglishCourse()
    {
        return this.englishCourse;
    }

    public String getScienceCourse()
    {
        return this.scienceCourse;
    }

    public String getSocialCourse()
    {
        return this.socialCourse;
    }


    // Mutators
}
