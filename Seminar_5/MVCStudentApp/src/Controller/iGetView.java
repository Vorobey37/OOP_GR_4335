package Controller;

import java.util.List;

import Model.Student;

public interface iGetView {

    void printAllStudents(List<Student> students);
    
    String prompt(String message);
    /**
     * Добавил метод получения языка
     * @return язык
     */
    String getLanguage();
}
