public class Main
{
    public static void main(String[] args)
    {
        // Creating Grade Level Objects.
        Grade9 grade9 = new Grade9();
        Grade10 grade10 = new Grade10();
        Grade11 grade11 = new Grade11();
        Grade12 grade12 = new Grade12();

        // Creating Student Objects
        Student student1 = new Student("Ethan Burd", "March 16th 2002", "AP Calc AB" ,"Eng IV", "AP Econ", "APES");
        Student student2 = new Student("Jackson Baker", "December 9th 2002", "AP Stats" ,"AP Eng III", "OnRamps US Hist", "APES");
        Student student3 = new Student("Juna Devereux", "June 15th 2004", "Pre-AP Alg 2", "AP Eng", "AP Hist", "Anatomy");
        Student student4 = new Student("Emmett Peters", "May 22nd 2005", "Alg 1", "AP Eng", "Pre-AP Hist", "Chemistry");

        // Adding Student Objects to Grade Level Objects
        grade9.addStudent(student4);
        grade10.addStudent(student3);
        grade11.addStudent(student2);
        grade12.addStudent(student1);

        // Demonstrating the Student Getters and Setters
        System.out.println("Emmett Peter's ORIGINAL History - " + student4.getSocialCourse());
        student4.setSocialCourse("Pre-AP World Geo");
        System.out.println("Emmett Peter's NEW History - " + student4.getSocialCourse());
        System.out.println("\n");

        // Demonstrating the Student to String Method
        student1.studentToString();
        System.out.println();
        student2.studentToString();
        System.out.println();
        student3.studentToString();
        System.out.println();
        student4.studentToString();
        System.out.println("\n");

        // Demonstrating Grade Level Methods
        grade9.finalExamWaivers();
        grade10.parking();
        grade11.lunchPriveleges();
        grade11.finalExamWaivers();
        grade12.finalExamWaivers();
        grade12.parking();
        grade12.lunchPriveleges();
    }
}
