package DCSIT.system;

import java.util.ArrayList;
import java.util.List;

public class Student {

    String name, ID; //add other attributes later
    List<Grade> grades= new ArrayList<>();
    int numberOfEnrolledCourses;
    
    Student(String x){
        name = x;
        this.numberOfEnrolledCourses =0 ;
       // this.grades 
    }

    public void enrollCourse(Course c){
        c.addStudent(this);
        numberOfEnrolledCourses ++;
    }

    public boolean isPartTime(){
        return numberOfEnrolledCourses <= 2;
    }

    public boolean isOnProbation(){
        double sum = 0;
        for(int i = 0; i < grades.size(); i++){
            sum =sum +grades.get(i).score;
        }
        double avg = sum/grades.size();
        return avg < 60;
    }
}
