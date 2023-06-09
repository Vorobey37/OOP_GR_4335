package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.PersonComparator;
import StudentDomen.Teacher;

public class TeacherService implements iUserService<Teacher> {

    private int count;
    private List<Teacher> teachers;
   
    /**
     * конструктор TeacherService
     */
    public TeacherService() {
        this.teachers = new ArrayList<Teacher> ();
    }


    @Override
    /**
     * этим методом получаем список учитилей
     */
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    /**
     * создает объект учитель, присваивает id и добавляет в список учителей.
     */
    public void create(String firstName, String secondName, int age) {
        Teacher teach = new Teacher(firstName, secondName, age, count, "программирование");
        count++;
        teachers.add(teach);
    }
    
    /**
     * сортируем список учителей
     * @return отсортированный список учителей
     */
    public List<Teacher> getSortedByFIOTeacher(){

        List<Teacher> newTeachList = new ArrayList<Teacher>(teachers);
        newTeachList.sort(new PersonComparator<Teacher>());
        return newTeachList;
    }
}
