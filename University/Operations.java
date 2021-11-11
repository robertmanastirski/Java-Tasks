
import java.util.ArrayList;
import java.util.Scanner;

public class Operations {
    Student selected;
    Specialty selectedSpecialty;
    ArrayList<Student> studentsList;
    Scanner sc = new Scanner(System.in);
    
    //Metods that handle student operations
    public Boolean selectStudent()
    {
        int selectedStudent = 0;
        
        try{
            System.out.println("Students: ");
            for (Student s : studentsList ) {
                System.out.println(studentsList.indexOf(s) + 1 + ": " + "Name: " + s.getName());
            }
            do {
                System.out.print("Please select a student: ");
                selectedStudent = sc.nextInt();
            } while (selectedStudent < 1 || selectedStudent > studentsList.size());

            findStudent(selectedStudent);
        }catch(NullPointerException e)
        {
            System.out.println("There sre currently no students in the system.");
            return false;
        }
        return true;
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
        //selectedSpecialty.setSubjects();
    }
    
    public void addStudentToSpecialty()
    {
        
        ArrayList<Subject> electives = new ArrayList<>();
        ArrayList<Subject> electivesToBeAdded = new ArrayList<>();
        ArrayList<Subject> commonSubjects = new ArrayList<>();
        for (Subject s : selectedSpecialty.getElectives() ) {
            electives.add(new Subject(s.getSubjectName()));
        }
        for (Subject s : selectedSpecialty.getCommons() ) {
            commonSubjects.add(new Subject(s.getSubjectName()));
        }
        
        String studentName = "";
        int facultyNumber = 0;
        
        do {
            if (studentName.isEmpty()) {
                System.out.println("Input the student name: ");
                studentName = sc.nextLine();
            }
            if (facultyNumber < 1) {
                System.out.println("Input the faculty number: ");
                facultyNumber = sc.nextInt();
                sc.nextLine();
            }
            
        } while (studentName.isEmpty() || facultyNumber < 1);
        
        System.out.println("List of electives: ");
        for (Subject s : electives ) {
            System.out.println(electives.indexOf(s) + 1 + ": " + s.getSubjectName());
        }
        int selection;
        boolean foundMatch = false;
        do {
            do {
                System.out.println("Please select an elective to add to the student: ");
                selection = sc.nextInt();
                sc.nextLine();
                if (selection > 1 || selection < electives.size()) {
                    if (!electivesToBeAdded.isEmpty()) {
                        for (Subject s : electivesToBeAdded) {
                            if (s.getSubjectName().equals(electives.get(selection - 1).getSubjectName())) {
                                foundMatch = true;
                                break;
                            }
                        }
                        if (!foundMatch) {
                            electivesToBeAdded.add(electives.get(selection - 1));
                        }else
                        {
                            System.out.println("Elective already added.");
                        }
                    }else
                    {
                        electivesToBeAdded.add(electives.get(selection - 1));
                    }
                }
                
            } while (selection < 1 || selection > electives.size());
            System.out.println("Input Y if you want to add another elective: ");
            foundMatch = false;
            
        } while (sc.nextLine().equals("Y"));
        selectedSpecialty.addStudent(studentName, facultyNumber, electivesToBeAdded, commonSubjects);
    }
    public void printSpeciltyInfo()
    {
        selectedSpecialty.printInfo();
    }
    public void getStudentsBySubject()
    {
        int selection = 0;
        ArrayList<Subject> allSubjects = selectedSpecialty.getSubjects();
        
        for (Subject s : allSubjects) {
            System.out.println(allSubjects.indexOf(s) + 1 + ": " + s.getSubjectName());
        }
        
        do {
            System.out.print("Please select a subject: ");
            selection = sc.nextInt();
        } while (selection < 0 || selection > allSubjects.size());
        
        for (Student s : selectedSpecialty.getStudentsBySubject(allSubjects.get(selection - 1))) {
            System.out.println(s.getName());
        }
    }
    public void getAvgScore()
    {
        int selection, count = 0;
        double average = 0;
        
        ArrayList<Subject> allSubjects = selectedSpecialty.getSubjects();
        //ArrayList<Student> allStudents = selectedSpecialty.getStudents();
        Subject selectedSubj;
        if (!allSubjects.isEmpty()) {
            for (Subject s : allSubjects) {
                System.out.println(allSubjects.indexOf(s) + 1 + ": " + s.getSubjectName());
            }
            do {
                System.out.println("Select a subject to see the average score: ");
                selection = sc.nextInt();
            } while (selection < 1 || selection > allSubjects.size());
            
            
            selectedSubj = allSubjects.get(selection - 1);
            Boolean checkGrades = false;
            for (int i : selectedSpecialty.GetAvgScore(selectedSubj)) {
                if (i == 0) {
                    checkGrades = true;
                    break;
                }
            }
            if (!checkGrades) {
                for (int grade : selectedSpecialty.GetAvgScore(selectedSubj) ) {
                    average += grade;
                    count++;
                }
                average /= count;
                System.out.println("Students average grade is: " + average);
            }else
            {
                System.out.println("Please input grades for all students in the selected specialty.");
            }
            
        }else
        {
            System.out.println("Please add students to the specialty.");
        }
        
    }
}