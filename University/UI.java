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
    public void selectFirstOption()
    {
        int selectedOption = 0;
        System.out.println("1: Select a specialty");               
        System.out.println("2: Get information about the library");
        System.out.println("0: Exit");
        do {
            System.out.print("Please select an option: ");
            selectedOption = sc.nextInt();
            
        } while (selectedOption < 0 || selectedOption > 2);
        switch (selectedOption) 
        {
            case 1: int selectedSpecialty = op.listSpecialties();
                    op.findSpecialty(selectedSpecialty);
                    selectSecondOption(selectedSpecialty);
            case 2: op.initialiseBooks();
                    selectLibraryOption(); break;
            case 0: System.exit(0); break;
        } 
    }
    public void selectSecondOption(int selectedSpecialty)
    {
        int selectedOption = 0;
        System.out.println("1: Get information about a student in the specialty");               
        System.out.println("2: Get information about the specialty");
        System.out.println("-1: Get information about the specialty");
        do {
            System.out.print("Please select an option: ");
            selectedOption = sc.nextInt();
            
        } while (selectedOption < -1 || selectedOption > 2);
        
        switch(selectedOption)
        {
            case 1: op.findSpecialty(selectedSpecialty);
                    if (op.selectStudent()) {
                        selectStudentOption(selectedSpecialty);
                    }
                    selectSecondOption(selectedSpecialty);
                    break;
            case 2: selectSpecialtyOption(selectedSpecialty); break;
            case 0: System.exit(0); break;
            case -1: selectFirstOption(); break;
        }
    }

    public void selectStudentOption(int selectedSpecialty)
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
                    selectStudentOption(selectedSpecialty);
                    break;
            case 2: op.subjectCount();
                    pressAnyKeyToContinue();
                    selectStudentOption(selectedSpecialty);
                    break;
            case 3: op.listOfSubjects();
                    pressAnyKeyToContinue();
                    selectStudentOption(selectedSpecialty);
                    break;
            case 4: op.subjectGrade();
                    pressAnyKeyToContinue();
                    selectStudentOption(selectedSpecialty);
                    break;
            case 5: op.averageScore();
                    pressAnyKeyToContinue();
                    selectStudentOption(selectedSpecialty);
                    break;
            case 6: op.getInfo();
                    pressAnyKeyToContinue();
                    selectStudentOption(selectedSpecialty);
                    break;
            case 0: System.exit(0); break;
            case -1: selectSecondOption(selectedSpecialty); break;
        
        }
    }
    public void selectSpecialtyOption(int selectedSpecialty)
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
        
        switch(selection)
        {
            case 1: op.addStudentToSpecialty();
                    pressAnyKeyToContinue();
                    selectSpecialtyOption(selectedSpecialty);
                    break;
            case 2: op.printSpeciltyInfo();
                    pressAnyKeyToContinue();
                    selectSpecialtyOption(selectedSpecialty);
                    break;
            case 3: op.getStudentsBySubject();
                    pressAnyKeyToContinue();
                    selectSpecialtyOption(selectedSpecialty);
                    break;
            case 4: op.getAvgScore();
                    pressAnyKeyToContinue();
                    selectSpecialtyOption(selectedSpecialty);
                    break;
            case 5: op.getAvgScoreSpecialty();
                    pressAnyKeyToContinue();
                    selectSpecialtyOption(selectedSpecialty);
                    break;      
                    
            case 6: op.studentAvgScoreSort();
                    pressAnyKeyToContinue();
                    selectSpecialtyOption(selectedSpecialty);
                    break; 
                    
            case 0: System.exit(0); break;
            case -1: selectSecondOption(selectedSpecialty); break;
        
        }
    
    }
    public void selectLibraryOption()
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
        System.out.println("-1: Return to selecting a specialty");
        do {
            System.out.print("Please select an option: ");
            selection = sc.nextInt();
        } while (selection < -1 || selection > 8);
        
        switch(selection)
        {
            case 1: op.showBooks();
                    pressAnyKeyToContinue();
                    selectLibraryOption();
                    break;
            case 2: op.addNewBook();
                    pressAnyKeyToContinue();
                    selectLibraryOption();
                    break;
            case 3: op.getStudetFromAllSpecialties();
                    op.borrowBook();
                    pressAnyKeyToContinue();
                    selectLibraryOption();
                    break;
            case 4: op.getStudetFromAllSpecialties();
                    op.returnBook();
                    pressAnyKeyToContinue();
                    selectLibraryOption();
                    break;
            case 5: op.showLowerThanOne();
                    pressAnyKeyToContinue();
                    selectLibraryOption();
                    break;
            case 6: op.sortPopularity();
                    pressAnyKeyToContinue();
                    selectLibraryOption();
                    break;
            case 7: op.sortBooksByStudent();
                    pressAnyKeyToContinue();
                    selectLibraryOption();
                    break;
            case 8: op.booksLateForReturn();
                    pressAnyKeyToContinue();
                    selectLibraryOption();
                    break;
            case 0: System.exit(0); break;
            case -1: selectFirstOption(); break;
        
        }
    }
}
