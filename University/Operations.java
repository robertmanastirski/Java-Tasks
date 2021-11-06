
import java.util.ArrayList;
import java.util.Scanner;

public class Operations {
    Student selected;
    Specialty selectedSpecialty;
    ArrayList<Student> studentsList;
    Scanner sc = new Scanner(System.in);
    
    //Metods that handle student operations
    public void selectStudent()
    {
        int selectedStudent = 0;
        
        System.out.println("Students: ");
        for (Student s : studentsList ) {
            System.out.println(studentsList.indexOf(s) + 1 + ": " + "Name: " + s.getName());
        }
        do {
            System.out.print("Please select a student: ");
            selectedStudent = sc.nextInt();
        } while (selectedStudent < 1 || selectedStudent > studentsList.size());
        
        findStudent(selectedStudent);
    }
    public void findStudent(int selectedStudent)
    {
        selected = studentsList.get(selectedStudent - 1);
    }
    public void addSubjectAndGrade()
    {
        int grade, selectedSubject;
        int subjectLength = selected.showSubjects();
        do {
            System.out.println("Select the subject: ");
            selectedSubject = sc.nextInt();
            
            System.out.println("Input the grade: ");
            grade = sc.nextInt();
        } while (selectedSubject < 0 || selectedSubject > subjectLength || grade < 2 || grade > 6);
        
        selected.addSubjectGrade(selectedSubject, grade);
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
        int count = 0;
        ArrayList<Integer> grades = selected.getGrades();
        for (int grade : grades ) {
            if (grade != 0) {
                average += grade;
                count++;
            }
        }
        average /= count;
        System.out.println("Students average grade is: " + average);
    }
    public void getInfo()
    {
        System.out.println("Students name is: " + selected.getName());
        System.out.println("Students faculty number is: " + selected.getFacultyNumber());
    }
    
    
    //Methods that handle specialty operations
    public void findSpecialty(ArrayList<Specialty> specilatyList, int specialtySelection)
    {
        selectedSpecialty = specilatyList.get(specialtySelection - 1);
        studentsList = selectedSpecialty.getStudents();
    }
    
    public void addStudentToSpecialty()
    {
        selectedSpecialty.setSubjects();
        ArrayList<Subject> electives = new ArrayList<>();
        
        String studentName = "", currentElective = "";
        int facultyNumber = 0;
        
        do {
            if (studentName.isEmpty()) {
                System.out.println("Input the student name: ");
                studentName = sc.nextLine();
            }
            if (facultyNumber < 1) {
                System.out.println("Input the faculty number name: ");
                facultyNumber = sc.nextInt();
                sc.nextLine();
            }
            
        } while (studentName.isEmpty() || facultyNumber < 1);
        
        do {
            System.out.print("Input the elective name: ");
            currentElective = sc.nextLine();
            if (!currentElective.isEmpty()) {
                System.out.println("Elective added.: ");
                electives.add(new Subject(currentElective));
            }
            System.out.println("Input Y if you want to add another elective: ");
            
        } while (!currentElective.isEmpty() && sc.nextLine().equals("Y"));
        
        selectedSpecialty.addStudent(studentName, facultyNumber, electives);  
    }
    
}
