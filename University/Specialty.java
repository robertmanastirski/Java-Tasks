
import java.util.ArrayList;

public class Specialty {
    private String Name;
    private int courseYear;
    private ArrayList<Subject> commonSubjects = new ArrayList<>();
    private ArrayList<Subject> electives = new ArrayList<>();
    private ArrayList<Subject> allSubjects = new ArrayList<>();
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
    public void setSubjects(ArrayList<Subject> electives)
    {
        if (commonSubjects.isEmpty()) {
            commonSubjects.add(new Subject("Programming with Java"));
            commonSubjects.add(new Subject("Linear Algebra"));
            commonSubjects.add(new Subject("Programming with C#"));
        }
        
        for (Subject s : electives ) {
            this.electives.add(s);
        }
        
    }
    public ArrayList<Subject> getSubjects()
    {
        if (allSubjects.isEmpty()) {
            allSubjects.addAll(commonSubjects);
            allSubjects.addAll(electives);
            
        }
        
        return allSubjects;
    }
    public void addStudent(String studentName, int facultyNumber)
    {
        students.add(new Student(studentName, facultyNumber, commonSubjects, electives));
        
    }
    public ArrayList<Student> getStudents()
    {
        return students;
    }
    public void printInfo()
    {
        System.out.println("Common subjects: ");
        for (Subject s : commonSubjects ) {
            System.out.println(s.getSubjectName());
        }
        System.out.println("Elective subjects: ");
        for (Subject s : electives ) {
            System.out.println(s.getSubjectName());
        }
        System.out.println("Students count: " + students.size());
        
    }
    
    public ArrayList<Student> getStudentsBySubject(Subject subject)
    {
        ArrayList<Student> studentsBySubject = new ArrayList<>();
        
        for (Student s : students ) {
            if (s.getListOfsubjects().contains(subject)) {
                studentsBySubject.add(s);
            }
        }
        return studentsBySubject;
    }
}
