
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Specialty {
    private String Name;
    private int courseYear;
    private ArrayList<Specialty> specialtyList = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    
    public Specialty()
    {
        specialtyList.add(new Specialty("Business Informational Technologies", 1));
        specialtyList.add(new Specialty("Business Informational Technologies", 2));
        specialtyList.add(new Specialty("Business Informational Technologies", 3));
        specialtyList.add(new Specialty("Business Informational Technologies", 4));
        specialtyList.add(new Specialty("Software Engineering", 1));
        specialtyList.add(new Specialty("Software Engineering", 2));
        specialtyList.add(new Specialty("Software Engineering", 3));
        specialtyList.add(new Specialty("Software Engineering", 4));
        
    }
    
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
    public ArrayList<Subject> getElectives()
    {
        return electives;
    }
    public ArrayList<Subject> getCommons()
    {
        return commonSubjects;
    }
    public ArrayList<Specialty> getSpecialties()
    {
        return specialtyList;
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
                if (subject.getSubjectName().equals(str)) {
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
    public ArrayList<ArrayList<Integer>> getAvgScoreSpecialty()
    {
        ArrayList<ArrayList<Integer>> allGrades = new ArrayList<>();
        for (Student s : students ) {
            allGrades.add(s.getGrades());
        }
        return allGrades;
    }
}
