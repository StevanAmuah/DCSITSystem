package DCSIT.system;

import java.util.ArrayList;
import java.util.List;

public class Course {

	
    List<Student> enrolledStudents;
    List<Instructor> assignedInstructors;
    int minNumberOfStudents, maxNumberOfStudents;
    String code, title;
    
    Course(String code, String title, int minStudents){
        this.code = code;
        this.title = title;
        this.minNumberOfStudents = minStudents;
        this.enrolledStudents = new ArrayList<>();
        this.assignedInstructors = new ArrayList<>();
    }

    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void addInstructor(Instructor instructor) {
        assignedInstructors.add(instructor);
    }
    
    //When the course is cancelled
    public boolean isCancelled(){
        return enrolledStudents.size() <= minNumberOfStudents;
    }

}
