
import java.util.ArrayList;
import java.util.Scanner;

public class Operations {
    Student selected;
    Scanner sc = new Scanner(System.in);
    public void findStudent(ArrayList<Student> studentsList, int selectedStudent)
    {
        selected = studentsList.get(selectedStudent - 1);
    }
    public void addSubjectAndGrade()
    {
        String subjectName = "";
        int grade;
        do {
            if (subjectName.isEmpty()) {
                System.out.println("Input the subject name: ");
                subjectName = sc.nextLine();
            }
            
            System.out.println("Input the grade: ");
            grade = sc.nextInt();
        } while (subjectName.isEmpty() || grade < 2 || grade > 6);
        
        selected.addSubjectGrade(subjectName, grade);
    }
    public void subjectCount()
    {
        System.out.println("The student is in " + selected.getSubjectCount() + " subjects");
    }
    public void listOfSubjects()
    {
        ArrayList<Subject> subjects = selected.getListOfsubjects();
        System.out.println("Students is enrolled in: ");
        for (Subject s : subjects ) {
            System.out.println(s.getSubjectName());
        }
    }
    public void subjectGrade()
    {
        int selection = 0;
        ArrayList<Subject> subjects = selected.getListOfsubjects();
        for (Subject s : subjects ) {
            System.out.println((subjects.indexOf(s) + 1) + " " + s.getSubjectName());
        }
        do {
            System.out.println("Please select the subject you'd like to see the grade: ");
            selection = sc.nextInt();
        } while (selection < 1 || selection > subjects.size());
        
        ArrayList<Integer> grades = selected.getGrades();
        System.out.println("Students grade for subject " + subjects.get(selection - 1).getSubjectName() + " is: "+ grades.get(selection - 1));
    }
    public void averageScore()
    {
        double average = 0;
        ArrayList<Integer> grades = selected.getGrades();
        for (int grade : grades ) {
            average += grade;
        }
        average /= grades.size();
        System.out.println("Students average grade is: " + average);
    }
    public void getInfo()
    {
        System.out.println("Students name is: " + selected.getName());
        System.out.println("Students faculty number is: " + selected.getFacultyNumber());
    }
    
}
