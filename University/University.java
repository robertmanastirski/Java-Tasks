
import java.util.ArrayList;


public class University {
    
    private static ArrayList<Specialty> specialtyList = new ArrayList<>();
    
    public static void loadSpecialty()
    {
        specialtyList.add(new Specialty("Business Informational Technologies", 1));
        specialtyList.add(new Specialty("Business Informational Technologies", 2));
        specialtyList.add(new Specialty("Business Informational Technologies", 3));
        specialtyList.add(new Specialty("Business Informational Technologies", 4));
        specialtyList.add(new Specialty("Software Engineering", 1));
        specialtyList.add(new Specialty("Software Engineering", 2));
        specialtyList.add(new Specialty("Software Engineering", 3));
        specialtyList.add(new Specialty("Software Engineering", 4));
        specialtyList.add(new Specialty("Informatics", 1));
        specialtyList.add(new Specialty("Informatics", 2));
        specialtyList.add(new Specialty("Informatics", 3));
        specialtyList.add(new Specialty("Informatics", 4));
        
    }
    public static void main(String[] args) {
        loadSpecialty();
        UI ui = new UI();
        ui.selectSpecialty(specialtyList);
    }
}
