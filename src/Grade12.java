import java.util.ArrayList;

public class Grade12 extends PublicHighSchool
{
    public ArrayList<Student> students = new ArrayList<>();

    Grade12()
    {
    }

    public void addStudent(Student student)
    {
        this.students.add(student);
    }

    public void finalExamWaivers()
    {
        for (Student student : this.students)
        {
            System.out.println(student.name + " can waive up to four final exams per semester if they qualify.");
        }
    }
    public void lunchPriveleges()
    {
        for (Student student : this.students)
        {
            System.out.println(student.name + " may leave campus from 12:35 to 1:15.");
        }
    }
    public void parking()
    {
        for (Student student : this.students)
        {
            System.out.println(student.name + " can park anywhere including senior lot with an appropriate parking permit.");
        }
    }
}