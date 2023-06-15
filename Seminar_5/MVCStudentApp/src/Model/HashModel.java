package Model;

import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

public class HashModel implements iGetModel {

    private HashMap<Long,Student> studentMap;
    private List<Student> students;
    
    /**
     * конструктор 
     * @param studentMap
     */
    public HashModel(List<Student> students) {
        this.studentMap = new HashMap<Long, Student>();
        this.students = students;
    }

    @Override
    /**
     * переопределили метод интерфейса,
     * возвращает список студентов
     */
    public List<Student> getAllStudents() {
       return students;
    }

    /**
     * создаем HashMap студентов
     * @return
     */
    public HashMap<Long, Student> createStudentMap(){

        for (Student stud : students) {
            studentMap.put(stud.getId(), stud);
        }

        return studentMap;
    }

    @Override
    public void deleteFromModelRus(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteFromModelRus'");
    }

    @Override
    public void deleteFromModelEng(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteFromModelEng'");
    }

    
}
