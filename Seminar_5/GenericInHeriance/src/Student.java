

public class Student<T extends Comparable<T>, V> extends User<T, V> implements Comparable<Student<T, V>> {
    
    private V id;

    public Student(T firstName, T secondName, V age, V id) {
        super(firstName, secondName, age);
        this.id = id;
    }

    public V getId() {
        return id;
    }

    public void setId(V id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student: firstName = " + super.getFirstName() + ", secondName = " + super.getSecondName()
         + ", age = " + super.getAge() + ", ID = " + id;
    }

    @Override
    public int compareTo(Student<T, V> o) {
        return super.getFirstName().compareTo(o.getFirstName());
    }
    
}
