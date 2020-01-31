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
    public void setName(String name)
    {
        this.name = name;
    }

    public void setBirthdate(String bday)
    {
        this.birthdate = bday;
    }

    public void setMathCourse(String mCourse)
    {
        this.mathCourse = mCourse;
    }

    public void setEnglishCourse(String eCourse)
    {
        this.englishCourse = eCourse;
    }

    public void setSocialCourse(String socCourse)
    {
        this.socialCourse = socCourse;
    }

    public void setScienceCourse(String sciCourse)
    {
        this.scienceCourse = sciCourse;
    }


    // toString Method
    public void studentToString()
    {
        System.out.println(this.name + "'s Student Info");
        System.out.println("Birthday: " + this.birthdate);
        System.out.println("Math Course: " + this.mathCourse);
        System.out.println("English Course: " + this.englishCourse);
        System.out.println("Social Course: " + this.socialCourse);
        System.out.println("Science Course: " + this.scienceCourse);
    }
}