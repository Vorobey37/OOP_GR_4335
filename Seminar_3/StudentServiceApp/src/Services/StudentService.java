package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.PersonComparator;
import StudentDomen.Student;

public class StudentService implements iUserService<Student> {
    private int count;
    List<Student> students;
    public StudentService() {
        this.students = new ArrayList<Student>();
    }
    @Override
    public List<Student> getAll() {
        return students;
    }
    @Override
    public void create(String firstName, String secondName, int age) {
        Student stud = new Student(firstName, secondName, age, count);
        count++;
        students.add(stud);
    }
    
    public List<Student> getSortedByFIOStudents(){

        List<Student> newStudList = new ArrayList<Student>(students);
        newStudList.sort(new PersonComparator<Student>());
        return newStudList;
    }
}
