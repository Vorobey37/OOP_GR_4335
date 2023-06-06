package StudentDomen;

public class Student extends User implements Comparable<Student> {
    
    private long id;

    public Student(String firstName, String secondName, int age, long id) {
        super(firstName, secondName, age);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student: firstName = " + super.getFirstName() + ", secondName = " + super.getSecondName()
         + ", age = " + super.getAge() + ", ID = " + id;
    }

    @Override
    public int compareTo(Student o) {

        if (super.getAge() == o.getAge()) {
            if (this.id == o.id) {
                return 0;
            }
            if (this.id > o.id) {
                return 1;
            }
            return -1;
        }  
        if (super.getAge() > o.getAge()) {
            return 1;
        } 
        return -1;
        
    }
    
}
