
import java.util.ArrayList;

public class Specialty {
    private String Name;
    private int courseYear;
    private ArrayList<Subject> commonSubjects = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    
    public Specialty(String name, int courseYear)
    {
        this.Name = name;
        this.courseYear = courseYear;
    }
    public String getName()
    {
        return Name;
    }
    public int getCourseYear()
    {
        return courseYear;
    }
    public void setSubjects()
    {
          commonSubjects.add(new Subject("Programming with Java"));
          commonSubjects.add(new Subject("Linear Algebra"));
          commonSubjects.add(new Subject("Programming with C#"));
    }
    
    public void addStudent(String studentName, int facultyNumber, ArrayList<Subject> electives)
    {
        students.add(new Student(studentName, facultyNumber, commonSubjects, electives));
        
    }
    public ArrayList<Student> getStudents()
    {
        return students;
    }
}
