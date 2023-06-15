package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class ViewEng implements iGetView {

    private String language;

    /**
     * конструктор с полем английского языка
     */
    public ViewEng() {
        language = "Eng";
    }

    @Override
    /**
     * вывод студентов с сообщениями на английском
     */
    public void printAllStudents(List<Student> students) {

        System.out.println("--------Output student's list--------");
        for (Student stud : students) {
            System.out.println(stud);
        }
        System.out.println("--------List's end--------");

    }
    @Override
    /**
     * считывание сообщения с консоли
     */
    public String prompt(String message) {
        
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
    @Override
    public String getLanguage() {
        return language;
    }
    
}
