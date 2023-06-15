package Controller;

import java.util.List;

import Model.Student;

public interface iGetModel {
    public List<Student> getAllStudents();
    public void deleteFromModelRus(long id);
    public void deleteFromModelEng(long id);
}
