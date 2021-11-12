
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentAvgScore {
    public int place;
    public Student student;
    public double avgScore;
    
    public StudentAvgScore(Student student, double avgScore)
    {
       //this.place = place;
       this.student = student;
       this.avgScore = avgScore;
    }
    public Double getAvgScore()
    {
        return avgScore;
    }
    public String getName()
    {
        return student.getName();
    }
    public int getPosition()
    {
        return place;
    }
    public void setPosition(int position)
    {
        this.place = position;
    }
    public void sort(ArrayList<StudentAvgScore> listToSort)
    {
       Collections.sort(listToSort, new Comparator<StudentAvgScore>() {
            @Override
            public int compare(StudentAvgScore o1, StudentAvgScore o2) {
                if (o1.getAvgScore().equals(o2.getAvgScore())) {
                    return o1.getName().compareTo(o2.getName());
                }
                return o2.getAvgScore().compareTo(o1.getAvgScore());
            }
			
        });
        
    }
    
}
