package DCSIT.system;

public class Instructor {

    int instructorType; // 0=PT, 1=FT, 2=Prof
    String name; // other attributes
    int numberOfAssignedCourses;

    Instructor(String name, int type){
        this.name = name;
        this.instructorType = type;
        this.numberOfAssignedCourses = 0;
    }

    public void assignToCourse(Course c) {
        c.addInstructor(this);
        numberOfAssignedCourses++;
    }

    public double calculateSalary() {
        double salary = 2500 * numberOfAssignedCourses;
        double bonus = 0;
        
        if (instructorType == 1) {
            if (numberOfAssignedCourses > 4)
                bonus = 5000;

        } else if (instructorType == 2) {
            bonus  = (numberOfAssignedCourses - 2) * 1500;
        }

        return salary + bonus;
    }
}
