package main;

import student.Student;
import course.Course;
import computer.Computer;

public class Main {

    public static void main(String[] args) {

        Student milica = new Student();
        milica.setFirstName("Milica");
        milica.setLastName("Stanisic");
        milica.setYearOfBirth(1991);

        Course qaCourse = new Course();
        qaCourse.setName("Software QA");
        qaCourse.setNumberOfClasses(32);

        Computer qaPC = new Computer();
        qaPC.setHardDrive(500);
        qaPC.setMemory(16.0f);
        qaPC.setProcessTact(2.4f);

        milica.setCourse(qaCourse);
        milica.setComputer(qaPC);
        
        milica.studentInfo();
        milica.getCourse().courseInfo();
        milica.getComputer().compInfo();
        
        
    /*    Student aca = new Student();
        aca.setFirstName("Aleksandar");
        aca.setLastName("Bukvic");
        aca.setYearOfBirth(1990);

        Course JCourse = new Course();
        JCourse.setName("JAVA");
        JCourse.setNumberOfClasses(52);

        Computer JPC = new Computer();
        JPC.setHardDrive(600);
        JPC.setMemory(18.0f);
        JPC.setProcessTact(3.4f);

        aca.setCourse(qaCourse);
        aca.setComputer(qaPC);
        
        aca.studentInfo();
        aca.getCourse().courseInfo();
        aca.getComputer().compInfo();
    */
    
    }

}
