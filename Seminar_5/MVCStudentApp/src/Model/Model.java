package Model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import Controller.iGetModel;

public class Model implements iGetModel {
    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents(){
        return students;
    }

    @Override
    /**
     * удаление студента из списка по id
     * для русского языка
     */
    public void deleteFromModelRus(long id) {
        int count = 0;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(students.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Студент с таким номером отсутствует!");
        }
    }

    /**
     * удаление студента из списка по id 
     * для английского языка
     * @param id
     */
    public void deleteFromModelEng(long id) {
        int count = 0;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(students.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There is no student with this number!");
        }
    }
    
}
