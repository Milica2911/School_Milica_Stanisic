package course;

public class Course {
    
    private String name, codeName;
    private int numberOfClasses;
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setNumberOfClasses(int numberOfClasses){
        this.numberOfClasses = numberOfClasses;
    }
    
    public void setCodeName(String codeName){
        this.codeName = codeName;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getNumberOfClasses(){
        return this.numberOfClasses;
    }
    
    public String getCodeName(){
        return this.codeName;
    }
    
    public Course(){
        this("Software QA", "qa", 32);
    }
    
    public Course(String newName,String newCodeName,int newNumberOfClasses){
        this.name = newName;
        this.codeName = newCodeName;
        this.numberOfClasses = newNumberOfClasses;
    }
    
    public void courseInfo(){
        System.out.println("Course name: " + this.name);
        System.out.println("Course number of classes: " + this.numberOfClasses);
    }
    
}