
import java.util.ArrayList;


public class University {
    
    private static ArrayList<Student> studentsList = new ArrayList<>();
    public static void loadStudents()
    {
        studentsList.add(new Student("Mark Spencer", 1));
        studentsList.add(new Student("Deborah Newman", 2));
        studentsList.add(new Student("Stacey Addams", 3));
        studentsList.add(new Student("Stacey Addams", 4));
        
    }
    
    public static void main(String[] args) {
        loadStudents();
        UI ui = new UI();
        ui.selectStudent(studentsList);
        
    }
}
