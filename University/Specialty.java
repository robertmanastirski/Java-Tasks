
import java.util.ArrayList;
import java.util.Arrays;

public class Specialty {
    private String Name;
    private int courseYear;
    private ArrayList<Subject> commonSubjects = new ArrayList<>(Arrays.asList(
                                                                new Subject("Programming with Java"),
                                                                new Subject("Linear Algebra"),
                                                                new Subject("Programming with C#") ));
    private ArrayList<Subject> electives = new ArrayList<>(Arrays.asList(
                                                            new Subject("IT Security"),
                                                            new Subject("Programming with JavaScript"),
                                                            new Subject("Android Programming"),
                                                            new Subject("Programming with Python") ));
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
    public void setSubjects(/*ArrayList<Subject> toAddElectives*/)
    {
//        commonSubjects.add(new Subject("Programming with Java"));
//        commonSubjects.add(new Subject("Linear Algebra"));
//        commonSubjects.add(new Subject("Programming with C#"));
//        if (electives.isEmpty()) {
//            electives.add(new Subject("IT Security"));
//            electives.add(new Subject("Programming with JavaScript"));
//            electives.add(new Subject("Android Programming"));
//            electives.add(new Subject("Programming with Python"));
//        }
        
    }
    public ArrayList<Subject> getElectives()
    {
        return electives;
    }
    public ArrayList<Subject> getCommons()
    {
        return commonSubjects;
    }
    
    public ArrayList<Subject> getSubjects()
    {
        if (allSubjects.isEmpty()) {
            allSubjects.addAll(commonSubjects);
            allSubjects.addAll(electives);
        }
        return allSubjects;
    }
    public void addStudent(String studentName, int facultyNumber, ArrayList<Subject> electivesToBeAdded, ArrayList<Subject> commons)
    {
        students.add(new Student(studentName, facultyNumber, commons, electivesToBeAdded));
        
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
            for (String str : s.getSubjectNames() ) {
                if (subject.getSubjectName().contains(str)) {
                    studentsBySubject.add(s);
                }
            }
        }
        return studentsBySubject;
    }
    public ArrayList<Integer> GetAvgScore(Subject subject)
    {
        ArrayList<Integer> grades = new ArrayList<>();
        for (Student s : students ) {
            grades.add(s.getGradeForSubj(subject));
        }
        return grades;
    }
}
