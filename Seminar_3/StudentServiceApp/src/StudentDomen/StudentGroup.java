package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> students;
    private int idGroup;
    

    public StudentGroup(List<Student> students, int idGroup) {
        this.students = students;
        this.idGroup = idGroup;
    }

    /**Получает размер группы (количество студентов в группе)
     * @return размер группы
     */
    public int getSizeGroup(){
        return students.size();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /**
     * Получает номер группы
     * @return номер группы
     */
    public int getId() {
        return idGroup;
    }


    /**Задает номер группы
     * @param idGroup
     */
    public void setId(int idGroup) {
        this.idGroup = idGroup;
    }

    /**Получает строку с именами студентов в группе.
     * @return текстовую строку
     */
    public String studentNameList(){
        String text = "";
        for (Student student : students) {
            text = text + student.getFirstName() + " " + student.getSecondName() + ", ";
        }
        return text.substring(0, text.length()-2);
    }

    //public String 

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(students);
    }

    @Override
    /**
     * сначала сортирует по кол-во студентов, а потом по номеру группы.
     * @param o - объект с которым сравниваем.
     * @return данные для сравнения (0, 1, -1)
     */
    public int compareTo(StudentGroup o) {
        if (this.students.size() == o.getSizeGroup()) {
            if (this.idGroup == o.idGroup) {
                return 0;
            }
            if (this.idGroup > o.idGroup) {
                return 1;
            }
            return -1;
        }
        if (this.students.size() > o.getSizeGroup()) {
            return 1;
        }
        return -1;
    }

    @Override
    /**
     * Переопределяет метод toString() на наш лад
     */
    public String toString() {
        return "Группа: " + idGroup + ", количество студентов = " + students.size() + 
        ", список студентов: " + studentNameList();
    }
    
    
}
