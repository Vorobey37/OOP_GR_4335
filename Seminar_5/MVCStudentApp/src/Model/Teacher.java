package Model;

public class Teacher extends User{
        
    private long id;
    private String subjectName;

    public Teacher(String firstName, String secondName, int age, long id, String subjectName) {
        super(firstName, secondName, age);
        this.id = id;
        this.subjectName = subjectName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Teacher: firstName = " + super.getFirstName() + ", secondName = " + super.getSecondName()
         + ", age = " + super.getAge() + ", ID = " + id + ", subjectName = " + subjectName;
        
    }

    
    
}
