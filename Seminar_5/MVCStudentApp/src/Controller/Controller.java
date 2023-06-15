package Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Model.HashModel;
import Model.Student;
import View.View;
import View.ViewEng;

public class Controller {
    private View viewRus;
    private ViewEng viewEng;
    private iGetView view;
    private iGetModel model;
    private List<Student> students;
    private HashModel mapModel;

    

    public Controller(iGetView view, iGetModel model) {
        
        this.view = view;
        this.viewEng = new ViewEng();
        this.viewRus = new View();
        this.model = model;
        this.students = new ArrayList<Student>();
        this.mapModel = new HashModel(model.getAllStudents());
        
    }

    public void getAllStudents(){
        students = model.getAllStudents();
    }

    /**
     * создаем HashMap студентов
     * @return HashMap студентов
     */
    public HashMap<Long, Student> createStudentMap(){
       return mapModel.createStudentMap();
    }

    public boolean testData(){
        if (students.size() > 0) {
            return true;
        } else return false;
    }

    public void update(){

        //MVP
        getAllStudents();
        if (testData()) {
            view.printAllStudents(students);
        } else {
            System.out.println("Список студентов пуст.");
        }

        // MVC
        // view.printAllStudents(model.getAllStudents());
    }

    /**
     * получение списка, русская версия
     */
    public void getListRus(){
        getAllStudents();
        if (testData()) {
            view.printAllStudents(students);
        } else {
            System.out.println("Список студентов пуст!");
        }
    }

    /**
     * получение списка, английская версия
     */
    public void getListEng(){
        getAllStudents();
        if (testData()) {
            view.printAllStudents(students);
        } else {
            System.out.println("Student's list is empty!");
        }
    }

    /**
     * получаем русскую вьюшку
     * @return русскую вьюшку
     */
    public void getViewRus(){     
        view = viewRus;
    }

    /**
     * получаем английскую вьюшку
     * @return английскую вьюшку
     */
    public void getViewEng(){
        view = viewEng;
    }

    /**
     * метод удаления для русского языка
     */
    public void deleteRus(){

        long studentNumber = Long.parseLong(view.prompt("Введите номер студента на удаление: "));
        long sizeBefore = students.size();
        model.deleteFromModelRus(studentNumber);
        long sizeAfter = students.size();
        if (sizeBefore == sizeAfter){
            System.out.println("Студента с id: " + studentNumber + " нельзя удалить, т.к. его нет в данном списке!");
        } else {
            System.out.println("Студент с id: " + studentNumber + " успешно удален!");
        }                       
    }

    /**
     * метод удаления для английского языка
     */
    public void deleteEng(){

        long studentNumber = Long.parseLong(view.prompt("Enter the student's number to delete: "));
        long sizeBefore = students.size();
        model.deleteFromModelEng(studentNumber);
        long sizeAfter = students.size();
        if (sizeBefore == sizeAfter){
            System.out.println("Student with id: " + studentNumber + " cannot be deleted, because he is not in this list!");
        } else {
            System.out.println("Student with id: " + studentNumber + " successfully deleted!");
        }                       
    }

    /**логика вызова/выполнения команд 
     * 
     * @param getNewIteration
     */
    public void getNewIteration(boolean getNewIteration){
        while(getNewIteration){

            if (view.getLanguage().equals("Rus")) {
                                
                String comand = view.prompt("Введите команду: ");
                Comands com = Comands.valueOf(comand.toUpperCase());
                switch (com) {
                    case EXIT:
                        getNewIteration = false;
                        System.out.println("Выход из программы!");
                        break;

                    case LIST:
                        getListRus();
                        //view.printAllStudents(students);
                        break;

                    case DELETE:
                        deleteRus();                        
                        break;
                                                
                    default:
                        break;
                    }
                }

            if (view.getLanguage().equals("Eng")) {
                                
                String comand = view.prompt("Enter the comand: ");
                Comands com = Comands.valueOf(comand.toUpperCase());
                switch (com) {
                    case EXIT:
                        getNewIteration = false;
                        System.out.println("Exit the programm!");
                        break;

                    case LIST:
                        getListEng();
                        //view.printAllStudents(students);
                        break;
                    
                    case DELETE:
                        deleteEng();                        
                        break;

                    default:
                        break;
                    }
                }
            }
        }

    /**
     * запуск программы с учетом языка
     */
    public void run(){
        
        Comands com = Comands.NONE;
        boolean getNewIteration = true;
        String comand = view.prompt("Выберете язык: ");
        com = Comands.valueOf(comand.toUpperCase());
        switch (com) {
            case ENG:
                getViewEng();
                getNewIteration(getNewIteration);
                break;               
             
            case RUS:
                getViewRus();
                getNewIteration(getNewIteration); 
                break;  
                
            default:
                break;
        }

        
    }
}
