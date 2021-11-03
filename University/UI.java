import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    Scanner sc = new Scanner(System.in);
    private void pressAnyKeyToContinue()
    { 
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    }
    public void selectStudent(ArrayList<Student> studentsList)
    {
        int selectedStudent = 0;
        
        System.out.println("Students: ");
        for (Student s : studentsList ) {
            System.out.println("Name: " + s.getName() + ", Faculty number: " + s.getFacultyNumber());
        }
        do {
            System.out.print("Please select a student by faculty number: ");
            selectedStudent = sc.nextInt();
        } while (selectedStudent < 1 || selectedStudent > studentsList.size());
        
        selectOption(selectedStudent, studentsList);
    }
    public void selectOption(int selectedStudent, ArrayList<Student> studentsList)
    {
        Operations op = new Operations();
        int selection = 0;
        System.out.println("1: Add subject & grade.");
        System.out.println("2: How many subject is the student in.");
        System.out.println("3: List of the subjects that the student is in.");
        System.out.println("4: Check a grade for a subject");
        System.out.println("5: Average grade for the student");
        System.out.println("6: Information about the student");
        System.out.println("0: Exit");
        do {
            System.out.print("Please select an option: ");
            selection = sc.nextInt();
        } while (selection < 0 || selection > 6);
        
        op.findStudent(studentsList, selectedStudent);
        switch(selection)
        {
            case 1: op.addSubjectAndGrade();
                    pressAnyKeyToContinue();
                    selectOption(selectedStudent, studentsList);
                    break;
            case 2: op.subjectCount();
                    pressAnyKeyToContinue();
                    selectOption(selectedStudent, studentsList);
                    break;
            case 3: op.listOfSubjects();
                    pressAnyKeyToContinue();
                    selectOption(selectedStudent, studentsList);
                    break;
            case 4: op.subjectGrade();
                    pressAnyKeyToContinue();
                    selectOption(selectedStudent, studentsList);
                    break;
            case 5: op.averageScore();
                    pressAnyKeyToContinue();
                    selectOption(selectedStudent, studentsList);
                    break;
            case 6: op.getInfo();
                    pressAnyKeyToContinue();
                    selectOption(selectedStudent, studentsList);
                    break;
            case 0: System.exit(0); break;
        
        }
        
        
    }
    
}
