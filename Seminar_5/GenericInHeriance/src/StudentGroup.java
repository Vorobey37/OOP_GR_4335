
import java.util.Iterator;
import java.util.List;



public class StudentGroup<T extends Comparable<T>, V> implements Iterable<Student<T, V>> {
    private List<Student<T, V>> students;
    private V idGroup;
    

    public StudentGroup(List<Student<T, V>> students, V idGroup) {
        this.students = students;
        this.idGroup = idGroup;
    }

    /**Получает размер группы (количество студентов в группе)
     * @return размер группы
     */
    public int getSizeGroup(){
        return students.size();
    }

    public List<Student<T, V>> getStudents() {
        return students;
    }

    public void setStudents(List<Student<T, V>> students) {
        this.students = students;
    }

    /**
     * Получает номер группы
     * @return номер группы
     */
    public V getId() {
        return idGroup;
    }


    /**Задает номер группы
     * @param idGroup
     */
    public void setId(V idGroup) {
        this.idGroup = idGroup;
    }

    /**Получает строку с именами студентов в группе.
     * @return текстовую строку
     */
    public String studentNameList(){
        String text = "";
        for (Student<T, V> student : students) {
            text = text + student.getFirstName() + " " + student.getSecondName() + ", ";
        }
        return text.substring(0, text.length()-2);
    }

    //public String 

    @Override
    public Iterator<Student<T, V>> iterator() {
        return new Iterator<Student<T, V>>(){
            private int counter;

            @Override
            public boolean hasNext(){
                return counter < students.size();
            }

            @Override
            public Student<T, V> next(){
                if (!hasNext()) {
                    return null;
                }
                return students.get(counter++);
            }
        };
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
