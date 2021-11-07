import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Student {
    private String studentName;
    private int facultyNumber;
    //private ArrayList<Subject> electives;
    //private ArrayList<Subject> commonSubjects;
    private ArrayList<Subject> allSubjects = new ArrayList<>();
    
    public Student(String studentName, int facultyNumber, ArrayList<Subject> commonSubjects, ArrayList<Subject> electives)
    {
        this.studentName = studentName;
        this.facultyNumber = facultyNumber;
        allSubjects.addAll(commonSubjects);
        allSubjects.addAll(electives);
    }
    public int showSubjects()
    {
        for (Subject s : allSubjects ) {
            System.out.println(allSubjects.indexOf(s) + 1 + ": " + s.getSubjectName());
        }
        return allSubjects.size();
    }
    public void addSubjectGrade(int selectedSubject, int grade)
    {
        allSubjects.get(selectedSubject - 1).setGrade(grade);
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
        return allSubjects.size();
    }
    public ArrayList<Subject> getListOfsubjects()
    {
        return allSubjects;
    }
    public ArrayList<Integer> getGrades()
    {
        ArrayList<Integer> listOfGrades = new ArrayList<>();
        for (Subject s : allSubjects) {
            listOfGrades.add(s.getGrade());
        }
        return listOfGrades;
    }

}
