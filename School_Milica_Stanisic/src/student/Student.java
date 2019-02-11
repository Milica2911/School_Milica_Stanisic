package student;

import course.Course;
import computer.Computer;

public class Student {

    private String firstName,lastName;
    private int yearOfBirth;
    private Course course;
    private Computer computer;
    
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setYearOfBirth(int newYearOfBirth) {
        this.yearOfBirth = newYearOfBirth;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }
    
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
    
    public Course getCourse() {
        return this.course;
    }
    
    public Computer getComputer(){
        return this.computer;
    }
    
    public Student() {
        this.firstName = "Milica";
        this.lastName = "Stanišić";
        this.yearOfBirth = 1991;
        this.course = new Course();
        this.computer = new Computer();
    }
        
    public Student(String newFirstName, String newLastName, int newYearOfBirth) {
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.yearOfBirth = newYearOfBirth;
    }
    
    public void studentInfo(){
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Year of birth: " + this.yearOfBirth);        
    }
}
