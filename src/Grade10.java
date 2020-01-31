import java.util.ArrayList;

public class Grade10 extends PublicHighSchool
{
    public ArrayList<Student> students = new ArrayList<>();

    Grade10()
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
            System.out.println(student.name + " cannot waive any final exams.");
        }
    }
    public void lunchPriveleges()
    {
        for (Student student : this.students)
        {
            System.out.println(student.name + " must stay on campus from 12:35 to 1:15.");
        }
    }
    public void parking()
    {
        for (Student student : this.students)
        {
            System.out.println(student.name + " can park anywhere but the senior lot with an appropriate parking permit.");
        }
    }
}