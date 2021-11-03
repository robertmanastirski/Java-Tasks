import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Student {
    private String studentName;
    private int facultyNumber;
    private LinkedHashMap<Subject, Integer> grades = new LinkedHashMap<>();
    
    public Student(String studentName, int facultyNumber)
    {
        this.studentName = studentName;
        this.facultyNumber = facultyNumber;
    }
    public void addSubjectGrade(String subjectName, int grade)
    {
        grades.put(new Subject(subjectName), grade);
    }
    public String getName()
    {
        return studentName;
    }
    public int getFacultyNumber()
    {
        return facultyNumber;
    }
    public int getSubjectCount()
    {
        return grades.size();
    }
    public ArrayList<Subject> getListOfsubjects()
    {
        ArrayList<Subject> listOfSubjects = new ArrayList<>();
        for (Subject key : grades.keySet() ) {
            listOfSubjects.add(key);
        }
        return listOfSubjects;
    }
    public ArrayList<Integer> getGrades()
    {
        ArrayList<Integer> listOfGrades = new ArrayList<>();
        for (Map.Entry<Subject, Integer> entry : grades.entrySet()) {
            listOfGrades.add(entry.getValue());
        }
        return listOfGrades;
    }
    
}
