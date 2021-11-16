import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    Scanner sc = new Scanner(System.in);
    Operations op = new Operations();
    
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
    public void selectFirstOption(ArrayList<Specialty> specialtyList, int selectedSpecialty)
    {
        int selectedOption = 0;
        System.out.println("1: Get information about a student in the specialty");               
        System.out.println("2: Get information about the specialty");
        System.out.println("3: Get information about the library");
        do {
            System.out.print("Please select an option: ");
            selectedOption = sc.nextInt();
            
        } while (selectedOption < 1 || selectedOption > 4);
        
        switch(selectedOption)
        {
            case 1: if (op.selectStudent()) {
                        selectStudentOption(specialtyList,selectedSpecialty);
                    }
                    selectFirstOption(specialtyList, selectedSpecialty);
                    break;
            case 2: selectSpecialtyOption(specialtyList, selectedSpecialty); break;
            case 3: op.initialiseBooks();
                    selectLibraryOption(specialtyList,selectedSpecialty); break;
        }
    }

    public void selectStudentOption(ArrayList<Specialty> specialtyList, int selectedSpecialty)
    {
        int selection = 0;
        System.out.println("1: Add a grade for a subject.");
        System.out.println("2: How many subject is the student in.");
        System.out.println("3: List of the subjects that the student is in.");
        System.out.println("4: Check a grade for a subject");
        System.out.println("5: Average grade for the student");
        System.out.println("6: Information about the student");
        System.out.println("0: Exit");
        System.out.println("-1: Return to selecting information about a specialty or a student");
        do {
            System.out.print("Please select an option: ");
            selection = sc.nextInt();
        } while (selection < -1 || selection > 6);
        
        switch(selection)
        {
            case 1: op.addSubjectAndGrade();
                    pressAnyKeyToContinue();
                    selectStudentOption(specialtyList,selectedSpecialty);
                    break;
            case 2: op.subjectCount();
                    pressAnyKeyToContinue();
                    selectStudentOption(specialtyList,selectedSpecialty);
                    break;
            case 3: op.listOfSubjects();
                    pressAnyKeyToContinue();
                    selectStudentOption(specialtyList,selectedSpecialty);
                    break;
            case 4: op.subjectGrade();
                    pressAnyKeyToContinue();
                    selectStudentOption(specialtyList,selectedSpecialty);
                    break;
            case 5: op.averageScore();
                    pressAnyKeyToContinue();
                    selectStudentOption(specialtyList,selectedSpecialty);
                    break;
            case 6: op.getInfo();
                    pressAnyKeyToContinue();
                    selectStudentOption(specialtyList,selectedSpecialty);
                    break;
            case 0: System.exit(0); break;
            case -1: selectFirstOption(specialtyList, selectedSpecialty); break;
        
        }
    }
    public void selectSpecialty(ArrayList<Specialty> specialtyList)
    {
        int selectedSpecialty = 0;
        
        System.out.println("Specialties: ");
        for (Specialty s : specialtyList ) {
            System.out.println(specialtyList.indexOf(s) + 1 + ": " +"Specialty Name: " + s.getName() + ", Course Year: " + s.getCourseYear());
        }
        do {
            System.out.print("Please select a specialty: ");
            selectedSpecialty = sc.nextInt();
        } while (selectedSpecialty < 1 || selectedSpecialty > specialtyList.size());
        
        selectFirstOption(specialtyList, selectedSpecialty);
    }
    public void selectSpecialtyOption(ArrayList<Specialty> specialtyList, int selectedSpecialty)
    {
        int selection = 0;
        System.out.println("1: Add student to specialty.");
        System.out.println("2: View specialty information");
        System.out.println("3: View students by subject");
        System.out.println("4: View average score for a subject");
        System.out.println("5: View avreage score for the specialty");
        System.out.println("6: View the best students");
        System.out.println("0: Exit");
        System.out.println("-1: Return to selecting information about a specialty or a student");
        do {
            System.out.print("Please select an option: ");
            selection = sc.nextInt();
            sc.nextLine();
        } while (selection < -1 || selection > 6);
        
        op.findSpecialty(specialtyList, selectedSpecialty);
        switch(selection)
        {
            case 1: op.addStudentToSpecialty();
                    pressAnyKeyToContinue();
                    selectSpecialtyOption(specialtyList, selectedSpecialty);
                    break;
            case 2: op.printSpeciltyInfo();
                    pressAnyKeyToContinue();
                    selectSpecialtyOption(specialtyList, selectedSpecialty);
                    break;
            case 3: op.getStudentsBySubject();
                    pressAnyKeyToContinue();
                    selectSpecialtyOption(specialtyList, selectedSpecialty);
                    break;
            case 4: op.getAvgScore();
                    pressAnyKeyToContinue();
                    selectSpecialtyOption(specialtyList, selectedSpecialty);
                    break;
            case 5: op.getAvgScoreSpecialty();
                    pressAnyKeyToContinue();
                    selectSpecialtyOption(specialtyList, selectedSpecialty);
                    break;      
                    
            case 6: op.studentAvgScoreSort();
                    pressAnyKeyToContinue();
                    selectSpecialtyOption(specialtyList, selectedSpecialty);
                    break; 
                    
            case 0: System.exit(0); break;
            case -1: selectFirstOption(specialtyList, selectedSpecialty); break;
        
        }
    
    }
    public void selectLibraryOption(ArrayList<Specialty> specialtyList, int selectedSpecialty)
    {
        int selection = 0;
        System.out.println("1: Show the available books.");
        System.out.println("2: Add a book to the library.");
        System.out.println("3: Borrow a book from the library.");
        System.out.println("4: Return a book.");
        System.out.println("5: Show books with quantity is 1 or lower.");
        System.out.println("6: Show books sorted by popularity");
        System.out.println("7: List of all books borrowed by a student");
        System.out.println("8: List of all books that were not returned in time");
        System.out.println("0: Exit");
        System.out.println("-1: Return to selecting information about a specialty or a student");
        do {
            System.out.print("Please select an option: ");
            selection = sc.nextInt();
        } while (selection < -1 || selection > 8);
        
        switch(selection)
        {
            case 1: op.showBooks();
                    pressAnyKeyToContinue();
                    selectLibraryOption(specialtyList, selectedSpecialty);
                    break;
            case 2: op.addNewBook();
                    pressAnyKeyToContinue();
                    selectLibraryOption(specialtyList, selectedSpecialty);
                    break;
            case 3: op.findSpecialty(specialtyList, selectedSpecialty);
                    op.borrowBook();
                    pressAnyKeyToContinue();
                    selectLibraryOption(specialtyList, selectedSpecialty);
                    break;
            case 4: op.findSpecialty(specialtyList, selectedSpecialty);
                    op.returnBook();
                    pressAnyKeyToContinue();
                    selectLibraryOption(specialtyList, selectedSpecialty);
                    break;
            case 5: op.showLowerThanOne();
                    pressAnyKeyToContinue();
                    selectLibraryOption(specialtyList, selectedSpecialty);
                    break;
            case 6: op.sortPopularity();
                    pressAnyKeyToContinue();
                    selectLibraryOption(specialtyList, selectedSpecialty);
                    break;
            case 7: op.sortBooksByStudent();
                    pressAnyKeyToContinue();
                    selectLibraryOption(specialtyList, selectedSpecialty);
                    break;
            case 8: //TODO
                    pressAnyKeyToContinue();
                    selectLibraryOption(specialtyList, selectedSpecialty);
                    break;
            case 0: System.exit(0); break;
            case -1: selectFirstOption(specialtyList, selectedSpecialty); break;
        
        }
    }
}
